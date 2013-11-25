package appeng.api.parts.layers;

import net.minecraftforge.common.ForgeDirection;
import appeng.api.parts.IBusPart;
import appeng.api.parts.LayerBase;
import buildcraft.api.power.IPowerEmitter;
import buildcraft.api.transport.IPipeConnection;
import buildcraft.api.transport.IPipeTile.PipeType;

public class LayerIPipeConnection extends LayerBase implements IPipeConnection
{

	@Override
	public ConnectOverride overridePipeConnection(PipeType type, ForgeDirection with)
	{
		IBusPart part = getPart( with );
		if ( part instanceof IPowerEmitter )
			return ((IPipeConnection) part).overridePipeConnection( type, with );
		return ConnectOverride.DEFAULT;
	}

}
