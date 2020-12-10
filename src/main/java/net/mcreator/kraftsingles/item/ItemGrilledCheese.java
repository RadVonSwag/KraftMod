
package net.mcreator.kraftsingles.item;

@ElementsKraftSingles.ModElement.Tag
public class ItemGrilledCheese extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:grilledcheese")
	public static final Item block = null;

	public ItemGrilledCheese(ElementsKraftSingles instance) {
		super(instance, 115);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:grilledcheese", "inventory"));
	}

	public static class ItemFoodCustom extends ItemFood {

		public ItemFoodCustom() {
			super(10, 20f, false);
			setUnlocalizedName("grilledcheese");
			setRegistryName("grilledcheese");

			setCreativeTab(CreativeTabs.FOOD);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}

	}

}
