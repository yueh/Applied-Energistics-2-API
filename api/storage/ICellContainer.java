package appeng.api.storage;

import java.util.List;

/**
 * 
 * Represents a tile that contributes to storage, such as a ME Chest, or ME Drive.
 * 
 */
public interface ICellContainer
{

	/**
	 * Inventory of the tile for use with ME, should always return an valid list, never NULL.
	 * 
	 * You must return the correct Handler for the correct channel, if your handler returns a IAEItemStack handler, for
	 * a Fluid Channel stuffs going to explode, same with the reverse.
	 * 
	 */
	List<IMEInventoryHandler> getCellArray(StorageChannel channel);

	/**
	 * the storage's priority.
	 * 
	 * Positive and negative are supported
	 */
	int getPriority();

}
