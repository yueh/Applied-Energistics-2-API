package appeng.api.crafting;

import net.minecraft.item.ItemStack;

/**
 * A IPushable should return what doesn't fit, so that the crafting request cannot complete, stalling the action and
 * saving your resources.
 */
public interface IPushable
{

	/**
	 * is this pushable busy?
	 * 
	 * @return
	 */
	boolean isBusy();

	/**
	 * Attempt to send an item.
	 * 
	 * @param out
	 * @return
	 */
	ItemStack pushItem(ItemStack out);

	/**
	 * Test if a push is possible.
	 * 
	 * @param out
	 * @return
	 */
	boolean canPushItem(ItemStack out);
}
