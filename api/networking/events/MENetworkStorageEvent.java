package appeng.api.networking.events;

import appeng.api.storage.StorageChannel;
import appeng.api.storage.data.IItemList;

/**
 * posted by the network when the networks Storage Changes, you can use the currentItems list to check levels, and update status.
 * 
 * Do not modify the list or its contents in anyway.
 */
public class MENetworkStorageEvent extends MENetworkEvent
{

	public final IItemList currentItems;
	public final StorageChannel channel;

	public MENetworkStorageEvent(IItemList o, StorageChannel chan) {
		currentItems = o;
		channel = chan;
	}

}
