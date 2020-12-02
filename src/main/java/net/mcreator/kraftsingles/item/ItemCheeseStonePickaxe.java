
package net.mcreator.kraftsingles.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.kraftsingles.creativetab.TabKraftSingles;
import net.mcreator.kraftsingles.ElementsKraftSingles;

import java.util.Set;
import java.util.HashMap;

@ElementsKraftSingles.ModElement.Tag
public class ItemCheeseStonePickaxe extends ElementsKraftSingles.ModElement {
	@GameRegistry.ObjectHolder("kraftsingles:cheesepickaxe")
	public static final Item block = null;
	public ItemCheeseStonePickaxe(ElementsKraftSingles instance) {
		super(instance, 53);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("CHEESEPICKAXE", 2, 200, 8f, 3f, 25)) {
			{
				this.attackSpeed = -2.7999999999999998f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("cheesepickaxe").setRegistryName("cheesepickaxe").setCreativeTab(TabKraftSingles.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:cheesepickaxe", "inventory"));
	}
}
