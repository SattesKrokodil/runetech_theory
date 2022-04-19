package net.sattes.runetech_theory.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sattes.runetech_theory.RunetechTheory;
import net.sattes.runetech_theory.entity.custom.TestEntity;

public class ModEntities {
    public static final EntityType<TestEntity> TEST = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(RunetechTheory.MOD_ID, "test_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TestEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f,0.3f)).build());

}
