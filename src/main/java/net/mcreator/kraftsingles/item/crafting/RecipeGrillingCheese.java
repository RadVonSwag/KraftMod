
package net.mcreator.kraftsingles.item.crafting;

@ElementsKraftSingles.ModElement.Tag
public class RecipeGrillingCheese extends ElementsKraftSingles.ModElement {

	public RecipeGrillingCheese(ElementsKraftSingles instance) {
		super(instance, 116);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemCheeseInBread.block, (int) (1)), new ItemStack(ItemGrilledCheese.block, (int) (1)), 1F);
	}

}
