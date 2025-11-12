package net.zerrithefox.overhaulcooking.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zerrithefox.overhaulcooking.OverhaulCooking;

public class ModItemGroups {

    public static final ItemGroup Tools = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OverhaulCooking.MOD_ID, "overhaul_cooking_tools"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SPOON))
                    .displayName(Text.translatable("itemgroup.overhaulcooking.overhaul_cooking_tools"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MASHER);
                        entries.add(ModItems.SPOON);
                        entries.add(ModItems.KNIFE);
                        entries.add(ModItems.WHISK);
                        entries.add(ModItems.MORTAR);
                        entries.add(ModItems.ROLLING_PIN);
                        entries.add(ModItems.SPATULA);
                    }).build());



}
