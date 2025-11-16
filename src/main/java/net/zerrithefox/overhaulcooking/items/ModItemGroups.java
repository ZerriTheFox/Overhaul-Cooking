package net.zerrithefox.overhaulcooking.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zerrithefox.overhaulcooking.OverhaulCooking;
import net.zerrithefox.overhaulcooking.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup Cooking = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OverhaulCooking.MOD_ID, "overhaul_cooking"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SPOON))
                    .displayName(Text.translatable("itemgroup.overhaul-cooking.overhaul_cooking"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MASHER);
                        entries.add(ModItems.SPOON);
                        entries.add(ModItems.KNIFE);
                        entries.add(ModItems.WHISK);
                        entries.add(ModItems.PESTLE);
                        entries.add(ModItems.ROLLING_PIN);
                        entries.add(ModBlocks.CUTTINGBOARD);
                        entries.add(ModBlocks.MILLSTONE);
                        entries.add(ModBlocks.MORTAR);
                        entries.add(ModBlocks.MIXBOWL);
                        entries.add(ModBlocks.FERMENTBARREL);
                        entries.add(ModBlocks.OVEN);
                        entries.add(ModBlocks.PAN);
                        entries.add(ModBlocks.POT);
                        entries.add(ModBlocks.PRESS);
                    }).build());

    public static void registerItemGroups() {
        OverhaulCooking.LOGGER.info("Registering Item Groups for " + OverhaulCooking.MOD_ID);
    }

}
