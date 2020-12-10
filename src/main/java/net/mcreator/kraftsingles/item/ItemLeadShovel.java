
package net.mcreator.kraftsingles.item;

@ElementsKraftSingles.ModElement.Tag
public class ItemLeadShovel extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:leadshovel")
	public static final Item block = null;

	public ItemLeadShovel(ElementsKraftSingles instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("LEADSHOVEL", 1, 202, 5f, 2f, 15)) {

			{
				this.attackSpeed = -3f;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 1);
				return ret.keySet();
			}

		}.setUnlocalizedName("leadshovel").setRegistryName("leadshovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:leadshovel", "inventory"));
	}

}
