package com.jtrent238.liferaft;

import cpw.mods.fml.common.registry.GameRegistry;
import javafx.scene.paint.Color;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;

public class BlockLoader {

	//public static Block blockFartBomb;

	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		
		//blockFartBomb = new blockFartBomb().setBlockName("blockFartBomb").setBlockTextureName("epicproportionsmod:blockFartBomb").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		
		
		
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks(){
		
		//GameRegistry.registerBlock(blockFartBomb, "blockFartBomb");
		
	}
	
	
}
