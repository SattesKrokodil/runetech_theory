package net.sattes.coolstuff.item.custom.runewords;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class RunewordFoxItem extends Item

{

    public RunewordFoxItem(Settings settings) {
        super(settings);
    }
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        if(Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_shift_line_1"));
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_shift_line_2"));
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_shift_line_3"));
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_shift_line_4"));
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_shift_line_5"));
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_shift_line_6"));
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_shift_line_7"));
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_shift_line_8"));
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_shift_line_9"));
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_shift_line_10"));
        } else {
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_tip_line_1"));
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_tip_line_2"));
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_tip_line_3"));
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_tip_line_4"));
            tooltip.add(new TranslatableText("item.coolstuff.runeword_fox_tip_line_5"));
            tooltip.add(new TranslatableText("item.coolstuff.press_shift"));

        }
    }

}
