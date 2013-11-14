package appeng.api.networking;

import net.minecraftforge.common.ForgeDirection;

/**
 * 
 * Implement to create a networked tile entity, must be implemented on a
 * TileEntity to work correctly.
 * 
 */
public interface IGridHost
{

	/**
	 * get the grid node for a particular side of a block, you can return null,
	 * by returning a valid node later and calling updatState, you can join the
	 * Grid when your block is ready.
	 * 
	 * @param dir
	 *            feel free to ignore this, most blocks will use the same node
	 *            for every side.
	 * @return a new IGridNode, create these with
	 *         AEApi.instance().createGridNode( MyIGridBlock )
	 */
	public IGridNode getGridNode(ForgeDirection dir);

}
