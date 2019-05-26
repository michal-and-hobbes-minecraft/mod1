package com.nadatarama.mod1.objects.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class AmethystArmor extends ItemArmor {

	public AmethystArmor(String name, ArmorMaterial materialIn, int renderIndexIn,
			EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(name);
		// this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
