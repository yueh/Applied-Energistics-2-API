package appeng.api.networking.pathing;

import appeng.api.networking.IGridCache;

public interface IPathingGrid extends IGridCache {

	/**
	 * returns true if the network is in its booting stage.
	 * 
	 * @return
	 */
	boolean isNetworkBooting();
	
}
