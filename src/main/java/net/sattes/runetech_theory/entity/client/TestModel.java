package net.sattes.runetech_theory.entity.client;

import net.minecraft.util.Identifier;
import net.sattes.runetech_theory.RunetechTheory;
import net.sattes.runetech_theory.entity.custom.TestEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TestModel extends AnimatedGeoModel<TestEntity> {
    @Override
    public Identifier getModelLocation(TestEntity object) {
        return new Identifier(RunetechTheory.MOD_ID, "geo/test.geo.json");
    }

    @Override
    public Identifier getTextureLocation(TestEntity object) {
        return new Identifier(RunetechTheory.MOD_ID, "textures/entity/test/test.png");
    }

    @Override
    public Identifier getAnimationFileLocation(TestEntity animatable) {
        return new Identifier(RunetechTheory.MOD_ID, "animations/test.animation.json");
    }
}
