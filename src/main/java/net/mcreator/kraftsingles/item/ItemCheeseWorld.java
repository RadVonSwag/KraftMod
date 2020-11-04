
package net.mcreator.kraftsingles.item;

import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;

import net.mcreator.kraftsingles.world.WorldCheeseWorld;
import net.mcreator.kraftsingles.creativetab.TabKraftSingles;

public class ItemCheeseWorld extends Item {
	@GameRegistry.ObjectHolder("kraftsingles:cheeseworld")
	public static final Item block = null;
	public ItemCheeseWorld() {
		super();
		this.maxStackSize = 1;
		setMaxDamage(64);
		setCreativeTab(TabKraftSingles.tab);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer entity, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		pos = pos.offset(facing);
		ItemStack itemstack = entity.getHeldItem(hand);
		if (!entity.canPlayerEdit(pos, facing, itemstack)) {
			return EnumActionResult.FAIL;
		} else {
			if (world.isAirBlock(pos))
				WorldCheeseWorld.portal.portalSpawn(world, pos);
			itemstack.damageItem(1, entity);
			return EnumActionResult.SUCCESS;
		}
	}
}
