package net.mcreator.kraftsingles.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.kraftsingles.block.BlockVat;
import net.mcreator.kraftsingles.ElementsKraftSingles;

@ElementsKraftSingles.ModElement.Tag
public class ProcedurePlaceVat extends ElementsKraftSingles.ModElement {
	public ProcedurePlaceVat(ElementsKraftSingles instance) {
		super(instance, 46);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PlaceVat!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PlaceVat!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PlaceVat!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PlaceVat!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PlaceVat!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean coreBlock = false;
		if ((((entity.getHorizontalFacing()) == EnumFacing.WEST)
				&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock()))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), BlockVat.block.getDefaultState(), 3);
		} else {
			if (((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock()))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
							.getBlock()))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockVat.block.getDefaultState(), 3);
			} else {
				if ((((entity.getHorizontalFacing()) == EnumFacing.NORTH) && ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
						.getBlock() == Blocks.AIR.getDefaultState().getBlock()))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), BlockVat.block.getDefaultState(), 3);
				} else {
					if ((((entity.getHorizontalFacing()) == EnumFacing.EAST) && ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
							.getBlock() == Blocks.AIR.getDefaultState().getBlock()))) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), BlockVat.block.getDefaultState(), 3);
					} else {
						if (((!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock()))
								&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
										.getBlock()))) {
							world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), BlockVat.block.getDefaultState(), 3);
						} else {
							if ((((entity.getHorizontalFacing()) == EnumFacing.SOUTH)
									&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.AIR
											.getDefaultState().getBlock()))) {
								world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), BlockVat.block.getDefaultState(), 3);
							}
						}
					}
				}
			}
		}
		(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
	}
}
