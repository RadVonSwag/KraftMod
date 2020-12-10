
package net.mcreator.kraftsingles.item;

@ElementsKraftSingles.ModElement.Tag
public class ItemCheeseShovel extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:cheeseshovel")
	public static final Item block = null;

	public ItemCheeseShovel(ElementsKraftSingles instance) {
		super(instance, 98);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("CHEESESHOVEL", 2, 5924, 16f, 4f, 50)) {

			{
				this.attackSpeed = -3f;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 2);
				return ret.keySet();
			}

		}.setUnlocalizedName("cheeseshovel").setRegistryName("cheeseshovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:cheeseshovel", "inventory"));
	}

}
