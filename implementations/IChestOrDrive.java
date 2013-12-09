package appeng.api.implementations;

import appeng.api.networking.IGridHost;
import appeng.api.storage.ICellContainer;

public interface IChestOrDrive extends ICellContainer, IGridHost
{

	/**
	 * @return how many slots are available. Chest has 1, Drive has 10.
	 */
	int slotCount();

	/**
	 * 0 - black,
	 * 
	 * 1 - green,
	 * 
	 * 2 - orange,
	 * 
	 * 3 - red
	 * 
	 * @param slot
	 * @return status of the slot, one of the above indices.
	 */
	int slotStatus(int slot);

}
