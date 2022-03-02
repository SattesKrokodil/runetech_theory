package net.sattes.coolstuff.item.custom.gear.trinkets;

import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class ModRingItem extends TrinketItem {


    public ModRingItem(Settings settings) {
        super(settings);
    }



    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().contains("quality:1")) {
                tooltip.add(new TranslatableText("item.coolstuff.quality_1"));
            }
        }
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().contains("quality:2")) {
                tooltip.add(new TranslatableText("item.coolstuff.quality_2"));
            }
        }
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().contains("quality:3")) {
                tooltip.add(new TranslatableText("item.coolstuff.quality_3"));
            }
        }
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().contains("quality:4")) {
                tooltip.add(new TranslatableText("item.coolstuff.quality_4"));
            }
        }
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().contains("quality:5")) {
                tooltip.add(new TranslatableText("item.coolstuff.quality_5"));
            }
        }
    }
}
