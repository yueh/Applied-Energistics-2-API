package appeng.api.networking.energy;

import appeng.api.networking.IGridCache;
import appeng.api.networking.events.MENetworkPowerStatusChange;

public interface IEnergyGrid extends IGridCache, IEnergyGridProvider
{
	/**
	 * AE maintains an idle draw of power separate from active power draw,
	 * it condenses this into a single operation that determines the networks
	 * "powered state" if the network is considered off-line, your machines
	 * should not function.
	 * 
	 * {@link MENetworkPowerStatusChange} events are posted when this value
	 * changes if you need to be notified of the change, most machines can
	 * simply test the value when they operate.
	 * 
	 * @return if the network is powered or not.
	 */
	public boolean isNetworkPowered();
	
	/**
	 * AE will accept any power, and store it, to maintain sanity please don't send more then 10,000 at a time.
	 * 
	 * IMPORTANT: Network power knows no bounds, for less spamy power flow, networks can store more then their alloted
	 * storage, however, it should be kept to a minimum, to help with this, this method returns the networks current
	 * OVERFLOW, this is not energy you can store some where else, its already stored in the network, you can extract it
	 * if you want, however it it owned by the network, this is different then IAEEnergyStore
	 * 
	 * Another important not, is that if a network that had hover flow is deleted, its power is gone, this is one of the
	 * reasons why keeping overflow to a minimum is important.
	 * 
	 * @param amt
	 *            power to inject into the network
	 * @param simulate
	 *            should the action be simulated or performed?
	 * @return the amount of power that the network has OVER the limit.
	 */
	public double injectPower(double amt, boolean simulate);

	/**
	 * Extract power from the network.
	 * 
	 * @param amt
	 * @param simulate
	 *            should the action be simulated or performed?
	 * @return returns extracted power.
	 */
	public double extractPower(double amt, boolean simulate);

	/**
	 * this is should be considered an estimate, and not relied upon for real calculations.
	 * 
	 * @return estimated available power.
	 */
	public double getStoredPower();
}
