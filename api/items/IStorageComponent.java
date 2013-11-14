package appeng.api.items;

import net.minecraft.item.ItemStack;

public interface IStorageComponent
{

	/**
	 * This isn't necessarily the same as if you make a storage cell out of it,
	 * but all of AE's default cells do it that way, its currently only used for
	 * the condenser.
	 * 
	 * @param cellItem
	 * @return numberofBytes
	 */
	int getBytes(ItemStack is);

	/**
	 * Just true or false for the item stack.
	 * 
	 * @param is
	 * @return
	 */
	boolean isStorageComponent(ItemStack is);

}
