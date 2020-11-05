
package net.mcreator.kraftsingles.block;

@ElementsKraftSingles.ModElement.Tag
public class BlockGrindStone extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:grindstone")
	public static final Block block = null;

	public BlockGrindStone(ElementsKraftSingles instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("grindstone"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("kraftsingles:grindstone", "inventory"));

	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.ROCK);

			setUnlocalizedName("grindstone");
			setSoundType(SoundType.STONE);

			setHardness(2F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabKraftSingles.tab);

		}

	}

}
