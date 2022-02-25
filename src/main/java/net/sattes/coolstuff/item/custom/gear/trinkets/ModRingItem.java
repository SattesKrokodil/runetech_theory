package net.sattes.coolstuff.item.custom.gear.trinkets;


import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

import java.util.UUID;


public class ModRingItem extends TrinketItem {


    public ModRingItem(Settings settings) {
        super(settings);
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        // +10% movement speed
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;

            TranslatableText prefix = new TranslatableText("coolstuff.sonic");
            TranslatableText name = new TranslatableText("coolstuff.ring");
            String finalName = prefix.toString() + name.toString();

            if (stack.getNbt().contains("speedy")) {
                stack.setCustomName(Text.of(finalName));
                modifiers.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(uuid, "guidemod:movement_speed",
                        0.1, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
            }
        }
        return modifiers;
    }
}

