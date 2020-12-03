package net.mcreator.kraftsingles.procedure;

import net.minecraft.util.EnumHand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.kraftsingles.block.BlockVat;
import net.mcreator.kraftsingles.ElementsKraftSingles;

@ElementsKraftSingles.ModElement.Tag
public class ProcedureTestVatIdea extends ElementsKraftSingles.ModElement {
	public ProcedureTestVatIdea(ElementsKraftSingles instance) {
		super(instance, 85);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TestVatIdea!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setDouble("faggot", 31);
		if (entity instanceof EntityLivingBase) {
			ItemStack _setstack = new ItemStack(BlockVat.block, (int) (1));
			_setstack.setCount(1);
			((EntityLivingBase) entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
			if (entity instanceof EntityPlayerMP)
				((EntityPlayerMP) entity).inventory.markDirty();
		}
	}
}
