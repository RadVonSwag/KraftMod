
package net.mcreator.kraftsingles.item;

@ElementsKraftSingles.ModElement.Tag
public class ItemGutsTheme extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:gutstheme")
	public static final Item block = null;

	public ItemGutsTheme(ElementsKraftSingles instance) {
		super(instance, 106);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:gutstheme", "inventory"));
	}

	public static class MusicDiscItemCustom extends ItemRecord {

		public MusicDiscItemCustom() {
			super("gutstheme", ElementsKraftSingles.sounds.get(new ResourceLocation("kraftsingles:guts")));
			setUnlocalizedName("gutstheme");
			setRegistryName("gutstheme");
			setCreativeTab(CreativeTabs.MISC);
		}

	}

}
