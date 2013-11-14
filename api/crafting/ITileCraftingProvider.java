package appeng.api.crafting;

/**
 * Allows a tile to provide crafting patterns to the network, post a GridPatternUpdateEvent to tell AE to update.
 */
public interface ITileCraftingProvider extends IPushable
{

	/**
	 * called when the network is looking for possible crafting jobs.
	 * 
	 * @param craftingTracker
	 */
	void provideCrafting(ICraftingTracker craftingTracker);

}
