package appeng.api.networking.energy;

import java.util.Set;


/**
 * internal use only.
 */
public interface IEnergyGridProvider
{

	/**
	 * internal use only
	 */
	public double extractAEPower(double amt, boolean simulate, Set<IEnergyGrid> seen);

}
