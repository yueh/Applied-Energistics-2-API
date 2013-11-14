package appeng.api.storage;

import appeng.api.config.AccessRestriction;
import appeng.api.storage.data.IAEStack;

public interface IMEInventoryHandler<StackType extends IAEStack> extends IMEInventory<StackType>
{

	/**
	 * determine if items can be injected/extracted.
	 * 
	 * @return the access
	 */
	public AccessRestriction getAccess();

	/**
	 * determine if a particular item is prioritized for this inventory handler, if it is, then it will be added to this
	 * inventory prior to any non-prioritiezed inventories.
	 * 
	 * @param input
	 *            - item that might be added
	 * @return if its prioritized
	 */
	public boolean isPrioritized(StackType input);

	/**
	 * determine if an item can be accepted and stored.
	 * 
	 * @param input
	 *            - item that might be added
	 * @return if the item can be added
	 */
	public boolean canAccept(StackType input);

	/**
	 * determine what the priority of the inventory is.
	 * 
	 * @return the priority, zero is default, positive and negative are supported.
	 */
	public int getPriority();

}
