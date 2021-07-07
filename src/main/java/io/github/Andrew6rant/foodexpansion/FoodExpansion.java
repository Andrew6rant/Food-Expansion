package io.github.Andrew6rant.foodexpansion;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FoodExpansion implements ModInitializer {

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier("foodexpansion", "general"),
			() -> new ItemStack(FoodExpansion.bacon));

	public static void registerItem(String itemName, Item item) {
		Registry.register(Registry.ITEM, new Identifier("foodexpansion", itemName), item);
	}

	public static Item bacon = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item bacon_and_egg = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item bat_soup = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item bat_wing = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item beetroot_noodles = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item blaze_cream = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item cactus_fruit = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item carrot_pie = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item carrot_seed_soup = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item chocolate_bar = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item compressed_flesh = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item cooked_bacon = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item cooked_bat_wing = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item cooked_horse_meat = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item cooked_llama_meat = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item cooked_mushroom = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item cooked_ocelot_meat = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item cooked_parrot_meat = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item cooked_polar_bear_meat = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item cooked_squid = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item cooked_wolf_meat = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item dough = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item forbidden_fruit = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item fried_egg = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item golden_feast = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item horse_meat = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item jelly = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item llama_meat = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item lollipop = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item melon_salad = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item nether_wart_soup = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item ocelot_meat = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item parrot_meat = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item polar_bear_meat = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item roasted_seed = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item spider_soup = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item squid = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item starving_fruit = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item veggie_stew = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));
	public static Item wolf_meat = new Item(new Item.Settings().group(FoodExpansion.ITEM_GROUP));



	@Override
	public void onInitialize() {
		registerItem(ItemNames.BACON, bacon);
		registerItem(ItemNames.BACON_AND_EGG, bacon_and_egg);
		registerItem(ItemNames.BAT_SOUP, bat_soup);
		registerItem(ItemNames.BAT_WING, bat_wing);
		registerItem(ItemNames.BEETROOT_NOODLES, beetroot_noodles);
		registerItem(ItemNames.BLAZE_CREAM, blaze_cream);
		registerItem(ItemNames.CACTUS_FRUIT, cactus_fruit);
		registerItem(ItemNames.CARROT_PIE, carrot_pie);
		registerItem(ItemNames.CARROT_SEED_SOUP, carrot_seed_soup);
		registerItem(ItemNames.CHOCOLATE_BAR, chocolate_bar);
		registerItem(ItemNames.COMPRESSED_FLESH, compressed_flesh);
		registerItem(ItemNames.COOKED_BACON, cooked_bacon);
		registerItem(ItemNames.COOKED_BAT_WING, cooked_bat_wing);
		registerItem(ItemNames.COOKED_HORSE_MEAT, cooked_horse_meat);
		registerItem(ItemNames.COOKED_LLAMA_MEAT, cooked_llama_meat);
		registerItem(ItemNames.COOKED_MUSHROOM, cooked_mushroom);
		registerItem(ItemNames.COOKED_OCELOT_MEAT, cooked_ocelot_meat);
		registerItem(ItemNames.COOKED_PARROT_MEAT, cooked_parrot_meat);
		registerItem(ItemNames.COOKED_POLAR_BEAR_MEAT, cooked_polar_bear_meat);
		registerItem(ItemNames.COOKED_SQUID, cooked_squid);
		registerItem(ItemNames.COOKED_WOLF_MEAT, cooked_wolf_meat);
		registerItem(ItemNames.DOUGH, dough);
		registerItem(ItemNames.FORBIDDEN_FRUIT, forbidden_fruit);
		registerItem(ItemNames.FRIED_EGG, fried_egg);
		registerItem(ItemNames.GOLDEN_FEAST, golden_feast);
		registerItem(ItemNames.HORSE_MEAT, horse_meat);
		registerItem(ItemNames.JELLY, jelly);
		registerItem(ItemNames.LLAMA_MEAT, llama_meat);
		registerItem(ItemNames.LOLLIPOP, lollipop);
		registerItem(ItemNames.MELON_SALAD, melon_salad);
		registerItem(ItemNames.NETHER_WART_SOUP, nether_wart_soup);
		registerItem(ItemNames.OCELOT_MEAT, ocelot_meat);
		registerItem(ItemNames.PARROT_MEAT, parrot_meat);
		registerItem(ItemNames.POLAR_BEAR_MEAT, polar_bear_meat);
		registerItem(ItemNames.ROASTED_SEED, roasted_seed);
		registerItem(ItemNames.SPIDER_SOUP, spider_soup);
		registerItem(ItemNames.SQUID, squid);
		registerItem(ItemNames.STARVING_FRUIT, starving_fruit);
		registerItem(ItemNames.VEGGIE_STEW, veggie_stew);
		registerItem(ItemNames.WOLF_MEAT, wolf_meat);
	}
}
