package appeng.api.networking;

import net.minecraftforge.common.ForgeDirection;
import appeng.me.GridNode;

/**
 * Access to AE's internal grid connections.
 * 
 * Messing with connection is generally completely unnecessary, you should be able to just use IGridNode.updateState()
 * to have AE manage them for you.
 * 
 * Don't Implement.
 */
public interface IGridConnection
{

	/**
	 * lets you get the opposing node of the connection by passing your own node.
	 * 
	 * @param gridNode
	 * @return
	 */
	GridNode getOtherSide(GridNode gridNode);

	/**
	 * determine the direction of the connection based on your node.
	 * 
	 * @param gridNode
	 * @return
	 */
	ForgeDirection getDirection(GridNode gridNode);

	/**
	 * by destroying a connection you may create new grids, and trigger un-expected behavior, you should only destroy
	 * connections if you created them.
	 */
	void destroy();

	/**
	 * get node A
	 * 
	 * @return
	 */
	GridNode a();

	/**
	 * get node B
	 * 
	 * @return
	 */
	GridNode b();

	/**
	 * @return if the connection is invisible this returns false
	 */
	boolean hasDirection();

}