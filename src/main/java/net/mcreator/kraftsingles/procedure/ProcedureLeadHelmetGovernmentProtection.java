package net.mcreator.kraftsingles.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.kraftsingles.ElementsKraftSingles;

@ElementsKraftSingles.ModElement.Tag
public class ProcedureLeadHelmetGovernmentProtection extends ElementsKraftSingles.ModElement {
	public ProcedureLeadHelmetGovernmentProtection(ElementsKraftSingles instance) {
		super(instance, 51);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LeadHelmetGovernmentProtection!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 30, (int) 0));
		if (((entity.isSneaking()) == (true))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, (int) 3, (int) 0));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 3, (int) 0));
		}
		if (((entity.isSneaking()) == (false))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.GLOWING, (int) 3, (int) 0));
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHealth() : -1) > 17)) {
			entity.attackEntityFrom(DamageSource.WITHER, (float) 4);
		}
		if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).experienceLevel : 0) > 0)) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).addExperience((int) -0.02);
		}
		if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).getFoodStats().getFoodLevel() : 0) > 15)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HUNGER, (int) 3, (int) 2));
		}
	}
}
