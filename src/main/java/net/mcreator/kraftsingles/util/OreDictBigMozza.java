
package net.mcreator.kraftsingles.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.kraftsingles.block.BlockMozarella;
import net.mcreator.kraftsingles.ElementsKraftSingles;

@ElementsKraftSingles.ModElement.Tag
public class OreDictBigMozza extends ElementsKraftSingles.ModElement {
	public OreDictBigMozza(ElementsKraftSingles instance) {
		super(instance, 59);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("logWooden", new ItemStack(BlockMozarella.block, (int) (1)));
		OreDictionary.registerOre("logWooden", new ItemStack(Blocks.LOG, (int) (1), 2));
	}
}
