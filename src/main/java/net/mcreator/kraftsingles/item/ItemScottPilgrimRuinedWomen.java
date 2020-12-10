
package net.mcreator.kraftsingles.item;

@ElementsKraftSingles.ModElement.Tag
public class ItemScottPilgrimRuinedWomen extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:scottpilgrimruinedwomen")
	public static final Item block = null;

	public ItemScottPilgrimRuinedWomen(ElementsKraftSingles instance) {
		super(instance, 110);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:scottpilgrimruinedwomen", "inventory"));
	}

	public static class MusicDiscItemCustom extends ItemRecord {

		public MusicDiscItemCustom() {
			super("scottpilgrimruinedwomen", ElementsKraftSingles.sounds.get(new ResourceLocation("kraftsingles:he-ruined-women")));
			setUnlocalizedName("scottpilgrimruinedwomen");
			setRegistryName("scottpilgrimruinedwomen");
			setCreativeTab(CreativeTabs.MISC);
		}

	}

}
