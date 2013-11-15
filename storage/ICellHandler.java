package appeng.api.storage;

import net.minecraft.item.ItemStack;

/**
 * Registration record for {@link ICellRegistry}
 */
public interface ICellHandler
{

	/**
	 * return true if the provided item is handled by your cell handler. ( AE May choose to skip this method, and just
	 * request a handler )
	 * 
	 * @param is
	 * @return return true, if getCellHandler will not return null.
	 */
	boolean isCell(ItemStack is, StorageChannel channel);

	/**
	 * If you cannot handle the provided item, return null
	 * 
	 * @param is
	 *            a storage cell item.
	 * 
	 * @return a new IMEHandler for the provided item
	 */
	IMEInventoryHandler getCellHandler(ItemStack is, StorageChannel channel);

}