package net.zerrithefox.overhaulcooking;

import net.fabricmc.api.ModInitializer;

import net.zerrithefox.overhaulcooking.block.ModBlocks;
import net.zerrithefox.overhaulcooking.items.ModItemGroups;
import net.zerrithefox.overhaulcooking.items.ModItems;
import net.zerrithefox.recipe.ModRecipes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OverhaulCooking implements ModInitializer {
	public static final String MOD_ID = "overhaul-cooking";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModRecipes.registerRecipes();
	}
}