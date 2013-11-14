package appeng.api.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Gives easy access to diffrent part of the various, items/blocks/materials in AE.
 */
public interface AEItemDefinition
{

	/**
	 * returns the Block Implementation if applicable.
	 * 
	 * @return
	 */
	Block block();

	/**
	 * returns the Item Implementation if applicable.
	 */
	Item item();

	/**
	 * returns an item stack with specified quantity.
	 * 
	 * @return
	 */
	ItemStack stack(int stackSize);

	/**
	 * Compare Item with this item type.
	 * 
	 * @param is
	 * @return
	 */
	boolean sameAs(ItemStack is);

}
