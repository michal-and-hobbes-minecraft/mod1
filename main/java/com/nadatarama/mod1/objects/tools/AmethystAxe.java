package com.nadatarama.mod1.objects.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

public class AmethystAxe extends ItemTool {

	private static Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2,
			Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN);

	public AmethystAxe(String name, ToolMaterial materialIn) {
		super(materialIn, EFFECTIVE_ON);
		this.setUnlocalizedName(name);
		// this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
