package net.sattes.coolstuff.status_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;


public class BleedStatusEffect extends StatusEffect {
    public BleedStatusEffect() {
        super(
                StatusEffectCategory.HARMFUL,
                0x98D982); // color in RGB
    }



    // This method is called every tick to check whether it should apply the status effect or not
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }

    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.horizontalSpeed > 0.5F) {
            entity.horizontalSpeed = 0;
        }

        float current_speed = entity.horizontalSpeed * 1000;

        if (current_speed >= 165.0F) {
            entity.damage(DamageSource.GENERIC, 3 << amplifier);
            entity.horizontalSpeed = 0;
        }
        else if ((current_speed < 165.0F) && ( current_speed >= 125.0F)) {
            entity.damage(DamageSource.GENERIC, 2 << amplifier);
            entity.horizontalSpeed = 0;
        }
        else if ((current_speed < 125.0F) && ( current_speed >= 35.0F)) {
            entity.damage(DamageSource.GENERIC, 1 << amplifier);
            entity.horizontalSpeed = 0;
        }

        }
    }

