package com.nadatarama.mod1.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class AmethystPickaxe extends ItemPickaxe {

	public AmethystPickaxe(String name, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name);
		// this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
}
