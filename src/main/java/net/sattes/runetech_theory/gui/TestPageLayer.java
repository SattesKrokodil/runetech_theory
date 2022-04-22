package net.sattes.runetech_theory.gui;

import com.github.clevernucleus.playerex.api.ExAPI;
import com.github.clevernucleus.playerex.api.client.ClientUtil;
import com.github.clevernucleus.playerex.api.client.PageLayer;
import com.github.clevernucleus.playerex.api.client.RenderComponent;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.sattes.runetech_theory.professions.StatsHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Environment(EnvType.CLIENT)
public class TestPageLayer extends PageLayer {
    private static Supplier<Float> scaleX = () -> {
        return ExAPI.getConfig().textScaleX();
    };
    private static Supplier<Float> scaleY = () -> {
        return ExAPI.getConfig().textScaleY();
    };
    private static float scaleZ = 0.75F;
    private static final List<RenderComponent> COMPONENTS = new ArrayList();

    public TestPageLayer(HandledScreen<?> parent, ScreenHandler handler, PlayerInventory inventory, Text title) {
        super(parent, handler, inventory, title);
    }

    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        matrices.push();
        matrices.scale((Float)scaleX.get(), (Float)scaleY.get(), scaleZ);
        COMPONENTS.forEach((component) -> {
            component.renderText(this.client.player, matrices, this.textRenderer, this.x, this.y, (Float)scaleX.get(), (Float)scaleY.get());
        });

        COMPONENTS.add(RenderComponent.of(StatsHelper.PROFESSION_HARVESTING, ((value) -> {
            double disp = ClientUtil.displayValue(StatsHelper.PROFESSION_HARVESTING, (double)value);
            int intDisp = (int)disp;
            return new TranslatableText("runetech_theory.attribute.name.profession_harvesting", new Object[]{intDisp});
        }), (value) -> {
            List<Text> tooltip = new ArrayList();
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.farming[0]")).formatted(Formatting.GRAY));
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.farming[1]")).formatted(Formatting.GRAY));
            return tooltip;
        }, 17, 25));

        COMPONENTS.add(RenderComponent.of(StatsHelper.PROFESSION_MINING, (value) -> {
            double disp = ClientUtil.displayValue(StatsHelper.PROFESSION_MINING, (double)value);
            int intDisp = (int)disp;
            return new TranslatableText("runetech_theory.attribute.name.profession_mining", new Object[]{intDisp});
        }, (value) -> {
            List<Text> tooltip = new ArrayList();
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.mining[0]")).formatted(Formatting.GRAY));
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.mining[1]")).formatted(Formatting.GRAY));
            return tooltip;
        }, 17, 50));
        COMPONENTS.add(RenderComponent.of(StatsHelper.PROFESSION_WOODWORKING, (value) -> {
            double disp = ClientUtil.displayValue(StatsHelper.PROFESSION_WOODWORKING, (double)value);
            int intDisp = (int)disp;
            return new TranslatableText("runetech_theory.attribute.name.profession_woodworking", new Object[]{intDisp});
        }, (value) -> {
            List<Text> tooltip = new ArrayList();
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.woodwork[0]")).formatted(Formatting.GRAY));
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.woodwork[1]")).formatted(Formatting.GRAY));
            return tooltip;
        }, 17, 75));
        COMPONENTS.add(RenderComponent.of(StatsHelper.PROFESSION_HUNTING, (value) -> {
            double disp = ClientUtil.displayValue(StatsHelper.PROFESSION_HUNTING, (double)value);
            int intDisp = (int)disp;
            return new TranslatableText("runetech_theory.attribute.name.profession_hunting", new Object[]{intDisp});
        }, (value) -> {
            List<Text> tooltip = new ArrayList();
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.hunting[0]")).formatted(Formatting.GRAY));
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.hunting[1]")).formatted(Formatting.GRAY));
            return tooltip;
        }, 17, 100));
        COMPONENTS.add(RenderComponent.of(StatsHelper.PROFESSION_FISHING, (value) -> {
            double disp = ClientUtil.displayValue(StatsHelper.PROFESSION_FISHING, (double)value);
            int intDisp = (int)disp;
            return new TranslatableText("runetech_theory.attribute.name.profession_fishing", new Object[]{intDisp});
        }, (value) -> {
            List<Text> tooltip = new ArrayList();
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.fishing[0]")).formatted(Formatting.GRAY));
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.fishing[1]")).formatted(Formatting.GRAY));
            return tooltip;
        }, 17, 125));
        //Trying to work with dataatributes made by Sattes
        COMPONENTS.add(RenderComponent.of(StatsHelper.PROFESSION_COOKING, (value) -> {
            double disp = ClientUtil.displayValue(StatsHelper.PROFESSION_COOKING, (double)value);
            int intDisp = (int)disp;
            return new TranslatableText("runetech_theory.attribute.name.profession_cooking", new Object[]{intDisp});
        }, (value) -> {
        List<Text> tooltip = new ArrayList();
        tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.cooking[0]")).formatted(Formatting.GRAY));
        tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.cooking[1]")).formatted(Formatting.GRAY));
        return tooltip;
        }, 110, 25));
        COMPONENTS.add(RenderComponent.of(StatsHelper.PROFESSION_ENGINEERING, (value) -> {
            double disp = ClientUtil.displayValue(StatsHelper.PROFESSION_ENGINEERING, (double)value);
            int intDisp = (int)disp;
            return new TranslatableText("runetech_theory.attribute.name.profession_engineering", new Object[]{intDisp});
        }, (value) -> {
            List<Text> tooltip = new ArrayList();
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.engineering[0]")).formatted(Formatting.GRAY));
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.engineering[1]")).formatted(Formatting.GRAY));
            return tooltip;
        }, 110, 50));
        COMPONENTS.add(RenderComponent.of(StatsHelper.PROFESSION_RUNETHEORY, (value) -> {
            double disp = ClientUtil.displayValue(StatsHelper.PROFESSION_RUNETHEORY, (double)value);
            int intDisp = (int)disp;
            return new TranslatableText("runetech_theory.attribute.name.profession_rune_theory", new Object[]{intDisp});
        }, (value) -> {
            List<Text> tooltip = new ArrayList();
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.runetech[0]")).formatted(Formatting.GRAY));
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.runetech[1]")).formatted(Formatting.GRAY));
            return tooltip;
        }, 110, 75));
        COMPONENTS.add(RenderComponent.of(StatsHelper.PROFESSION_SMITHING, (value) -> {
            double disp = ClientUtil.displayValue(StatsHelper.PROFESSION_SMITHING, (double)value);
            int intDisp = (int)disp;
            return new TranslatableText("runetech_theory.attribute.name.profession_smithing", new Object[]{intDisp});
        }, (value) -> {
            List<Text> tooltip = new ArrayList();
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.smithing[0]")).formatted(Formatting.GRAY));
            tooltip.add((new TranslatableText("runetech_theory.gui.page.professions.tooltip.smithing[1]")).formatted(Formatting.GRAY));
            return tooltip;
        }, 110, 100));

        matrices.pop();
        COMPONENTS.forEach((component) -> {
            component.renderTooltip(this.client.player, this::renderTooltip, matrices, this.textRenderer, this.x, this.y, mouseX, mouseY, (Float)scaleX.get(), (Float)scaleY.get());
        });
    }

    public void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
    }
}