package net.genesis.extrastairs.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.genesis.extrastairs.ExtraStairs;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    public static final Block HAY_STAIRS = registerBlock("hay_stairs",
            new StairsBlock(HAY_BLOCK.getDefaultState(), FabricBlockSettings.copy(HAY_BLOCK)), ItemGroup.BUILDING_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ExtraStairs.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ExtraStairs.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
    }
}
