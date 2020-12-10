
package net.mcreator.kraftsingles.item;

@ElementsKraftSingles.ModElement.Tag
public class ItemCheeseHoe extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:cheesehoe")
	public static final Item block = null;

	public ItemCheeseHoe(ElementsKraftSingles instance) {
		super(instance, 96);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("CHEESEHOE", 1, 5924, 4f, 0.6f, 50)) {

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 1);
				return ret.keySet();
			}

		}.setUnlocalizedName("cheesehoe").setRegistryName("cheesehoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:cheesehoe", "inventory"));
	}

}
