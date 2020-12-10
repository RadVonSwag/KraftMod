package net.mcreator.kraftsingles.procedure;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.init.Enchantments;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.kraftsingles.item.ItemCheeseSword;
import net.mcreator.kraftsingles.ElementsKraftSingles;

@ElementsKraftSingles.ModElement.Tag
public class ProcedureSharp extends ElementsKraftSingles.ModElement {
	public ProcedureSharp(ElementsKraftSingles instance) {
		super(instance, 118);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Sharp!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemCheeseSword.block, (int) (1)).getItem())
				&& (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.isItemEnchanted()))) {
			if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).hasTagCompound()
					? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getTagCompound()
							.getDouble("Extra Sharp")
					: -1) < (EnchantmentHelper.getEnchantmentLevel(Enchantments.SHARPNESS,
							((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))))) {
				(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)).addAttributeModifier(
						"generic.attackDamage",
						new AttributeModifier("generic.attackDamage", (12 * (1 + (0.1 * (EnchantmentHelper.getEnchantmentLevel(Enchantments.SHARPNESS,
								((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)))))), 0),
						EntityEquipmentSlot.MAINHAND);
				(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)).addAttributeModifier(
						"generic.attackSpeed", new AttributeModifier("generic.attackSpeed", 0.625, 1), EntityEquipmentSlot.MAINHAND);
				{
					ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (!_stack.hasTagCompound())
						_stack.setTagCompound(new NBTTagCompound());
					_stack.getTagCompound().setDouble("Extra Sharp", (EnchantmentHelper.getEnchantmentLevel(Enchantments.SHARPNESS,
							((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))));
				}
			}
		}
	}
}
