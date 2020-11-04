package net.mcreator.kraftsingles.procedure;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.common.DimensionManager;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.world.Teleporter;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.kraftsingles.world.WorldCheeseWorld;
import net.mcreator.kraftsingles.item.ItemNujabes;
import net.mcreator.kraftsingles.item.ItemEmptyJar;
import net.mcreator.kraftsingles.ElementsKraftSingles;

import java.util.Iterator;

@ElementsKraftSingles.ModElement.Tag
public class ProcedureCumJarFoodEaten extends ElementsKraftSingles.ModElement {
	public ProcedureCumJarFoodEaten(ElementsKraftSingles instance) {
		super(instance, 23);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CumJarFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CumJarFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		double Arandomnumer = 0;
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemEmptyJar.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		Arandomnumer = (double) Math.random();
		if (((Arandomnumer) < 0.1)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HUNGER, (int) 4, (int) 160));
		} else {
			if (((Arandomnumer) < 0.2)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 5, (int) 5));
			} else {
				if (((Arandomnumer) < 0.5)) {
					if (!entity.world.isRemote && !entity.isRiding() && !entity.isBeingRidden() && entity instanceof EntityPlayerMP) {
						int dimensionID = WorldCheeseWorld.DIMID;
						class TeleporterDirect extends Teleporter {
							public TeleporterDirect(WorldServer worldserver) {
								super(worldserver);
							}

							@Override
							public void placeInPortal(Entity entity, float yawrotation) {
							}

							@Override
							public boolean placeInExistingPortal(Entity entity, float yawrotation) {
								return true;
							}

							@Override
							public boolean makePortal(Entity entity) {
								return true;
							}
						}
						EntityPlayerMP _player = (EntityPlayerMP) entity;
						_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID,
								new TeleporterDirect(_player.getServerWorld()));
						_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
								DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
								DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
					}
					if (!world.isRemote) {
						world.createExplosion(null, (int) (entity.posX), (int) (entity.posY), (int) (entity.posZ), (float) 6, true);
					}
				} else {
					if (((Arandomnumer) < 0.55)) {
						if (entity instanceof EntityLivingBase)
							((EntityLivingBase) entity).setHealth((float) 20);
					} else {
						if (((Arandomnumer) < 0.6)) {
							if (entity instanceof EntityLivingBase)
								((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SATURATION, (int) 20, (int) 3));
						} else {
							if (((Arandomnumer) <= (0.6 + (1 / 8192)))) {
								if (entity instanceof EntityPlayerMP) {
									Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
											.getAdvancement(new ResourceLocation("kraftsingles:shinypokemon"));
									AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
									if (!_ap.isDone()) {
										Iterator _iterator = _ap.getRemaningCriteria().iterator();
										while (_iterator.hasNext()) {
											String _criterion = (String) _iterator.next();
											((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
										}
									}
								}
							} else {
								if (((Arandomnumer) < 0.7)) {
									entity.motionX = 0;
									entity.motionY = 40;
									entity.motionZ = 0;
								} else {
									if (((Arandomnumer) < 0.8)) {
										entity.setFire((int) 25);
									} else {
										if (((Arandomnumer) < 0.9)) {
											if (entity instanceof EntityPlayer) {
												ItemStack _setstack = new ItemStack(Items.DIAMOND, (int) (1));
												_setstack.setCount(1);
												ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
											}
										} else {
											if (((Arandomnumer) <= 1)) {
												if (entity instanceof EntityPlayer) {
													ItemStack _setstack = new ItemStack(ItemNujabes.block, (int) (1));
													_setstack.setCount(1);
													ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (!entity.world.isRemote && !entity.isRiding() && !entity.isBeingRidden() && entity instanceof EntityPlayerMP) {
			int dimensionID = WorldCheeseWorld.DIMID;
			class TeleporterDirect extends Teleporter {
				public TeleporterDirect(WorldServer worldserver) {
					super(worldserver);
				}

				@Override
				public void placeInPortal(Entity entity, float yawrotation) {
				}

				@Override
				public boolean placeInExistingPortal(Entity entity, float yawrotation) {
					return true;
				}

				@Override
				public boolean makePortal(Entity entity) {
					return true;
				}
			}
			EntityPlayerMP _player = (EntityPlayerMP) entity;
			_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID, new TeleporterDirect(_player.getServerWorld()));
			_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
					DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1, DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(),
					_player.rotationYaw, _player.rotationPitch);
		}
		world.playSound((EntityPlayer) null, (entity.posX), (entity.posY), (entity.posZ),
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("kraftsingles:cheesewarp")),
				SoundCategory.NEUTRAL, (float) 1, (float) 1);
		entity.setPositionAndUpdate((entity.posX), 80, (entity.posZ));
		entity.fallDistance = (float) (0);
	}
}
