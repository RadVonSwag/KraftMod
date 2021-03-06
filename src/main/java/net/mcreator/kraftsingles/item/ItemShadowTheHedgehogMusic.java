
package net.mcreator.kraftsingles.item;

@ElementsKraftSingles.ModElement.Tag
public class ItemShadowTheHedgehogMusic extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:shadowthehedgehogmusic")
	public static final Item block = null;

	public ItemShadowTheHedgehogMusic(ElementsKraftSingles instance) {
		super(instance, 108);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:shadowthehedgehogmusic", "inventory"));
	}

	public static class MusicDiscItemCustom extends ItemRecord {

		public MusicDiscItemCustom() {
			super("shadowthehedgehogmusic", ElementsKraftSingles.sounds.get(new ResourceLocation("kraftsingles:shadow-the-hedgehog")));
			setUnlocalizedName("shadowthehedgehogmusic");
			setRegistryName("shadowthehedgehogmusic");
			setCreativeTab(CreativeTabs.MISC);
		}

	}

}
