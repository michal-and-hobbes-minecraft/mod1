package com.nadatarama.mod1;

import com.nadatarama.mod1.objects.armor.AmethystArmor;
import com.nadatarama.mod1.objects.armor.AmethystBoots;
import com.nadatarama.mod1.objects.tools.AmethystAxe;
import com.nadatarama.mod1.objects.tools.AmethystHoe;
import com.nadatarama.mod1.objects.tools.AmethystPickaxe;
import com.nadatarama.mod1.objects.tools.AmethystShovel;
import com.nadatarama.mod1.objects.tools.AmethystSword;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Mod1.MODID, name = Mod1.NAME, version = Mod1.VERSION)
@Mod.EventBusSubscriber(modid = Mod1.MODID)
public class Mod1 {
	public static final String MODID = "mod1";
	public static final String NAME = "Mod1";
	public static final String VERSION = "1.0.0";

	@Mod.Instance(Mod1.MODID)
	public static Mod1 instance;

	// items
	@GameRegistry.ObjectHolder(Mod1.MODID + ":amethyst")
	public static final Item amethyst = new Amethyst();

	// blocks
	@GameRegistry.ObjectHolder(Mod1.MODID + ":amethyst_ore")
	public static final Block amethystOre = new AmethystOre();
	@GameRegistry.ObjectHolder(Mod1.MODID + ":amethyst_block")
	public static final Block amethystBlock = new AmethystBlock();

	// materials
	// for now, a copy of diamond
	public static final ToolMaterial amethystTool = EnumHelper.addToolMaterial("amethyst_tool", 3, 3122, 8.0F, 3.0F,
			10);
	// for now, a copy of diamond
	public static final ArmorMaterial amethystArmor = EnumHelper.addArmorMaterial("amethyst_armor",
			Mod1.MODID + ":amethyst", 33, new int[] { 3, 6, 8, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

	// tools
	@GameRegistry.ObjectHolder(Mod1.MODID + ":amethyst_axe")
	public static final Item amethystAxe = new AmethystAxe("amethyst_axe", amethystTool);
	@GameRegistry.ObjectHolder(Mod1.MODID + ":amethyst_hoe")
	public static final Item amethystHoe = new AmethystHoe("amethyst_hoe", amethystTool);
	@GameRegistry.ObjectHolder(Mod1.MODID + ":amethyst_pickaxe")
	public static final Item amethystPickaxe = new AmethystPickaxe("amethyst_pickaxe", amethystTool);
	@GameRegistry.ObjectHolder(Mod1.MODID + ":amethyst_shovel")
	public static final Item amethystShovel = new AmethystShovel("amethyst_shovel", amethystTool);
	@GameRegistry.ObjectHolder(Mod1.MODID + ":amethyst_sword")
	public static final Item amethystSword = new AmethystSword("amethyst_sword", amethystTool);

	// armor
	@GameRegistry.ObjectHolder(Mod1.MODID + ":amethyst_helmet")
	public static final Item amethystHelmet = new AmethystArmor("amethyst_helmet", amethystArmor, 1,
			EntityEquipmentSlot.HEAD);
	@GameRegistry.ObjectHolder(Mod1.MODID + ":amethyst_chestplate")
	public static final Item amethystChestplate = new AmethystArmor("amethyst_chestplate", amethystArmor, 1,
			EntityEquipmentSlot.CHEST);
	@GameRegistry.ObjectHolder(Mod1.MODID + ":amethyst_leggings")
	public static final Item amethystLeggings = new AmethystArmor("amethyst_leggings", amethystArmor, 2,
			EntityEquipmentSlot.LEGS);
	@GameRegistry.ObjectHolder(Mod1.MODID + ":amethyst_boots")
	public static final Item amethystBoots = new AmethystBoots();

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new Mod1WorldGenerator(amethystOre, 6), 0);
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(amethystOre.setRegistryName(Mod1.MODID, "amethyst_ore"),
				amethystBlock.setRegistryName(Mod1.MODID, "amethyst_block"));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(amethyst.setRegistryName(Mod1.MODID, "amethyst"),
				amethystAxe.setRegistryName(Mod1.MODID, "amethyst_axe"),
				amethystBoots.setRegistryName(Mod1.MODID, "amethyst_boots"),
				amethystChestplate.setRegistryName(Mod1.MODID, "amethyst_chestplate"),
				amethystHelmet.setRegistryName(Mod1.MODID, "amethyst_helmet"),
				amethystHoe.setRegistryName(Mod1.MODID, "amethyst_hoe"),
				amethystLeggings.setRegistryName(Mod1.MODID, "amethyst_leggings"),
				amethystPickaxe.setRegistryName(Mod1.MODID, "amethyst_pickaxe"),
				amethystShovel.setRegistryName(Mod1.MODID, "amethyst_shovel"),
				amethystSword.setRegistryName(Mod1.MODID, "amethyst_sword"));
	}

	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new ItemBlock(amethystOre) {
		}.setRegistryName(amethystOre.getRegistryName()), new ItemBlock(amethystBlock) {
		}.setRegistryName(amethystBlock.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(amethystOre));
		registerRender(Item.getItemFromBlock(amethystBlock));
		registerRender(amethyst);
		registerRender(amethystSword);
		registerRender(amethystHelmet);
		registerRender(amethystBoots);
		registerRender(amethystChestplate);
		registerRender(amethystHoe);
		registerRender(amethystPickaxe);
		registerRender(amethystShovel);
		registerRender(amethystAxe);
		registerRender(amethystLeggings);
	}

	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	public Mod1() {
		instance = this;
	}
}
