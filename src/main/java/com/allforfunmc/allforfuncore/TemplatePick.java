package com.allforfunmc.allforfuncore;

import net.minecraft.item.ItemPickaxe;

public class TemplatePick extends ItemPickaxe{
	public TemplatePick(ToolMaterial mat){
		super(mat);
		this.setMaxStackSize(1);
		this.setCreativeTab(Core.AllForFunTools);
	}
}
