package com.allforfunmc.CamoStuff;


import com.allforfunmc.allforfuncore.Core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CamoArmor extends ItemArmor {
    
    private String texturePath = "sleshymod:textures/models/";

    public CamoArmor(ArmorMaterial material, int id, int place) {
            super(material, id, place);
           
            this.setMaxStackSize(1);
            this.setCreativeTab(Core.AllForFunArmor);
            this.setTextures(place);
    }
   
    private void setTextures(int part){
            if (part == 0){
                    this.setTextureName("sleshymod:Camo_helmet");
            }if (part == 1){
                    this.setTextureName("sleshymod:Camo_chestplate");
            }if (part == 2){
                    this.setTextureName("sleshymod:Camo_leggings");
            }if (part == 3){
                    this.setTextureName("sleshymod:Camo_boots");
            }
    }
   
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
            if (slot == 0 || slot == 1 || slot == 3){
                    return "sleshymod:textures/models/camo_layer_1.png";
            }else{
                    return "sleshymod:textures/models/camo_layer_2.png";
            }
    }
   
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register){
            this.itemIcon = register.registerIcon("sleshymod:" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }
   
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer){
            return this.texturePath;
    }

}