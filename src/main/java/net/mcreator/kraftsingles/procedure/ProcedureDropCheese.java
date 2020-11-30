package net.mcreator.kraftsingles.procedure;

@ElementsKraftSingles.ModElement.Tag
public class ProcedureDropCheese extends ElementsKraftSingles.ModElement {

	public ProcedureDropCheese(ElementsKraftSingles instance) {
		super(instance, 69);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DropCheese!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DropCheese!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DropCheese!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DropCheese!");
			return;
		}

		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		double Random = 0;
		Random = (double) Math.random();
		if (((Random) <= 0.25)) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemUnrefinedCheese.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (!world.isRemote) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 2));
			}
		} else {
			if ((((Random) > 0.25) && ((Random) <= 0.5))) {
				for (int index0 = 0; index0 < (int) (2); index0++) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemUnrefinedCheese.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					if (!world.isRemote) {
						world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 2));
					}
				}
			} else {
				if ((((Random) > 0.5) && ((Random) <= 0.75))) {
					for (int index1 = 0; index1 < (int) (3); index1++) {
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemUnrefinedCheese.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
						if (!world.isRemote) {
							world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 2));
						}
					}
				} else {
					for (int index2 = 0; index2 < (int) (4); index2++) {
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemUnrefinedCheese.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
						if (!world.isRemote) {
							world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 2));
						}
					}
				}
			}
		}

	}

}
