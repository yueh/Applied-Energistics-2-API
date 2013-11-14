package appeng.api.util;

import cpw.mods.fml.common.Mod.Block;
import net.minecraftforge.common.ForgeDirection;

/**
 * Nearly all of AE's Tile Entities implement IOrientable.
 * 
 * and it can be used to manipulate the direction of some machines, most of these orientations are purely visual.
 * 
 * AE also responds to {@link Block}.rotateBlock
 */
public interface IOrientable
{

	/**
	 * true or false, if the tile rotation is meaningful, or even changeable.
	 * 
	 * @return
	 */
	boolean canBeRotated();

	/**
	 *  Returns the direction the tile is facing.
	 * @return
	 */
	ForgeDirection getForward();

	/**
	 *  Returns the direction the top of the tile is facing.
	 * @return
	 */
	ForgeDirection getUp();

	/**
	 *  Update the orientation
	 * @param Forward
	 * @param Up
	 */
	void setOrientation(ForgeDirection Forward, ForgeDirection Up);

}
