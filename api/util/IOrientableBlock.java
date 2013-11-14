package appeng.api.util;

import net.minecraft.world.IBlockAccess;

/**
 * Implemented on many of AE's non Tile Entity Blocks as a way to get a IOrientable.
 */
public interface IOrientableBlock
{
	
	/**
	 * returns a IOrientable if applicable.
	 * 
	 * @param w
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	IOrientable getOrientable(IBlockAccess w, int x, int y, int z);
	
}
