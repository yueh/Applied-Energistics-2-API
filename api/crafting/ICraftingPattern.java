package appeng.api.crafting;

import appeng.api.storage.data.IAEItemStack;

/**
 * this class can be implemented if you wish to implement a TileCraftingProvider.
 */
public interface ICraftingPattern
{

	/**
	 * returns the outcome, MUST have a value.
	 * 
	 * @return
	 */
	IAEItemStack getOutput();

}
