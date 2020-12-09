
package net.mcreator.kraftsingles.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.kraftsingles.ElementsKraftSingles;

import java.util.Set;
import java.util.HashMap;

@ElementsKraftSingles.ModElement.Tag
public class ItemCheeseShovel extends ElementsKraftSingles.ModElement {
	@GameRegistry.ObjectHolder("kraftsingles:cheeseshovel")
	public static final Item block = null;
	public ItemCheeseShovel(ElementsKraftSingles instance) {
		super(instance, 98);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("CHEESESHOVEL", 2, 5924, 16f, 4f, 50)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("cheeseshovel").setRegistryName("cheeseshovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:cheeseshovel", "inventory"));
	}
}
