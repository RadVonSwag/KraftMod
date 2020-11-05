
package net.mcreator.kraftsingles.block;

@ElementsKraftSingles.ModElement.Tag
public class BlockFilledVat extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:filledvat")
	public static final Block block = null;

	public BlockFilledVat(ElementsKraftSingles instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("filledvat"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("kraftsingles:filledvat", "inventory"));

	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.IRON);

			setUnlocalizedName("filledvat");
			setSoundType(SoundType.METAL);

			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabKraftSingles.tab);

		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction,
				float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();

			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);

				ProcedureMilkoutCauldron.executeProcedure($_dependencies);
			}
			return true;
		}

	}

}
