package appeng.api.storage;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import appeng.api.config.FuzzyMode;
import appeng.api.storage.data.IAEItemStack;

public interface ICellInventory extends IMEInventory<IAEItemStack>
{

	/**
	 * @return the item stack of this storage cell.
	 */
	ItemStack getItemStack();

	/**
	 * @return idle cost for this Storage Cell
	 */
	double getIdleDrain();

	/**
	 * @return fuzzy setting
	 */
	FuzzyMode getFuzzyMode();

	/**
	 * @return access configured list
	 */
	IInventory getConfigInventory();

	/**
	 * @return access installed upgrades.
	 */
	IInventory getUpgradesInventory();

	/**
	 * @return How many bytes are used for each type?
	 */
	int BytesPerType();

	/**
	 * @return true if a new item type can be added.
	 */
	boolean canHoldNewItem();

	/**
	 * @return total byte storage.
	 */
	long totalBytes();

	/**
	 * @return how many bytes are free.
	 */
	long freeBytes();

	/**
	 * @return how many bytes are in use.
	 */
	long usedBytes();

	/**
	 * @return max number of types.
	 */
	long getTotalItemTypes();

	/**
	 * @return how many items are stored.
	 */
	long storedItemCount();

	/**
	 * @return how many items types are currently stored.
	 */
	long storedItemTypes();

	/**
	 * @return how many item types remain.
	 */
	long remainingItemTypes();

	/**
	 * @return how many more items can be stored.
	 */
	long remainingItemCount();

	/**
	 * @return how many items can be added without consuming another byte.
	 */
	int unusedItemCount();

	/**
	 * @return the status number for this drive.
	 */
	int getStatusForCell();

}
