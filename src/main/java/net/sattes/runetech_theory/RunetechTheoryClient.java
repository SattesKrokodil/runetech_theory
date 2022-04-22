package net.sattes.runetech_theory;

import com.github.clevernucleus.playerex.api.client.PageRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.particle.*;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.sattes.runetech_theory.entity.ModEntities;
import net.sattes.runetech_theory.entity.client.TestRenderer;
import net.sattes.runetech_theory.gui.TestPageLayer;


@Environment(EnvType.CLIENT)
public class RunetechTheoryClient implements ClientModInitializer {
    public static final Identifier TEST_PAGE = new Identifier("runetech_theory", "test");

    @Override
    public void onInitializeClient() {
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("runetech_theory", "particle/blood_dripping"));
        }));

        ParticleFactoryRegistry.getInstance().register(RunetechTheory.BLOOD_DRIPPING, WaterSplashParticle.SplashFactory::new);

        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("runetech_theory", "particle/buff"));
        }));

        ParticleFactoryRegistry.getInstance().register(RunetechTheory.BUFF, EmotionParticle.HeartFactory::new);

        EntityRendererRegistry.register(ModEntities.TEST, TestRenderer::new);

        PageRegistry.registerPage(TEST_PAGE, new Identifier("runetech_theory", "textures/gui/combat.png"), new TranslatableText("runetech_theory.gui.page.test_page.title"));
        PageRegistry.registerLayer(TEST_PAGE, TestPageLayer::new);

    }
}