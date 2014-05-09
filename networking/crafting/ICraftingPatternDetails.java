package appeng.api.networking.crafting;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import appeng.api.storage.data.IAEItemStack;

public interface ICraftingPatternDetails
{

	ItemStack getPattern();

	boolean isValidItemForSlot(int slotIndex, ItemStack i, World w);

	boolean isCraftable();

	IAEItemStack[] getInputs();

	IAEItemStack[] getOutputs();

	boolean canSubstitute();

	ItemStack getOutput(InventoryCrafting craftingInv, World w);

}
