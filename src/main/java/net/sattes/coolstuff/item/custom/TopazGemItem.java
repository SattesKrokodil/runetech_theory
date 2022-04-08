package net.sattes.coolstuff.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class TopazGemItem extends Item

{

    public TopazGemItem(Settings settings) {
        super(settings);
    }

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext){
                tooltip.add(new TranslatableText("item.coolstuff.topaz_gem_tip_line_1"));
                tooltip.add(new TranslatableText("item.coolstuff.topaz_gem_tip_line_2"));
                tooltip.add(new TranslatableText("item.coolstuff.topaz_gem_tip_line_3"));
    }

}
