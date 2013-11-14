package appeng.api.util;

import java.util.ArrayList;

import net.minecraft.world.World;

public interface ICommonTile
{

	/**
	 * implemented on AE's Tile Entities, Gets a list of drops that the entity will normally drop, this dosn't include
	 * the block itself.
	 * 
	 * @param w
	 * @param x
	 * @param y
	 * @param z
	 * @param drops
	 */

	void getDrops(World w, int x, int y, int z, ArrayList drops);

}
