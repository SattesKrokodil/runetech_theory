package net.sattes.coolstuff.util;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.sattes.coolstuff.item.ModItems;

import java.util.*;

public class ModLootTableModifiers {

    //LOW CHANCE FOR GEODE
    private static final Identifier COAL_BLOCK_ID
            = new Identifier("minecraft", "blocks/coal_ore");

    private static final Identifier DEEPSLATE_COAL_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_coal_ore");

    private static final Identifier COPPER_BLOCK_ID
            = new Identifier("minecraft", "blocks/copper_ore");

    private static final Identifier DEEPSLATE_COPPER_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_copper_ore");

    private static final Identifier IRON_BLOCK_ID
            = new Identifier("minecraft", "blocks/iron_ore");

    private static final Identifier DEEPSLATE_IRON_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_iron_ore");

    private static final Identifier GOLD_BLOCK_ID
            = new Identifier("minecraft", "blocks/gold_ore");

    private static final Identifier DEEPSLATE_GOLD_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_gold_ore");

    private static final Identifier DIAMOND_BLOCK_ID
            = new Identifier("minecraft", "blocks/diamond_ore");

    private static final Identifier DEEPSLATE_DIAMOND_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_diamond_ore");

    private static final Identifier REDSTONE_BLOCK_ID
            = new Identifier("minecraft", "blocks/redstone_ore");

    private static final Identifier DEEPSLATE_REDSTONE_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_redstone_ore");

    private static final Identifier LAPIS_BLOCK_ID
            = new Identifier("minecraft", "blocks/lapis_ore");

    private static final Identifier DEEPSLATE_LAPIS_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_lapis_ore");

    private static final Identifier EMERALD_BLOCK_ID
            = new Identifier("minecraft", "blocks/emerald_ore");

    private static final Identifier DEEPSLATE_EMERALD_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_emerald_ore");








    /* #note: keeping this for later
    private static final Identifier IGLOO_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/igloo_chest");
    private static final Identifier CREEPER_ID
            = new Identifier("minecraft", "entities/creeper");
    */

    public static void modifyLootTables() {

        // low chance for geodes

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(COAL_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(DEEPSLATE_COAL_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(COPPER_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(DEEPSLATE_COPPER_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(IRON_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(DEEPSLATE_IRON_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(GOLD_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(DEEPSLATE_GOLD_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(DIAMOND_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(DEEPSLATE_DIAMOND_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(REDSTONE_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(DEEPSLATE_REDSTONE_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(LAPIS_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(DEEPSLATE_LAPIS_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(EMERALD_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));

        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for loot table.

            if(DEEPSLATE_EMERALD_BLOCK_ID.equals(id)) {
                // Adds item to loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.POCKET_GEODE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));
    }

}
