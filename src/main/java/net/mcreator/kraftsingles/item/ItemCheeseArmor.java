
package net.mcreator.kraftsingles.item;

@ElementsKraftSingles.ModElement.Tag
public class ItemCheeseArmor extends ElementsKraftSingles.ModElement {

	@GameRegistry.ObjectHolder("kraftsingles:cheesearmorhelmet")
	public static final Item helmet = null;

	@GameRegistry.ObjectHolder("kraftsingles:cheesearmorbody")
	public static final Item body = null;

	@GameRegistry.ObjectHolder("kraftsingles:cheesearmorlegs")
	public static final Item legs = null;

	@GameRegistry.ObjectHolder("kraftsingles:cheesearmorboots")
	public static final Item boots = null;

	public ItemCheeseArmor(ElementsKraftSingles instance) {
		super(instance, 88);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CHEESEARMOR", "kraftsingles:cheese_", 18, new int[]{5, 8, 12, 5}, 50,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("kraftsingles:cheesewarp")),
				4f);

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("cheesearmorhelmet")
				.setRegistryName("cheesearmorhelmet").setCreativeTab(TabKraftSingles.tab));

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("cheesearmorbody")
				.setRegistryName("cheesearmorbody").setCreativeTab(TabKraftSingles.tab));

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("cheesearmorlegs")
				.setRegistryName("cheesearmorlegs").setCreativeTab(TabKraftSingles.tab));

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("cheesearmorboots")
				.setRegistryName("cheesearmorboots").setCreativeTab(TabKraftSingles.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("kraftsingles:cheesearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("kraftsingles:cheesearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("kraftsingles:cheesearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("kraftsingles:cheesearmorboots", "inventory"));
	}

}
