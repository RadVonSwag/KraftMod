
package net.mcreator.kraftsingles.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kraftsingles.item.ItemLeadIngot;
import net.mcreator.kraftsingles.block.BlockLeadOre;
import net.mcreator.kraftsingles.ElementsKraftSingles;

@ElementsKraftSingles.ModElement.Tag
public class RecipeSmeltLeadOre extends ElementsKraftSingles.ModElement {
	public RecipeSmeltLeadOre(ElementsKraftSingles instance) {
		super(instance, 36);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockLeadOre.block, (int) (1)), new ItemStack(ItemLeadIngot.block, (int) (1)), 1F);
	}
}
