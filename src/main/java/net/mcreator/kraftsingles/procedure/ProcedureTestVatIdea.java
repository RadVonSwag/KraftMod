package net.mcreator.kraftsingles.procedure;

import net.minecraft.world.World;
import net.minecraft.util.EnumHand;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.kraftsingles.block.BlockVat;
import net.mcreator.kraftsingles.KraftSinglesVariables;
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
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TestVatIdea!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		KraftSinglesVariables.MapVariables.get(world).placeStack = (double) (((((entity instanceof EntityLivingBase)
				? ((EntityLivingBase) entity).getHeldItemMainhand()
				: ItemStack.EMPTY)).getCount()) - 1);
		KraftSinglesVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof EntityLivingBase) {
			ItemStack _setstack = new ItemStack(BlockVat.block, (int) (1));
			_setstack.setCount(1);
			((EntityLivingBase) entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
			if (entity instanceof EntityPlayerMP)
				((EntityPlayerMP) entity).inventory.markDirty();
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			ProcedureForcePlayerRightClick.executeProcedure($_dependencies);
		}
		while ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == (ItemStack.EMPTY).getItem())) {
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == (ItemStack.EMPTY).getItem())) {
				if (entity instanceof EntityLivingBase) {
					ItemStack _setstack = new ItemStack(Blocks.WHEAT, (int) (1));
					_setstack.setCount(6);
					((EntityLivingBase) entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
					if (entity instanceof EntityPlayerMP)
						((EntityPlayerMP) entity).inventory.markDirty();
				}
			} else {
				break;
			}
		}
	}
}
