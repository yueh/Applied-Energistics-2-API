package appeng.api.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Gives easy access to different part of the various, items/blocks/materials in AE.
 */
public interface AEItemDefinition
{

	/**
	 * @return the {@link Block} Implementation if applicable
	 */
	Block block();

	/**
	 * @return the {@link Item} Implementation if applicable
	 */
	Item item();

	/**
	 * @return an {@link ItemStack} with specified quantity
	 */
	ItemStack stack(int stackSize);

	/**
	 * Compare {@link ItemStack} with this {@link AEItemDefinition}
	 * 
	 * @param is
	 * @return
	 */
	boolean sameAs(ItemStack is);

}