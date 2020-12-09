package net.mcreator.kraftsingles.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;

import net.mcreator.kraftsingles.ElementsKraftSingles;

import java.util.Random;

@ElementsKraftSingles.ModElement.Tag
public class ProcedureSounding extends ElementsKraftSingles.ModElement {
	public ProcedureSounding(ElementsKraftSingles instance) {
		super(instance, 112);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Sounding!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Sounding!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Sounding!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Sounding!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double Random = 0;
		Random = (double) Math.random();
		if (((Random) <= 0.5)) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("kraftsingles:push-button-sound")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			if ((((Random) > 0.5) && ((Random) <= 0.85))) {
				world.playSound((EntityPlayer) null, x, y, z,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation("kraftsingles:push-button-sound")),
						SoundCategory.NEUTRAL, (float) 1, (float) ((Math.random() * 0.3) + 0.85));
			} else {
				if ((((Random) > 0.85) && ((Random) < 0.95))) {
					world.playSound((EntityPlayer) null, x, y, z,
							(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
									.getObject(new ResourceLocation("kraftsingles:push-button-sound")),
							SoundCategory.NEUTRAL, (float) 1, (float) ((Math.random() * 0.6) + 0.7));
				} else {
					world.playSound((EntityPlayer) null, x, y, z,
							(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
									.getObject(new ResourceLocation("kraftsingles:push-button-sound")),
							SoundCategory.NEUTRAL, (float) 1, (float) (Math.random() + Math.random()));
				}
			}
		}
	}
}
