package com.nadatarama.mod1.objects.armor;

import com.nadatarama.mod1.Mod1;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class AmethystBoots extends AmethystArmor {

	public AmethystBoots() {
		super("amethyst_boots", Mod1.amethystArmor, 1, EntityEquipmentSlot.FEET);
		System.err.println("CREATING SPECIALTY AMETHYST BOOTS");
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
		System.err.println("TRYING TO TURN INVISIBLE FROM BOOTS ON DROP");
		player.setInvisible(!player.isInvisible());
		return super.onDroppedByPlayer(item, player);
	}
}
