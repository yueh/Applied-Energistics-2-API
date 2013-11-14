package appeng.api.networking;

import java.util.EnumSet;

import net.minecraftforge.common.ForgeDirection;
import appeng.api.util.AECableType;
import appeng.api.util.AEColor;
import appeng.api.util.DimensionalCoord;

/**
 * An Implementation is required to create your node for IGridHost
 * 
 * Implement for use with IGridHost
 * 
 */
public interface IGridBlock
{
	/**
	 * how much power to drain per tick as part of idle network usage.
	 * 
	 * if the value of this changes, you must post a MENetworkPowerIdleChange
	 * 
	 * @return ae/t to use.
	 */
	double getIdlePowerUsage();

	/**
	 * Various flags that AE uses to modify basic behavior for various parts of the network.
	 * @return
	 */
	EnumSet<GridFlags> getFlags();

	/**
	 * generally speaking you will return true for this, the one exception is
	 * buses, or worm holes where the node represents something that isn't a
	 * real connection in the world, but rather one represented internally to
	 * the block.
	 * 
	 * @return if the world can connect to this node, and the node can connect
	 *         to the world.
	 */
	boolean isWorldAccessable();

	/**
	 * current location of this node.
	 * 
	 * @return
	 */
	DimensionalCoord getLocation();

	/**
	 * Transparent, or a valid color, NULL IS NOT VALID.
	 * 
	 * @return
	 */
	AEColor getGridColor();

	/**
	 * Notifies your IGridBlock that changes were made to your connections
	 */
	void onGridNotification(GridNotification notification);

	/**
	 * Update Blocks network/connection/booting status. grid,
	 * 
	 * @param isReady
	 */
	public void setNetworkStatus(IGrid grid, int channelsInUse);

	/**
	 * Determine which sides of the block can be connected too
	 * 
	 * @return
	 */
	EnumSet<ForgeDirection> getConnectableSides();

	/**
	 * Determines how cables render when they connect to this block. Priority is
	 * Smart > Covered > Glass
	 * 
	 * @param dir
	 * @return
	 */
	public AECableType getCableConnectionType(ForgeDirection dir);

	/**
	 * return true if your isNetworkRunning
	 */
	public boolean isNetworkMachineActive();

	/**
	 * return the tile represented by the IGridBlock, this may be this, or not
	 * depending on your implementation
	 */
	IGridHost getMachine();

}
