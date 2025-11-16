package net.zerrithefox.overhaulcooking.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.zerrithefox.overhaulcooking.OverhaulCooking;

public class ModBlocks {

    public static final Block MILLSTONE = registerBlock("millstone",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PRESS = registerBlock("press",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block MORTAR = registerBlock("mortar",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CUTTINGBOARD = registerBlock("cutting_board",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool()
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FERMENTBARREL = registerBlock("fermenting_barrel",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block POT = registerBlock("cooking_pot",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block PAN = registerBlock("pan",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block MIXBOWL = registerBlock("mixing_bowl",
            new MixingBowlBlock(AbstractBlock.Settings.create().nonOpaque));

    public static final Block OVEN = registerBlock("oven",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

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
