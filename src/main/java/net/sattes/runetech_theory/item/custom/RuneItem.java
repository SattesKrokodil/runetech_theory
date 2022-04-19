package net.sattes.runetech_theory.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class RuneItem extends Item

{

    public RuneItem(Settings settings) {
        super(settings);
    }

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext){
                tooltip.add(new TranslatableText("item.runetech_theory.rune_particle_tip_line_1"));
                tooltip.add(new TranslatableText("item.runetech_theory.rune_particle_tip_line_2"));
    }

}
