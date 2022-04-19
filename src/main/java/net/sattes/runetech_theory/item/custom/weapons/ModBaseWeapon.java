package net.sattes.runetech_theory.item.custom.weapons;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;

public class ModBaseWeapon extends SwordItem {
    public ModBaseWeapon(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    public static void rarities(String[] args) {
    HashMap<String, String> rarities = new HashMap<String, String>();
        rarities.put("rarity_1", "COMMON");
        rarities.put("rarity_2", "UNCOMMON");
        rarities.put("rarity_3", "RARE");
        rarities.put("rarity_4", "EPIC");
    }
    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {}

    public Text getName() {
        return new TranslatableText(this.getTranslationKey());
    }
    public Text getName(ItemStack stack) {
        return new TranslatableText(this.getTranslationKey(stack));
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
    }
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
    }



}
