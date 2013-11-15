package appeng.api.networking;


/**
 * 
 * Allows you to create a network wise service, AE2 uses these for providing item, spatial, and tunnel services.
 * 
 * Any Class that implements this, should have a default constructor that takes no arguments.
 * 
 */
public interface IGridCache
{

	/**
	 * Called each tick for the network, allows you to have active network wide behaviors.
	 * 
	 * @param grid
	 */
	void onUpdateTick(IGrid grid);

	/**
	 * inform your cache, that a machine was removed from the grid.
	 * 
	 * @param gridNode
	 * 
	 * @param machine
	 */
	void removeNode(IGrid grid, IGridNode gridNode, IGridHost machine);

	/**
	 * informs you cache that a machine was added to the grid.
	 * 
	 * @param gridNode
	 * 
	 * @param machine
	 */
	void addNode(IGrid grid, IGridNode gridNode, IGridHost machine);

}
