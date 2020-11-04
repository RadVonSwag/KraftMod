package net.mcreator.kraftsingles.procedure;

@ElementsKraftSingles.ModElement.Tag
public class ProcedureCumming extends ElementsKraftSingles.ModElement {

	public ProcedureCumming(ElementsKraftSingles instance) {
		super(instance, 22);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Cumming!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemEmptyJar.block, (int) (1)))
				: false)) {
			if (((entity instanceof EntityPlayer)
					? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemNujabes.block, (int) (1)))
					: false)) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemEmptyJar.block, (int) (1)).getItem(), -1, (int) 1, null);
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemCumJar.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
			}
		}

	}

	@SubscribeEvent
	public void onPlayerInBed(PlayerSleepInBedEvent event) {
		EntityPlayer entity = event.getEntityPlayer();
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = entity.world;
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}

}
