package net.sattes.coolstuff;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.particle.BlockLeakParticle;
import net.minecraft.client.particle.CampfireSmokeParticle;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class CoolStuffClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("coolstuff", "particle/green_flame"));
        }));

        ParticleFactoryRegistry.getInstance().register(CoolStuff.GREEN_FLAME, CampfireSmokeParticle.CosySmokeFactory::new);
    }

}
