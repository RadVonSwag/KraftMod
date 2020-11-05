package net.mcreator.kraftsingles.procedure;

@ElementsKraftSingles.ModElement.Tag
public class ProcedureMilkinCauldron extends ElementsKraftSingles.ModElement {

	public ProcedureMilkinCauldron(ElementsKraftSingles instance) {
		super(instance, 43);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies){
		if(dependencies.get("entity")==null){
			System.err.println("Failed to load dependency entity for procedure MilkinCauldron!");
			return;
		}
		if(dependencies.get("x")==null){
			System.err.println("Failed to load dependency x for procedure MilkinCauldron!");
			return;
		}
		if(dependencies.get("y")==null){
			System.err.println("Failed to load dependency y for procedure MilkinCauldron!");
			return;
		}
		if(dependencies.get("z")==null){
			System.err.println("Failed to load dependency z for procedure MilkinCauldron!");
			return;
		}
		if(dependencies.get("world")==null){
			System.err.println("Failed to load dependency world for procedure MilkinCauldron!");
			return;
		}

            Entity entity =(Entity)dependencies.get("entity" );
            int x =(int)dependencies.get("x" );
            int y =(int)dependencies.get("y" );
            int z =(int)dependencies.get("z" );
            World world =(World)dependencies.get("world" );

		boolean giveItem = false;boolean giveMilk = false;if (((((entity instanceof EntityLivingBase)?((EntityLivingBase)entity).getHeldItemMainhand():ItemStack.EMPTY).getItem()== new ItemStack(Items.MILK_BUCKET, (int)(1)).getItem())&&)) {if(entity instanceof EntityLivingBase) {
	ItemStack _setstack = new ItemStack(Items.BUCKET, (int)(1));
	_setstack.setCount(1);
	((EntityLivingBase)entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
	if(entity instanceof EntityPlayerMP)
		((EntityPlayerMP)entity).inventory.markDirty();
}}

	}

}
