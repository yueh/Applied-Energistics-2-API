package appeng.api.networking;

import java.util.EnumSet;

import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

/**
 * 
 * Gives you a view into your Nodes connections and information.
 * 
 * updateState, getGrid, destroy are required to implement a proper IGridHost.
 * 
 * Don't Implement.
 * 
 */
public interface IGridNode
{

	/**
	 * lets you walk the grid stating at the current node using a IGridVisitor,
	 * generaly not needed, please use only if required.
	 * 
	 * @param g
	 */
	void beginVisition(IGridVisitor g);

	/**
	 * inform the node that your IGridBlock has changed its internal state, and
	 * force the node to update.
	 * 
	 * ALWAYS make sure that your tile entity is in the world, and has its node
	 * properly saved to be returned from the host before updating state,
	 * 
	 * If your entity is not in the world, or if you IGridHost returns a
	 * different node for the same side you will likely crash the game.
	 * 
	 */
	void updateState();

	/**
	 * get the machine represented by the node.
	 * 
	 * @return
	 */
	IGridHost getMachine();

	/**
	 * get the grid for the node, this can change at a moments notice.
	 * 
	 * @return
	 */
	IGrid getGrid();

	/**
	 * By destroying your node, you destroy any connections, and its existance
	 * in the grid, use in invalidate, or onChunkUnload
	 */
	void destroy();

	/**
	 * the world the node is located in.
	 * 
	 * @return
	 */
	World getWorld();

	/**
	 * returns a set of the connected sides, UNKNOWN represents an invisible
	 * connection.
	 * 
	 * @return
	 */
	EnumSet<ForgeDirection> getConnectedSides();

	/**
	 * lets you iterate a nodes connections
	 * 
	 * @return
	 */
	Iterable<IGridConnection> getConnections();

	/**
	 * get the IGridBlock for this node.
	 * @return
	 */
	IGridBlock getGridBlock();

	/**
	 * Reflects the networks status, returns true only if the network is powered, and
	 * the network is not booting, this also takes into account channels.
	 * 
	 * @return true if is Network node active, and participating.
	 */
	boolean isActive();
}
