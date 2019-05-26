package com.nadatarama.mod1.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class AmethystShovel extends ItemSpade {

	public AmethystShovel(String name, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name);
		// this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
}
