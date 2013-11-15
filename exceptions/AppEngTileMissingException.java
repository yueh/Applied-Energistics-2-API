package appeng.api.exceptions;

import net.minecraft.world.World;
import appeng.api.util.DimensionalCoord;
import cpw.mods.fml.common.FMLLog;

public class AppEngTileMissingException extends Exception
{

	private static final long serialVersionUID = -3502227742711078681L;
	public DimensionalCoord dc;

	@Override
	public void printStackTrace()
	{
		try
		{
			FMLLog.info( "[AppEng] Missing Tile at " + dc.x + ", " + dc.y + ", " + dc.z + " in +"
					+ dc.getWorld().provider.dimensionId );
		} catch (Throwable _)
		{
			FMLLog.info( "[AppEng] Missing Tile at " + dc.x + ", " + dc.y + ", " + dc.z );
		}
		super.printStackTrace();
	}

	public AppEngTileMissingException(World w, int x, int y, int z) {
		dc = new DimensionalCoord( w, x, y, z );
	}

}
