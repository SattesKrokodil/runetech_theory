package net.sattes.coolstuff;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.particle.*;
import net.minecraft.client.util.InputUtil;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Identifier;
import net.sattes.coolstuff.gui.PlayerGui;
import net.sattes.coolstuff.gui.PlayerGuiScreen;
import org.lwjgl.glfw.GLFW;

@Environment(EnvType.CLIENT)
public class CoolStuffClient implements ClientModInitializer {

    private static KeyBinding keyBinding;

    @Override
    public void onInitializeClient() {
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("coolstuff", "particle/blood_dripping"));
        }));

        ParticleFactoryRegistry.getInstance().register(CoolStuff.BLOOD_DRIPPING, WaterSplashParticle.SplashFactory::new);


        keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.coolstuff.test",
                InputUtil.Type.KEYSYM, // KEYSYM for keyboard, MOUSE for mouse.
                GLFW.GLFW_KEY_R, // The keycode of the key
                "category.coolstuff.test" // The translation key of the keybinding's category.
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (keyBinding.wasPressed()) {
                client.player.sendMessage(new LiteralText("Key 1 was pressed!"), false);
                MinecraftClient.getInstance().setScreen(new PlayerGuiScreen(new PlayerGui(client)));
            }
        });
    }


}
