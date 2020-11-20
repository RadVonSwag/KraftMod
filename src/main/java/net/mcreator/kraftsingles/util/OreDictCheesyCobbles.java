
package net.mcreator.kraftsingles.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.kraftsingles.block.BlockCheesyStone;
import net.mcreator.kraftsingles.ElementsKraftSingles;

@ElementsKraftSingles.ModElement.Tag
public class OreDictCheesyCobbles extends ElementsKraftSingles.ModElement {
	public OreDictCheesyCobbles(ElementsKraftSingles instance) {
		super(instance, 49);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("cobblestone", new ItemStack(BlockCheesyStone.block, (int) (1)));
		OreDictionary.registerOre("cobblestone", new ItemStack(Blocks.COBBLESTONE, (int) (1)));
	}
}
