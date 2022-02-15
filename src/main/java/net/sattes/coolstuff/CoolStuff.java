package net.sattes.coolstuff;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.sattes.coolstuff.item.ModItems;
import net.sattes.coolstuff.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolStuff implements ModInitializer {

	public static final String MOD_ID = "coolstuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}

	@Override
	public void onInitialize() {

		ModRegistries.registerModStuffs();
		ModItems.registerModItem();
		LOGGER.info("Making stuff cooler ...");
	}
}
