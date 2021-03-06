package net.sattes.coolstuff.util;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sattes.coolstuff.status_effects.BleedStatusEffect;
import net.sattes.coolstuff.status_effects.LeaderOfThePackStatusEffect;

public class StatusEffectRegistry {
    public static final StatusEffect BLEED_STATUS_EFFECT = new BleedStatusEffect();
    public static final StatusEffect LEADER_OF_THE_PACK_STATUS_EFFECT = new LeaderOfThePackStatusEffect();

    public static void registerStatusEffects() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier("coolstuff", "bleed"), BLEED_STATUS_EFFECT);
        Registry.register(Registry.STATUS_EFFECT, new Identifier("coolstuff", "leader_of_the_pack"), LEADER_OF_THE_PACK_STATUS_EFFECT);
    }
}
