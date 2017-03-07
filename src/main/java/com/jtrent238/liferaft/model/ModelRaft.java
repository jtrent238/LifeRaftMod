// Date: 8/4/2016 9:58:58 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.jtrent238.liferaft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRaft extends ModelBase
{
  //fields
    ModelRenderer Base;
    ModelRenderer Wall1;
    ModelRenderer Wall2;
    ModelRenderer Wall3;
    ModelRenderer Wall4;
  
  public ModelRaft()
  {
    textureWidth = 512;
    textureHeight = 512;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 50, 3, 50);
      Base.setRotationPoint(-25F, 23F, -25F);
      Base.setTextureSize(512, 512);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Wall1 = new ModelRenderer(this, 112, 219);
      Wall1.addBox(0F, 0F, 0F, 50, 8, 4);
      Wall1.setRotationPoint(-25F, 15F, -25F);
      Wall1.setTextureSize(512, 512);
      Wall1.mirror = true;
      setRotation(Wall1, 0F, 0F, 0F);
      Wall2 = new ModelRenderer(this, 0, 133);
      Wall2.addBox(0F, 0F, 0F, 50, 8, 4);
      Wall2.setRotationPoint(-25F, 15F, 21F);
      Wall2.setTextureSize(512, 512);
      Wall2.mirror = true;
      setRotation(Wall2, 0F, 0F, 0F);
      Wall3 = new ModelRenderer(this, 0, 64);
      Wall3.addBox(0F, 0F, 0F, 4, 8, 50);
      Wall3.setRotationPoint(22F, 15F, -25F);
      Wall3.setTextureSize(512, 512);
      Wall3.mirror = true;
      setRotation(Wall3, 0F, 0F, 0F);
      Wall4 = new ModelRenderer(this, 0, 173);
      Wall4.addBox(0F, 0F, 0F, 4, 8, 50);
      Wall4.setRotationPoint(-25F, 15F, -25F);
      Wall4.setTextureSize(512, 512);
      Wall4.mirror = true;
      setRotation(Wall4, 0F, 0F, 0F);
  }
  
  public ModelRaft(Object object, int i, int j, int k) {
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Base.render(f5);
    Wall1.render(f5);
    Wall2.render(f5);
    Wall3.render(f5);
    Wall4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}