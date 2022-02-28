package net.sattes.coolstuff.item.custom.gear.trinkets;

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

public class ModBaseRingItem extends Item {


    public ModBaseRingItem(Settings settings) {
        super(settings);
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {

        //generates a number (1-5) on crafting a base ring to determine it's quality
        super.onCraft(stack, world, player);
        final Random r = new Random();
        int val = r.nextInt(100);
        int qual = 0;
        if (val <= 39)               {qual = 1;} //40%
        if (val > 39  && val <= 69)  {qual = 2;} //30%
        if (val > 69 && val <= 89)   {qual = 3;} //20%
        if (val >89 && val <= 98)    {qual = 4;} //9%
        if (val == 99)               {qual = 5;} //1%

        //test and debug
        //System.out.println("RING QUALITY: " + val);
        NbtCompound nbtQuality = new NbtCompound();
        nbtQuality.putInt("quality", qual);
        stack.setNbt(nbtQuality);
        //System.out.println("NBT DATA: " + stack.getNbt().toString());
    }

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().equals("{quality:1}")) {
                tooltip.add(new TranslatableText("item.coolstuff.quality_1"));
            }
        }
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().equals("{quality:2}")) {
                tooltip.add(new TranslatableText("item.coolstuff.quality_2"));
            }
        }
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().equals("{quality:3}")) {
                tooltip.add(new TranslatableText("item.coolstuff.quality_3"));
            }
        }
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().equals("{quality:4}")) {
                tooltip.add(new TranslatableText("item.coolstuff.quality_4"));
            }
        }
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().equals("{quality:5}")) {

                tooltip.add(new TranslatableText("item.coolstuff.quality_5"));
            }
        }
    }
}
