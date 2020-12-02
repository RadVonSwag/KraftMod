package net.mcreator.kraftsingles.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.mcreator.kraftsingles.item.ItemAmiiboInCum;
import net.mcreator.kraftsingles.ElementsKraftSingles;

import java.util.function.Supplier;
import java.util.Map;

@ElementsKraftSingles.ModElement.Tag
public class ProcedureRadiatorNeighbourBlockChanges extends ElementsKraftSingles.ModElement {
	public ProcedureRadiatorNeighbourBlockChanges(ElementsKraftSingles instance) {
		super(instance, 75);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RadiatorNeighbourBlockChanges!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayerMP) {
			Container _current = ((EntityPlayerMP) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(ItemAmiiboInCum.block, (int) (1));
					_setstack.setCount(1);
					((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
	}
}
