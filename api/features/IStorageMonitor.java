package appeng.api.features;

import appeng.api.networking.IGridBlock;
import appeng.api.storage.data.IAEItemStack;
import appeng.api.util.IOrientable;

public interface IStorageMonitor extends IOrientable, IGridBlock
{

	/**
	 * Get the item being displayed on the storage monitor, in AEItemstack Form,
	 * you can use that to get the equivalent MC ItemStack, if you need it. If
	 * the quantity is important remember to use getStackSize() on the
	 * IAEItemStack,and not ItemStack.stackSize
	 * 
	 * @return
	 */
	IAEItemStack getItem();

	/**
	 * Get the current locked state of the access terminal.
	 * 
	 * @return
	 */
	boolean isLocked();

}
