package appeng.api.networking.energy;

import appeng.api.config.AccessRestriction;

/**
 * Used to access information about AE's various power accepting blocks for monitoring purposes.
 */
public interface IAEPowerStorage
{

	/**
	 * Inject amt, power into the device, it will store what it can, and return the amount unable to be stored.
	 * 
	 * @param simulate
	 * 
	 * @return
	 */
	public double injectAEPower(double amt, boolean simulate);

	/**
	 * Attempt to extract power from the device, it will extract what it can and return it.
	 * 
	 * @param amt
	 * @return
	 */
	public double extractAEPower(double amt, boolean simulate);

	/**
	 * returns the current maximum power ( this can change :P )
	 */
	public double getAEMaxPower();

	/**
	 * returns the current AE Power Level, this may exceed getMEMaxPower()
	 */
	public double getAECurrentPower();

	/**
	 * Checked on network reset to see if your block can be used as a public power storage ( use getPowerFlow to control
	 * the behavior )
	 * 
	 * @return
	 */
	public boolean isAEPublicPowerStorage();

	/**
	 * Control the power flow by telling what the network can do, either add? or subtract? or both!
	 * 
	 * @return
	 */
	public AccessRestriction getPowerFlow();

}
