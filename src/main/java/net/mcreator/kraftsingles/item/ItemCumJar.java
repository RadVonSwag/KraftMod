
package net.mcreator.kraftsingles.item;

@ElementsKraftSingles.ModElement.Tag
public class ItemCumJar extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:cumjar")
	public static final Item block = null;

	public ItemCumJar(ElementsKraftSingles instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:cumjar", "inventory"));
	}

	public static class ItemFoodCustom extends ItemFood {

		public ItemFoodCustom() {
			super(-8, 0f, true);
			setUnlocalizedName("cumjar");
			setRegistryName("cumjar");
			setAlwaysEdible();
			setCreativeTab(TabKraftSingles.tab);
			setMaxStackSize(1);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.DRINK;
		}

	}

}
