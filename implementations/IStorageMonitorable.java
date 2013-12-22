package appeng.api.implementations;

import appeng.api.storage.IMEMonitor;
import appeng.api.storage.data.IAEFluidStack;
import appeng.api.storage.data.IAEItemStack;
import appeng.api.storage.data.IAEStack;

public interface IStorageMonitorable<T extends IAEStack<IAEStack>>
{

	IMEMonitor<IAEItemStack> getItemInventory();

	IMEMonitor<IAEFluidStack> getFluidInventory();

}
