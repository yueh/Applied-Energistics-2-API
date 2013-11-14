package appeng.api.storage;

import appeng.api.IAppEngApi;
import net.minecraft.item.ItemStack;

/**
 * Storage Cell Registry, used for specially implemented cells, if you just want
 * to make a item act like a cell, or new cell with different bytes, then you
 * should probably consider IStorageCell instead its considerably simpler.
 * 
 * Do not Implement, obtained via {@link IAppEngApi}.getCellRegistry()
 */
public interface ICellRegistry
{

	/**
	 * Register a new handler.
	 * 
	 * @param h
	 */
	void addCellHandler(ICellHandler h);

	/**
	 * returns true if the provided item, can be handled by a handler in AE, (
	 * AE May choose to skip this and just get the handler instead. )
	 * 
	 * @param is
	 * @return returns true, if you can get a InventoryHandler for the item
	 *         passed.
	 */
	boolean isCellHandled(ItemStack is, StorageChannel channel);

	/**
	 * returns an IMEInventoryHandler for the provided item.
	 * 
	 * @param is
	 * @return new IMEInventoryHandler, or null if there isn't one.
	 */
	IMEInventoryHandler getHandlerForCell(ItemStack is, StorageChannel channel);

}
