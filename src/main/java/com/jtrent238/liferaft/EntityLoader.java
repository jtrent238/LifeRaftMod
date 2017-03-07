package com.jtrent238.liferaft;

import com.jtrent238.liferaft.entity.EntityRaft;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.model.ModelOcelot;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntitySheep;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityLoader {

	



	public static void LoadEntitys() {
		
	
	    EntityRegistry.registerGlobalEntityID(EntityRaft.class, "EntityRaft",EntityRegistry.findGlobalUniqueEntityId());
	   

    	}
	{
	
	}
	//

}
