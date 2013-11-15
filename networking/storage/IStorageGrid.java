package appeng.api.networking.storage;

import appeng.api.networking.IGridCache;
import appeng.api.storage.StorageChannel;

/**
 * Common base class for item / fluid storage caches.
 */
public interface IStorageGrid extends IGridCache
{

	enum ViewType
	{
		ALL, STORAGE, CRAFTABLE
	};

	/**
	 * look up this Caches Storage Channel
	 * 
	 * @return
	 */
	public StorageChannel getChannel();

}
