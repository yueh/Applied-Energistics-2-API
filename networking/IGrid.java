package appeng.api.networking;

import appeng.api.networking.events.MENetworkEvent;
import appeng.me.GridNode;

/**
 * Gives you access to Grid based information.
 * 
 * Don't Implement.
 */
public interface IGrid
{

	/**
	 * Get a grid cache of the specified type
	 * 
	 * @param id
	 * @return
	 */
	public <C extends IGridCache> C getCache(Class<? extends IGridCache> iface);

	/**
	 * Post an event into the network event bus.
	 * 
	 * @param ev
	 *            - event to post
	 * @return returns ev back to original poster
	 */
	public MENetworkEvent postEvent(MENetworkEvent ev);

	/**
	 * Post an event into the network event bus, but direct it at a single node.
	 * 
	 * @param ev
	 *            - event to post
	 * @return returns ev back to original poster
	 */
	public MENetworkEvent postEventTo(IGridNode node, MENetworkEvent ev);

	/**
	 * get a list of the diversity of classes, you can use this to better detect which machines your interested in,
	 * rather then iterating the entire grid to test them.
	 * 
	 * @return
	 */
	public Iterable<Class> getMachinesClasses();

	/**
	 * Get machines on the network.
	 * 
	 * @param c
	 * @return
	 */
	public Iterable<IGridNode> getMachines(Class c);

	/**
	 * lets you iterate all the nodes on a network, use with caution.
	 * 
	 * @return
	 */
	Iterable<GridNode> getNodes();

	/**
	 * the current grids status, returns true if the grid is ready and operating
	 * 
	 * @return
	 */
	public boolean isReady();
}
