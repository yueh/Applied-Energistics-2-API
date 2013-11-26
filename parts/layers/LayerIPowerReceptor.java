package appeng.api.parts.layers;

import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import appeng.api.parts.IBusPart;
import appeng.api.parts.IPartHost;
import appeng.api.parts.LayerBase;
import buildcraft.api.power.IPowerReceptor;
import buildcraft.api.power.PowerHandler;
import buildcraft.api.power.PowerHandler.PowerReceiver;

public class LayerIPowerReceptor extends LayerBase implements IPowerReceptor
{

	@Override
	public PowerReceiver getPowerReceiver(ForgeDirection side)
	{
		IBusPart part = getPart( side );
		if ( part instanceof IPowerReceptor )
			return ((IPowerReceptor) part).getPowerReceiver( side );
		return null;
	}

	@Override
	public void doWork(PowerHandler workProvider)
	{
		// do nothing, this seems pointless.
	}

	@Override
	public World getWorld()
	{
		return ((IPartHost) this).getTile().worldObj;
	}

}
