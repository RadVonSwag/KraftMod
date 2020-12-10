
package net.mcreator.kraftsingles.keybind;

@ElementsKraftSingles.ModElement.Tag
public class KeyBindingSound extends ElementsKraftSingles.ModElement {

	private KeyBinding keys;

	public KeyBindingSound(ElementsKraftSingles instance) {
		super(instance, 111);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		elements.addNetworkMessage(KeyBindingPressedMessageHandler.class, KeyBindingPressedMessage.class, Side.SERVER);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void init(FMLInitializationEvent event) {
		keys = new KeyBinding("key.mcreator.sound", Keyboard.KEY_N, "key.categories.misc");
		ClientRegistry.registerKeyBinding(keys);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (Minecraft.getMinecraft().currentScreen == null) {
			if (org.lwjgl.input.Keyboard.isKeyDown(keys.getKeyCode())) {
				KraftSingles.PACKET_HANDLER.sendToServer(new KeyBindingPressedMessage());
				pressAction(Minecraft.getMinecraft().player);
			}
		}
	}

	public static class KeyBindingPressedMessageHandler implements IMessageHandler<KeyBindingPressedMessage, IMessage> {

		@Override
		public IMessage onMessage(KeyBindingPressedMessage message, MessageContext context) {
			EntityPlayerMP entity = context.getServerHandler().player;
			entity.getServerWorld().addScheduledTask(() -> {
				pressAction(entity);
			});
			return null;
		}
	}

	public static class KeyBindingPressedMessage implements IMessage {

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) {
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) {
		}

	}

	private static void pressAction(EntityPlayer entity) {
		World world = entity.world;
		int x = (int) entity.posX;
		int y = (int) entity.posY;
		int z = (int) entity.posZ;

		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;

		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();

			ProcedureSounding.executeProcedure($_dependencies);
		}
	}

}
