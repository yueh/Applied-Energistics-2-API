package appeng.api.networking.crafting;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * A place to send Items for crafting purposes, this is considered part of AE's External crafting system.
 */
public interface ICraftingMedium
{

	/**
	 * instruct a medium to create the item represented by the pattern+details, the items on the table, and where if
	 * possible the output should be directed.
	 * 
	 * @param pattern
	 * @param patternDetails
	 * @param table
	 * @param where
	 * @return
	 */
	boolean pushPattern(ICraftingPatternDetails patternDetails, InventoryCrafting table, ForgeDirection where);

}
