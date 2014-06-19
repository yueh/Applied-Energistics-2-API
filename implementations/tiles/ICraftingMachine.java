package appeng.api.implementations.tiles;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraftforge.common.util.ForgeDirection;
import appeng.api.networking.crafting.ICraftingPatternDetails;

public interface ICraftingMachine
{

	boolean pushPattern(ICraftingPatternDetails patternDetails, InventoryCrafting table, ForgeDirection opposite);

}
