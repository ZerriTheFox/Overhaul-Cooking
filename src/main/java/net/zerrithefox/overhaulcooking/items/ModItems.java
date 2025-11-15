package net.zerrithefox.overhaulcooking.items;

import net.minecraft.item.Item;
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

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(OverhaulCooking.MOD_ID, name), item);
    }

    public static void registerModItems() {
                OverhaulCooking.LOGGER.info("Registering Mod Items for " + OverhaulCooking.MOD_ID);

    }


}
