package net.sattes.coolstuff.item.custom.gear.trinkets;

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

        if(stack.hasNbt()){
            assert stack.getNbt() != null;
            for(int i=1; i<6; i++){
                if(stack.getNbt().toString().contains("quality:"+ i)){
                    tooltip.add(new TranslatableText("item.coolstuff.quality_" + i));
                }
            }
        }
    }
}
