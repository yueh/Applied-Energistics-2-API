package appeng.api.parts;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import appeng.api.util.AEColor;
import appeng.api.util.DimensionalCoord;

/**
 * Implemented by AE
 * 
 * Implemented on AE's TileEntity or AE's FMP Part.
 */
public interface IPartHost
{

	/**
	 * 
	 * gets the facade container
	 * 
	 * @return
	 */
	IFacadeContainer getFacadeContainer();

	/**
	 * see if you can add a part to the specified side, returns false if it
	 * failed to be added.
	 * 
	 * @param is
	 * @param side
	 * @return
	 */
	boolean canAddPart(ItemStack part, ForgeDirection side);

	/**
	 * try to add a new part to the specified side, returns false if it failed
	 * to be added.
	 * 
	 * @param is
	 * @param side
	 * @return null if the item failed to add, the side it was placed on other
	 *         wise ( may diff for cables )
	 */
	ForgeDirection addPart(ItemStack is, ForgeDirection side);

	/**
	 * get part by side ( center is unknown. )
	 * 
	 * @param side
	 * @return
	 */
	IBusPart getPart(ForgeDirection side);

	/**
	 * removes the part on the side, this dosn't drop it or anything, if you
	 * don't do something with it, its just "gone" and its never coming back;
	 * think about it.
	 * 
	 * @param side
	 */
	void removePart(ForgeDirection side);

	/**
	 * something changed, might want to tell someone.
	 */
	void markForUpdate();

	/**
	 * the usual...
	 * 
	 * @return
	 */
	DimensionalCoord getLocation();

	/**
	 * returns the tile entity for the host.
	 * 
	 * @return
	 */
	TileEntity getTile();

	/**
	 * get the color of the host type ( this is determined by the middle cable.
	 */
	AEColor getColor();

	/**
	 * destroys the part container
	 */
	void clearContainer();

	/**
	 * test if the cable can go this way...
	 */
	boolean isBlocked(ForgeDirection side);

}
