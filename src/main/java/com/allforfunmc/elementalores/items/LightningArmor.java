package com.elementalores.items;

import com.elementalores.elementaloresmod.BlocksAndItems;
import com.elementalores.elementaloresmod.ElementalOresMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class LightningArmor extends ItemArmor {
    
    private String texturePath = "sleshymod:textures/models/";

    public LightningArmor(ArmorMaterial material, int id, int place) {
            super(material, id, place);
           
            this.setMaxStackSize(1);
            this.setCreativeTab(BlocksAndItems.moditemsTab);
            this.setTextures(place);
    }
   
    private void setTextures(int part){
            if (part == 0){
                    this.setTextureName("sleshymod:Lightning_helmet");
            }if (part == 1){
                    this.setTextureName("sleshymod:Lightning_chestplate");
            }if (part == 2){
                    this.setTextureName("sleshymod:Lightning_leggings");
            }if (part == 3){
                    this.setTextureName("sleshymod:Lightning_boots");
            }
    }
   
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
            if (slot == 0 || slot == 1 || slot == 3){
                    return "sleshymod:textures/models/lightning_layer_1.png";
            }else{
                    return "sleshymod:textures/models/lightning_layer_2.png";
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