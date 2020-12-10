
package net.mcreator.kraftsingles.item;

@ElementsKraftSingles.ModElement.Tag
public class ItemGaybedFreestyle extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:gaybedfreestyle")
	public static final Item block = null;

	public ItemGaybedFreestyle(ElementsKraftSingles instance) {
		super(instance, 105);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:gaybedfreestyle", "inventory"));
	}

	public static class MusicDiscItemCustom extends ItemRecord {

		public MusicDiscItemCustom() {
			super("gaybedfreestyle", ElementsKraftSingles.sounds.get(new ResourceLocation("kraftsingles:gaybed")));
			setUnlocalizedName("gaybedfreestyle");
			setRegistryName("gaybedfreestyle");
			setCreativeTab(CreativeTabs.MISC);
		}

	}

}
