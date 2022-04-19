package net.sattes.runetech_theory.mixin;


import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;

import net.minecraft.particle.ParticleTypes;
import org.spongepowered.asm.mixin.Final;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


import static net.sattes.runetech_theory.RunetechTheory.BLOOD_DRIPPING;
import static net.sattes.runetech_theory.RunetechTheory.BUFF;
import static net.sattes.runetech_theory.util.StatusEffectRegistry.BLEED_STATUS_EFFECT;
import static net.sattes.runetech_theory.util.StatusEffectRegistry.LEADER_OF_THE_PACK_STATUS_EFFECT;


@Mixin(LivingEntity.class)
public abstract class MixinLivingEntity{

	@Shadow
	@Final
	private static TrackedData<Boolean> POTION_SWIRLS_AMBIENT;


	@Inject(method = "tickStatusEffects", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;addParticle(Lnet/minecraft/particle/ParticleEffect;DDDDDD)V"), cancellable = true)
	protected void tickStatusEffects(CallbackInfo ci) {
		LivingEntity living = (LivingEntity) (Object) this;
		DataTracker dataTracker = living.getDataTracker();

		if(living.hasStatusEffect(BLEED_STATUS_EFFECT)) {
			living.world.addParticle(dataTracker.get(POTION_SWIRLS_AMBIENT) ? ParticleTypes.ENTITY_EFFECT : BLOOD_DRIPPING, living.getParticleX(0.5D), living.getRandomBodyY(), living.getParticleZ(0.5D), 0, 0, 0);
			ci.cancel();
		}
		if(living.hasStatusEffect(LEADER_OF_THE_PACK_STATUS_EFFECT)) {
			living.world.addParticle(dataTracker.get(POTION_SWIRLS_AMBIENT) ? ParticleTypes.ENTITY_EFFECT : BUFF, living.getParticleX(0.8D), living.getRandomBodyY(), living.getParticleZ(0.8D), 0, 0, 0);
			ci.cancel();
		}

	}
}

