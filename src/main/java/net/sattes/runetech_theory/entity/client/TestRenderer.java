package net.sattes.runetech_theory.entity.client;


import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.sattes.runetech_theory.RunetechTheory;
import net.sattes.runetech_theory.entity.custom.TestEntity;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TestRenderer extends GeoEntityRenderer<TestEntity> {

    public TestRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new TestModel());
    }

    @Override
    public Identifier getTextureLocation(TestEntity entity) {
        return new Identifier(RunetechTheory.MOD_ID, "textures/entity/test/test.png");
    }
}
