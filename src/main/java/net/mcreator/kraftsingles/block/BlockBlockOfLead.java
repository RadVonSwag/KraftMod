
package net.mcreator.kraftsingles.block;

@ElementsKraftSingles.ModElement.Tag
public class BlockBlockOfLead extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:blockoflead")
	public static final Block block = null;

	public BlockBlockOfLead(ElementsKraftSingles instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("blockoflead"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("kraftsingles:blockoflead", "inventory"));

	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.IRON);

			setUnlocalizedName("blockoflead");
			setSoundType(SoundType.METAL);

			setHardness(5F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabKraftSingles.tab);

		}

		@Override
		public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
			return true;
		}

	}

}
