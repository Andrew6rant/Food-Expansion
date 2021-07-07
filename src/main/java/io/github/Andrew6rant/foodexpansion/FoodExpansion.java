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

	@Override
	public void onInitialize() {
		registerItem(ItemNames.BACON, bacon);
	}
}
