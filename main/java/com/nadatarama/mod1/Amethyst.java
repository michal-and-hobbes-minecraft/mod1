package com.nadatarama.mod1;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

class Amethyst extends Item {
	public Amethyst() {
		this.setUnlocalizedName("amethyst");
		// setRegistryName(name);
		this.setCreativeTab(CreativeTabs.MISC);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		System.err.println("TRYING TO SPAWN A CHICKEN");
		worldIn.spawnEntity(new EntityChicken(worldIn));

		return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}

}