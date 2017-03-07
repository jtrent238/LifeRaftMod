package com.jtrent238.liferaft.client;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.renderer.entity.RenderBoat;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderFish;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;

import com.jtrent238.liferaft.common.CommonProxy;
import com.jtrent238.liferaft.entity.EntityRaft;
import com.jtrent238.liferaft.model.ModelRaft;
import com.jtrent238.liferaft.renderer.entity.RenderRaft;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.SideOnly;


public class ClientProxy extends CommonProxy {
  public void init(FMLInitializationEvent e) {
    super.init (e);
    //System.out.print("client init fired!");
    
    // Register client-specific stuff (e.g. renderer & packet-handler callback etc)
  
    
    RenderingRegistry.registerEntityRenderingHandler(EntityRaft.class, new RenderEntity(){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("liferaft:Raft.png");}});//Small Blockling Render
    
		
    	
  }
	
}
