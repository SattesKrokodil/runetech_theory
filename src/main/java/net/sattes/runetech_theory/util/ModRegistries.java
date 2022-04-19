package net.sattes.runetech_theory.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;

import net.sattes.runetech_theory.RunetechTheory;
import net.sattes.runetech_theory.entity.ModEntities;
import net.sattes.runetech_theory.entity.custom.TestEntity;
import net.sattes.runetech_theory.item.ModItems;




public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerAttributes();
    }

    private static void registerFuels() {
        System.out.println("Registering Fuels for + " + RunetechTheory.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        //  400/20 = 20 seconds
        registry.add(ModItems.RESIN_FLASK, 18000);
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.TEST, TestEntity.setAttributes());
    }

}


