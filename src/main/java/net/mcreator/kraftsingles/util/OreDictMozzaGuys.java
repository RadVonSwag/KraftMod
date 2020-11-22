
package net.mcreator.kraftsingles.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.kraftsingles.block.BlockMozarellaPlanks;
import net.mcreator.kraftsingles.ElementsKraftSingles;

@ElementsKraftSingles.ModElement.Tag
public class OreDictMozzaGuys extends ElementsKraftSingles.ModElement {
	public OreDictMozzaGuys(ElementsKraftSingles instance) {
		super(instance, 60);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("plankWood", new ItemStack(BlockMozarellaPlanks.block, (int) (1)));
		OreDictionary.registerOre("plankWood", new ItemStack(Blocks.PLANKS, (int) (1), 2));
	}
}
