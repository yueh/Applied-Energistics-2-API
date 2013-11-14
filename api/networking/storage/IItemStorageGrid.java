package appeng.api.networking.storage;

import appeng.api.storage.IMEInventoryHandler;
import appeng.api.storage.data.IAEItemStack;

public interface IItemStorageGrid extends IStorageGrid
{

	/**
	 * get a cell array for network storage view
	 * 
	 * @param view
	 * @return
	 */
	public IMEInventoryHandler<IAEItemStack> getCellView(ViewType view);

	public IMEInventoryHandler<IAEItemStack> getInventory();
	
}
