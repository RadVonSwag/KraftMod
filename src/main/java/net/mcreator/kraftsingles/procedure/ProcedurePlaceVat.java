package net.mcreator.kraftsingles.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.mcreator.kraftsingles.block.BlockVat;
import net.mcreator.kraftsingles.ElementsKraftSingles;

@ElementsKraftSingles.ModElement.Tag
public class ProcedurePlaceVat extends ElementsKraftSingles.ModElement {
	public ProcedurePlaceVat(ElementsKraftSingles instance) {
		super(instance, 46);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
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
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean coreBlock = false;
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.TALLGRASS.getStateFromMeta(1).getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockVat.block.getDefaultState(), 3);
		} else {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.TALLGRASS.getStateFromMeta(2).getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockVat.block.getDefaultState(), 3);
			} else {
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.DOUBLE_PLANT.getStateFromMeta(2)
						.getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockVat.block.getDefaultState(), 3);
				} else {
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.DOUBLE_PLANT.getStateFromMeta(3)
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockVat.block.getDefaultState(), 3);
					} else {
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockVat.block.getDefaultState(), 3);
						}
					}
				}
			}
		}
	}
}
