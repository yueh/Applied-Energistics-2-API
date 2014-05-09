package appeng.api.networking.events;

import appeng.api.networking.crafting.ICraftingProvider;

/**
 * posted by the ICraftingProvider's when their patterns change, tells the network to update its list.
 */
public class MECraftingPatternUpdate extends MENetworkEvent
{

	final ICraftingProvider what;

	public MECraftingPatternUpdate(ICraftingProvider provider) {
		what = provider;
	}

}
