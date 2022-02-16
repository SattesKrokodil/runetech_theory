package net.sattes.coolstuff;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
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
	public static final DefaultParticleType GREEN_FLAME = FabricParticleTypes.simple();

	@Override
	public void onInitialize() {

		Registry.register(Registry.PARTICLE_TYPE, new Identifier("coolstuff", "green_flame"), GREEN_FLAME);
		ModRegistries.registerModStuffs();
		ModItems.registerModItem();
		LOGGER.info("Making stuff cooler ...");
	}
}
