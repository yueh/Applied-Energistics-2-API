package appeng.api.items;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import appeng.api.util.WorldCoord;

public interface ISpatialStorageCell
{

	/**
	 * return true if this item is a spatial storage cell.
	 * 
	 * @param is
	 * @return
	 */
	boolean isSpatialStorage(ItemStack is);

	/**
	 * return the maximum size of the spatial storage cell along any given axis.
	 * 
	 * @param is
	 * @return
	 */
	int getMaxStoredDim(ItemStack is);

	/**
	 * returns the world for this cell.
	 * 
	 * @param is
	 * @return
	 */
	World getWorld(ItemStack is);

	/**
	 * get the currently stored size.
	 * 
	 * @param is
	 * @return
	 */
	WorldCoord getStoredSize(ItemStack is);

	/**
	 * Minimum coordinates in its world for the storage cell.
	 * 
	 * @param is
	 * @return
	 */
	WorldCoord getMin(ItemStack is);

	/**
	 * Maximum coordinates in its world for the storage cell.
	 * 
	 * @param is
	 * @return
	 */
	WorldCoord getMax(ItemStack is);

	/**
	 * Perform a spatial swap with the contents of the cell, and the world.
	 * 
	 * @param is
	 * @param w
	 * @param min
	 * @param max
	 * @param doTransition
	 * @return
	 */
	TransitionResult doSpatialTransition(ItemStack is, World w, WorldCoord min, WorldCoord max, boolean doTransition);

}
