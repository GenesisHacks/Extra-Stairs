package net.genesis.extrastairs.item;

import net.genesis.extrastairs.ExtraStairs;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ExtraStairs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExtraStairs.LOGGER.debug("Registering Mod Items for " + ExtraStairs.MOD_ID);
    }

}
