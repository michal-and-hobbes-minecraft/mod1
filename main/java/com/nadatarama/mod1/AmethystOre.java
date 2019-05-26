package com.nadatarama.mod1;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

class AmethystOre extends Block {

	public AmethystOre() {
		super(Material.ROCK);
		this.setUnlocalizedName("amethyst_ore");
		// setRegistryName(name);
		this.setCreativeTab(CreativeTabs.DECORATIONS);
		this.setHardness(4F);
		this.setHarvestLevel("pickaxe", 0);
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
		drops.add(new ItemStack(Mod1.amethyst, (RANDOM.nextInt(10) + 1) * (fortune + 1)));
		if (RANDOM.nextBoolean()) {
			drops.add(new ItemStack(Items.DIAMOND, 1));
		} else {
			drops.add(new ItemStack(Items.POISONOUS_POTATO, 1));
		}
	}
}