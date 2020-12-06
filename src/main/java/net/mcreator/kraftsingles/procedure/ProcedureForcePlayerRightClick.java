package net.mcreator.kraftsingles.procedure;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.Minecraft;

import net.mcreator.kraftsingles.ElementsKraftSingles;

@ElementsKraftSingles.ModElement.Tag
public class ProcedureForcePlayerRightClick extends ElementsKraftSingles.ModElement {
	public ProcedureForcePlayerRightClick(ElementsKraftSingles instance) {
		super(instance, 87);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		KeyBinding.onTick(Minecraft.getMinecraft().gameSettings.keyBindUseItem.getKeyCode());
	}
}
