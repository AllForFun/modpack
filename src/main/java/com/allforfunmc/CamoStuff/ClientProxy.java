package com.allforfunmc.CamoStuff;


import com.allforfunmc.CamoStuff.camochest.CamoChestRenderer;
import com.allforfunmc.CamoStuff.camochest.ItemRendererCamoChest;
import com.allforfunmc.CamoStuff.camochest.TileEntityCamoChest;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;


public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderers() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCamoChest.class, new CamoChestRenderer());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Main.CamoChest), new ItemRendererCamoChest());
    }

}
