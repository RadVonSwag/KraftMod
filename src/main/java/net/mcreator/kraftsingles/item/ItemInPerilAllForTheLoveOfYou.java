
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
public class ItemInPerilAllForTheLoveOfYou extends ElementsKraftSingles.ModElement {
	@GameRegistry.ObjectHolder("kraftsingles:inperilallfortheloveofyou")
	public static final Item block = null;
	public ItemInPerilAllForTheLoveOfYou(ElementsKraftSingles instance) {
		super(instance, 109);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kraftsingles:inperilallfortheloveofyou", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("inperilallfortheloveofyou", ElementsKraftSingles.sounds.get(new ResourceLocation("kraftsingles:inperilallfortheloveofyou")));
			setUnlocalizedName("inperilallfortheloveofyou");
			setRegistryName("inperilallfortheloveofyou");
			setCreativeTab(CreativeTabs.MISC);
		}
	}
}
