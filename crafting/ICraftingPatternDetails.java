package appeng.api.crafting;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import appeng.api.storage.data.IAEItemStack;

public interface ICraftingPatternDetails
{

	boolean isValidItemForSlot(int slotIndex, ItemStack i, World w);

	boolean isCraftable();

	IAEItemStack[] getInputs();

	IAEItemStack[] getOutputs();

	boolean canSubstitute();

}
