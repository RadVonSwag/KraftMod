
package net.mcreator.kraftsingles.item;

@ElementsKraftSingles.ModElement.Tag
public class ItemInPerilAllForTheLoveOfYou extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:inperilallfortheloveofyou")
	public static final Item block = null;

	public ItemInPerilAllForTheLoveOfYou(ElementsKraftSingles instance) {
		super(instance, 109);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:inperilallfortheloveofyou", "inventory"));
	}

	public static class MusicDiscItemCustom extends ItemRecord {

		public MusicDiscItemCustom() {
			super("inperilallfortheloveofyou", ElementsKraftSingles.sounds.get(new ResourceLocation("kraftsingles:inperilallfortheloveofyou")));
			setUnlocalizedName("inperilallfortheloveofyou");
			setRegistryName("inperilallfortheloveofyou");
			setCreativeTab(CreativeTabs.MISC);
		}

	}

}
