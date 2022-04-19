package net.sattes.runetech_theory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sattes.runetech_theory.block.ModBlocks;
import net.sattes.runetech_theory.item.ModItems;
import net.sattes.runetech_theory.professions.AddPlayerExGui;
import net.sattes.runetech_theory.util.ModLootTableModifiers;
import net.sattes.runetech_theory.util.ModRegistries;
import net.sattes.runetech_theory.util.StatusEffectRegistry;
import org.lwjgl.system.CallbackI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunetechTheory implements ModInitializer {

	public static final String MOD_ID = "runetech_theory";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
	public static final DefaultParticleType BLOOD_DRIPPING = FabricParticleTypes.simple();
	public static final DefaultParticleType BUFF = FabricParticleTypes.simple();

	@Override
	public void onInitialize() {

		Registry.register(Registry.PARTICLE_TYPE, new Identifier("runetech_theory", "blood_dripping"), BLOOD_DRIPPING);
		Registry.register(Registry.PARTICLE_TYPE, new Identifier("runetech_theory", "buff"), BUFF);
		StatusEffectRegistry.registerStatusEffects();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModRegistries.registerModStuffs();
		ModItems.registerModItem();
		LOGGER.info("Thinking about runes ...");


	}
}
