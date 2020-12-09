
package net.mcreator.kraftsingles.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.kraftsingles.ElementsKraftSingles;

@ElementsKraftSingles.ModElement.Tag
public class ItemScottPilgrimRuinedWomen extends ElementsKraftSingles.ModElement {
	@GameRegistry.ObjectHolder("kraftsingles:scottpilgrimruinedwomen")
	public static final Item block = null;
	public ItemScottPilgrimRuinedWomen(ElementsKraftSingles instance) {
		super(instance, 110);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:scottpilgrimruinedwomen", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("scottpilgrimruinedwomen", ElementsKraftSingles.sounds.get(new ResourceLocation("kraftsingles:he-ruined-women")));
			setUnlocalizedName("scottpilgrimruinedwomen");
			setRegistryName("scottpilgrimruinedwomen");
			setCreativeTab(CreativeTabs.MISC);
		}
	}
}
