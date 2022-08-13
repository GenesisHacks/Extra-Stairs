package net.genesis.extrastairs;

import net.fabricmc.api.ModInitializer;
import net.genesis.extrastairs.block.ModBlocks;
import net.genesis.extrastairs.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraStairs implements ModInitializer {

	public static final String MOD_ID = "extra_stairs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


	}

}
