package net.mcreator.kraftsingles.procedure;

@ElementsKraftSingles.ModElement.Tag
public class ProcedureTAKINGREFINEDCHEESE extends ElementsKraftSingles.ModElement {

	public ProcedureTAKINGREFINEDCHEESE(ElementsKraftSingles instance) {
		super(instance, 30);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies){
		if(dependencies.get("x")==null){
			System.err.println("Failed to load dependency x for procedure TAKINGREFINEDCHEESE!");
			return;
		}
		if(dependencies.get("y")==null){
			System.err.println("Failed to load dependency y for procedure TAKINGREFINEDCHEESE!");
			return;
		}
		if(dependencies.get("z")==null){
			System.err.println("Failed to load dependency z for procedure TAKINGREFINEDCHEESE!");
			return;
		}
		if(dependencies.get("world")==null){
			System.err.println("Failed to load dependency world for procedure TAKINGREFINEDCHEESE!");
			return;
		}

            int x =(int)dependencies.get("x" );
            int y =(int)dependencies.get("y" );
            int z =(int)dependencies.get("z" );
            World world =(World)dependencies.get("world" );

		if (((((new Object(){
	public ItemStack getItemStack(BlockPos pos,int sltid){
		TileEntity inv=world.getTileEntity(pos);
		if(inv instanceof TileEntityLockableLoot)
		return((TileEntityLockableLoot)inv).getStackInSlot(sltid);
		return ItemStack.EMPTY;
		}
		}.getItemStack(new BlockPos((int)x,(int)y,(int)z),(int)(0))).getItem()== new ItemStack(ItemEmptyJar.block, (int)(1)).getItem())&&((new Object(){
	public ItemStack getItemStack(BlockPos pos,int sltid){
		TileEntity inv=world.getTileEntity(pos);
		if(inv instanceof TileEntityLockableLoot)
		return((TileEntityLockableLoot)inv).getStackInSlot(sltid);
		return ItemStack.EMPTY;
		}
		}.getItemStack(new BlockPos((int)x,(int)y,(int)z),(int)(1))).getItem()== new ItemStack(ItemUnrefinedCheese.block, (int)(1)).getItem()))&&(&&((new Object(){
	public int getAmount(BlockPos pos,int sltid){
		TileEntity inv=world.getTileEntity(pos);
		if(inv instanceof TileEntityLockableLoot){
		ItemStack stack=((TileEntityLockableLoot)inv).getStackInSlot(sltid);
		if(stack!=null)
		return stack.getCount();
		}
		return 0;
		}
		}.getAmount(new BlockPos((int)x,(int)y,(int)z),(int)(1)))>=4)))) {{
	TileEntity inv=world.getTileEntity(new BlockPos((int)x,(int)y,(int)z));
    if(inv!=null&&(inv instanceof TileEntityLockableLoot)){
    	ItemStack stack=((TileEntityLockableLoot)inv).getStackInSlot((int)(2));
    	if(stack!=null){
    		if(stack.attemptDamageItem((int) 4,new Random(),null)){
    			stack.shrink(1);
    			stack.setItemDamage(0);
			}
    	}
    }
}{
	TileEntity inv=world.getTileEntity(new BlockPos((int)x,(int)y,(int)z));
	if(inv instanceof TileEntityLockableLoot)
		((TileEntityLockableLoot)inv).decrStackSize((int)(0),(int)(1));
}{
	TileEntity inv=world.getTileEntity(new BlockPos((int)x,(int)y,(int)z));
	if(inv instanceof TileEntityLockableLoot)
		((TileEntityLockableLoot)inv).decrStackSize((int)(1),(int)(4));
}{
	TileEntity inv=world.getTileEntity(new BlockPos((int)x,(int)y,(int)z));
	if(inv!=null&&(inv instanceof TileEntityLockableLoot)) {
		ItemStack _setstack = new ItemStack(ItemKraftCheese.block, (int)(1));
		_setstack.setCount(1);
		((TileEntityLockableLoot)inv).setInventorySlotContents((int)(3), _setstack);
	}
}}

	}

}
