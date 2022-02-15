package net.sattes.coolstuff.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.sattes.coolstuff.CoolStuff;
import net.sattes.coolstuff.item.ModItems;


public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        System.out.println("Registering Fuels for + " + CoolStuff.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        //  400/20 = 20 seconds
        registry.add(ModItems.RESIN_FLASK, 18000);
    }
}


