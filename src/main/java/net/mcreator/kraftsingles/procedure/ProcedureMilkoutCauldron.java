package net.mcreator.kraftsingles.procedure;

@ElementsKraftSingles.ModElement.Tag
public class ProcedureMilkoutCauldron extends ElementsKraftSingles.ModElement {

	public ProcedureMilkoutCauldron(ElementsKraftSingles instance) {
		super(instance, 45);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies){
		if(dependencies.get("entity")==null){
			System.err.println("Failed to load dependency entity for procedure MilkoutCauldron!");
			return;
		}
		if(dependencies.get("x")==null){
			System.err.println("Failed to load dependency x for procedure MilkoutCauldron!");
			return;
		}
		if(dependencies.get("y")==null){
			System.err.println("Failed to load dependency y for procedure MilkoutCauldron!");
			return;
		}
		if(dependencies.get("z")==null){
			System.err.println("Failed to load dependency z for procedure MilkoutCauldron!");
			return;
		}
		if(dependencies.get("world")==null){
			System.err.println("Failed to load dependency world for procedure MilkoutCauldron!");
			return;
		}

            Entity entity =(Entity)dependencies.get("entity" );
            int x =(int)dependencies.get("x" );
            int y =(int)dependencies.get("y" );
            int z =(int)dependencies.get("z" );
            World world =(World)dependencies.get("world" );

		boolean giveItem = false;boolean giveMilk = false;double bucketStack = 0;if (((new ItemStack(Items.BUCKET, (int)(1)).getItem()== ((entity instanceof EntityLivingBase)?((EntityLivingBase)entity).getHeldItemMainhand():ItemStack.EMPTY).getItem())&&)) {{
	BlockPos _bp = new BlockPos((int)x,(int)y,(int)z);
	IBlockState _bs = BlockVat.block.getDefaultState();

	IBlockState _bso = world.getBlockState(_bp);
	for(Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
		IProperty _property = entry.getKey();
		if (_bs.getPropertyKeys().contains(_property))
			_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
	}


	world.setBlockState(_bp, _bs, 3);

}(((entity instanceof EntityLivingBase)?((EntityLivingBase)entity).getHeldItemMainhand():ItemStack.EMPTY)).shrink((int) 1);if ((((entity instanceof EntityLivingBase)?((EntityLivingBase)entity).getHeldItemMainhand():ItemStack.EMPTY).getItem()== new ItemStack(Items.BUCKET, (int)(1)).getItem())) {if(entity instanceof EntityPlayer) {
	ItemStack _setstack = new ItemStack(Items.MILK_BUCKET, (int)(1));
	_setstack.setCount(1);
	ItemHandlerHelper.giveItemToPlayer(((EntityPlayer)entity), _setstack);
}}else if ((!(((entity instanceof EntityLivingBase)?((EntityLivingBase)entity).getHeldItemMainhand():ItemStack.EMPTY).getItem()== new ItemStack(Items.BUCKET, (int)(1)).getItem()))) {if(entity instanceof EntityLivingBase) {
	ItemStack _setstack = new ItemStack(Items.MILK_BUCKET, (int)(1));
	_setstack.setCount(1);
	((EntityLivingBase)entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
	if(entity instanceof EntityPlayerMP)
		((EntityPlayerMP)entity).inventory.markDirty();
}}}

	}

}
