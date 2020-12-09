
package net.mcreator.kraftsingles.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kraftsingles.item.ItemGrilledCheese;
import net.mcreator.kraftsingles.item.ItemCheeseInBread;
import net.mcreator.kraftsingles.ElementsKraftSingles;

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
