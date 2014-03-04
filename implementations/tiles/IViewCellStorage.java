package appeng.api.implementations.tiles;

import net.minecraft.inventory.IInventory;

public interface IViewCellStorage
{

	/**
	 * should contains at least 1 slot, that single slot will be used to
	 * 
	 * @return inventory with at least 1 slot
	 */
	IInventory getViewCellStorage();

}
