package com.allforfunmc.allforfuncore;

import net.minecraft.item.ItemAxe;

public class TemplateAxe extends ItemAxe {
    public TemplateAxe(ToolMaterial mat) {
	super(mat);
	this.setMaxStackSize(1);
	this.setCreativeTab(Core.AllForFunTools);
    }
}
