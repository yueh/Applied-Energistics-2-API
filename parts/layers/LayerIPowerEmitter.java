package appeng.api.parts.layers;

import net.minecraftforge.common.ForgeDirection;
import appeng.api.parts.IBusPart;
import appeng.api.parts.LayerBase;
import buildcraft.api.power.IPowerEmitter;

public class LayerIPowerEmitter extends LayerBase implements IPowerEmitter
{

	@Override
	public boolean canEmitPowerFrom(ForgeDirection side)
	{
		IBusPart part = getPart( side );
		if ( part instanceof IPowerEmitter )
			return ((IPowerEmitter) part).canEmitPowerFrom( side );
		return false;
	}
}
