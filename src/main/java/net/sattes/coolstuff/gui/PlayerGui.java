package net.sattes.coolstuff.gui;


import io.github.apace100.apoli.component.PowerHolderComponent;
import io.github.apace100.apoli.power.PowerType;
import io.github.apace100.apoli.power.PowerTypeRegistry;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.*;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;


@Environment(EnvType.CLIENT)

public class PlayerGui extends LightweightGuiDescription {

    public PlayerGui(MinecraftClient client) {
        PlayerEntity entity = client.player;

        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(200, 200);
        root.setInsets(Insets.ROOT_PANEL);

        WSprite icon = new WSprite(new Identifier("minecraft:textures/item/redstone.png"));
        root.add(icon, 0, 2, 1, 1);

        WButton button = new WButton(new TranslatableText("gui.coolstuff.examplebutton"));
        root.add(button, 0, 3, 4, 1);
        button.setOnClick(()-> {

            PowerHolderComponent component = PowerHolderComponent.KEY.get(entity);
            PowerType<?> power = PowerTypeRegistry.get(new Identifier("origins", "arcane_skin"));
            Identifier source = new Identifier("coolstuff", "sattes_powers");
            boolean success = component.addPower(power, source);
            if(success) {
                component.sync();
            }


        });


            WLabel label = new WLabel(new LiteralText("Test"), 0xFFFFFF);
        root.add(label, 0, 4, 2, 1);

        root.validate(this);




           /*
        WTabPanel tabPanel = new WTabPanel();
        root.add(tabPanel, 0, 8, 6, 4);


        WGridPanel gridPanel = new WGridPanel();
        root.add(gridPanel, 0, 8, 5, 3);

        WScrollPanel scrollPanel = new WScrollPanel(cardPanel);
        root.add(scrollPanel, 0, 9, 5, 3);
*/

    }
}