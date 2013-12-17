package appeng.api.implementations;

import appeng.api.storage.MEMontorHandler;
import appeng.api.storage.StorageChannel;

public interface IStorageMonitorable
{

	/**
	 * Get Monitor for chest.
	 * 
	 * @param chan
	 * @return
	 */
	MEMontorHandler getMonitor(StorageChannel chan);

}
