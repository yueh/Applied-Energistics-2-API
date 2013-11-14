package appeng.api.storage;

import appeng.api.storage.data.IAEStack;
import appeng.api.storage.data.IItemList;


/**
 * AE's Equivilant too IInventory, used to accessing and
 */
public interface IMEInventory<StackType extends IAEStack>
{

	/**
	 * Store new items, or simulate the addition of new items into the ME Inventory.
	 * 
	 * @param input
	 *            - item to add.
	 * @param simulate
	 *            - simulate, or perform action?
	 * @return returns the number of items not added, or a empty stack; NEVER NULL
	 */
	public StackType injectItems(StackType input, boolean simulate);

	/**
	 * Extract the specified item from the ME Inventory
	 * 
	 * @param request
	 *            - item to request ( with stack size. )
	 * @param simulate
	 *            - simulate, or perform action?
	 * @return returns the number of items extracted, or an empty stack; NEVER NULL
	 */
	public StackType extractItems(StackType request, boolean simulate);

	/**
	 * request a full report of all available items, storage.
	 * 
	 * @param out
	 *            - the IItemList the results will be written too
	 * @return returns same list that was passed in, is passed out
	 */
	public IItemList<StackType> getAvailableItems(IItemList out);

	/**
	 * return the type of channel your handler should be part of
	 * 
	 * @return
	 */
	public StorageChannel getChannel();

}
