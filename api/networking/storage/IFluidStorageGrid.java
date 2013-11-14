package appeng.api.networking.storage;

import appeng.api.storage.IMEInventoryHandler;
import appeng.api.storage.data.IAEFluidStack;

public interface IFluidStorageGrid extends IStorageGrid
{

	/**
	 * get a cell array for network storage view
	 * 
	 * @param view
	 * @return
	 */
	public IMEInventoryHandler<IAEFluidStack> getCellView(ViewType view);

	public IMEInventoryHandler<IAEFluidStack> getInventory();
}
