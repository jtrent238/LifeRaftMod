package com.jtrent238.liferaft;

import java.util.Random;

import com.jtrent238.liferaft.common.CommonProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid="liferaft", name="jtrent238's Life Raft Mod", version=(LifeRaftMod.MODVERSION))
public class LifeRaftMod
{

	@SidedProxy(clientSide="com.jtrent238.liferaft.client.ClientProxy", serverSide="com.jtrent238.liferaft.common.CommonProxy")
	public static CommonProxy proxy;
	
	public static final String MODID = "liferaft";
    
   

	//structureTntSword jtrent238_0 = new structureTntSword();
	//itemTNTSwordSpawner jtrent238_1 = new itemTNTSwordSpawner();

	@Instance(MODID)
    public static LifeRaftMod instance;
	public static final String MODVERSION = "1.0.0.0";
	public static final String MODNAME = "jtrent238's Life Raft Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "[1.7.10]";
	
	public static CrashReportCategory CRASHINFO;
	public static NBTTagCompound NBTJOIN;



	private Object obj;
	private String villageblacksmith;
	private Random rnd;
	private String dungeon;
	private String bonus;
	private String stronglib;
	private String strongcross;
	private String dispenser;
	private String strongholdcorridor;
	private String junglechest;
	private String desertchest;
	private String minecorridor;

	private Object network;

	//@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	public static Random rand;

	private static int p_i1986_1_;
	
	// Version checking instance
	//public static VersionChecker versionChecker;
	//public static boolean haveWarnedVersionOutOfDate = false;
	
	//Enchantments
	
	
		

@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	/*
	//Achievements
	Achievements.loadAchievements();
	Achievements.registerPage();
    */
	
	//FMLCommonHandler.instance().bus().register(new OnJoinEvent());
	
	 network = NetworkRegistry.INSTANCE.newSimpleChannel("MyChannel");
     //network.registerMessage(MyMessage.Handler.class, MyMessage.class, 0, Side.SERVER);
     // network.registerMessage(SecondMessage.Handler.class, SecondMessage.class, 1, Side.CLIENT);
     // ...
	

}


private void setHarvestLevel(String string, int i) {

	
}

@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	proxy.init(event);
	BlockLoader.loadBlocks();
	ItemLoader.LoadItems();
	EntityLoader.LoadEntitys();
	//TileEntityLoader.mainRegistry();
	
	
	//Achievements.loadAchievements();
	//ModLoader.LoadMods();
	//InventoryLoader.LoadInventorys();
	//SoundEvents.LoadSounds();
	Recipes.registerRecpies();
	
	//GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);

	
	
	//MinecraftForge.addGrassSeed(new ItemStack(FoodModItems.StrawberrySeeds), 5);
	//NetworkRegistry.instance().registerGuiHandler(instance, guiHandler);
	//Not Implemented Yet//NetworkRegistry.INSTANCE.registerGuiHandler(FridgeGUI.instance, new GuiHandler());
	//GameRegistry.registerWorldGenerator(mStructureGenerator);

	// iterate through all the villager types and add their new trades
		/*for (int i = 0; i < 5; ++i) {
			VillagerRegistry.instance().registerVillageTradeHandler(i, new TradeHandler());
		}*/
		
		
}


public static CreativeTabs LifeRaftMod = new CreativeTabs("LifeRaftMod")

{
	public Item getTabIconItem() {

		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "LifeRaftMod.png";
	}
	
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	
	}
	
;







@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {
	{
		//MinecraftForge.EVENT_BUS.register(new WorldGenModFlower(null));
	    Recipes.registerRecpies();

	}
	
	
}



}
