package net.zerrithefox.overhaulcooking.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zerrithefox.overhaulcooking.OverhaulCooking;

public class ModItems {

    public static final Item MASHER = registerItem("masher", new Item(new Item.Settings()) {

    });
    public static final Item KNIFE = registerItem("knife", new Item(new Item.Settings()) {

    });
    public static final Item WHISK = registerItem("whisk", new Item(new Item.Settings()) {

    });
    public static final Item ROLLING_PIN = registerItem("rolling_pin", new Item(new Item.Settings()) {

    });
    public static final Item PESTLE = registerItem("pestle", new Item(new Item.Settings()) {

    });
    public static final Item SPOON = registerItem("spoon", new Item(new Item.Settings()) {

    });


    public static final Item MASHEDPOTATOES = registerItem("mashed_potatoes", new Item(new Item.Settings().food(ModFoodComponents.MASHEDPOTATOES)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(OverhaulCooking.MOD_ID, name), item);
    }

    public static void registerModItems() {
                OverhaulCooking.LOGGER.info("Registering Mod Items for " + OverhaulCooking.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(MASHER);
            entries.add(KNIFE);
            entries.add(WHISK);
            entries.add(ROLLING_PIN);
            entries.add(PESTLE);
            entries.add(SPOON);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(MASHEDPOTATOES);
        });

    }


}
