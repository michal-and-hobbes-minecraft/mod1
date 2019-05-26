package com.nadatarama.mod1.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class AmethystHoe extends ItemHoe {

	public AmethystHoe(String name, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name);
		// this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
}
