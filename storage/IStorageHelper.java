package appeng.api.storage;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import appeng.api.storage.data.IAEFluidStack;
import appeng.api.storage.data.IAEItemStack;
import appeng.api.storage.data.IItemList;

public interface IStorageHelper
{

	/**
	 * @param is
	 *            An ItemStack
	 * 
	 * @return a new instance of {@link IAEItemStack} from a MC
	 *         {@link ItemStack}
	 */
	IAEItemStack createItemStack(ItemStack is);

	/**
	 * @param is
	 *            A FluidStack
	 * 
	 * @return a new instance of {@link IAEFluidStack} from a Forge
	 *         {@link FluidStack}
	 */
	IAEFluidStack createFluidStack(FluidStack is);

	/**
	 * @return a new instance of {@link IItemList}
	 */
	IItemList createItemList();

}
