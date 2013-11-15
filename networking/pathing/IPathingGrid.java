package appeng.api.networking.pathing;

import appeng.api.networking.IGridCache;

public interface IPathingGrid extends IGridCache {

	/**
	 * @return true if the network is in its booting stage
	 */
	boolean isNetworkBooting();
	
}