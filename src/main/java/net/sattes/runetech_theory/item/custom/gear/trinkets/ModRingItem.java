package net.sattes.runetech_theory.item.custom.gear.trinkets;

import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class ModRingItem extends TrinketItem {


    public ModRingItem(Settings settings) {
        super(settings);
    }



    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().contains("quality:1")) {
                tooltip.add(new TranslatableText("item.runetech_theory.quality_1"));

            }
        }
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().contains("quality:2")) {
                tooltip.add(new TranslatableText("item.runetech_theory.quality_2"));
            }
        }
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().contains("quality:3")) {
                tooltip.add(new TranslatableText("item.runetech_theory.quality_3"));
            }
        }
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().contains("quality:4")) {
                tooltip.add(new TranslatableText("item.runetech_theory.quality_4"));
            }
        }
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().contains("quality:5")) {
                tooltip.add(new TranslatableText("item.runetech_theory.quality_5"));
            }
        }
    }
}
