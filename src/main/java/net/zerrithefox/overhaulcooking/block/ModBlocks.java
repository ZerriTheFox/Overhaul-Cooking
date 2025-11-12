package net.zerrithefox.overhaulcooking.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.zerrithefox.overhaulcooking.OverhaulCooking;

public class ModBlocks {

    public static final Block MILLSTONE = registerBlock("millstone",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CUTTINGBOARD = registerBlock("cutting_board",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool()
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block CHURN = registerBlock("churn",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool()
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block DRYINGRACK = registerBlock("drying_rack",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FERMENTJAR = registerBlock("fermenting_jar",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .sounds(BlockSoundGroup.GLASS)));

    public static final Block COOKPOT = registerBlock("cooking_pot",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block GRILL = registerBlock("grill",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block STEAMER = registerBlock("STEAMER",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.BAMBOO)));

    public static final Block MIXBOWL = registerBlock("mixing_bowl",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(OverhaulCooking.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(OverhaulCooking.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        OverhaulCooking.LOGGER.info("Registering Mod Block for " + OverhaulCooking.MOD_ID);

        }
}
