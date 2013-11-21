package appeng.api.implementations;

import appeng.api.networking.IGridHost;
import appeng.api.parts.IBusPart;
import appeng.api.storage.data.IAEStack;

/**
 * The Storage monitor is a IBusPart located on the sides of a IPartHost
 */
public interface IPartStorageMonitor extends IPartMonitor, IBusPart, IGridHost
{

	/**
	 * @return the item being displayed on the storage monitor, in AEStack Form,
	 *         can be either a IAEItemStack or an IAEFluidStack the quantity is
	 *         important remember to use getStackSize() on the IAEStack, and not
	 *         on the FluidStack/ItemStack acquired from it.
	 */
	IAEStack getDisplayed();

	/**
	 * @return the current locked state of the Storage Monitor
	 */
	boolean isLocked();

}