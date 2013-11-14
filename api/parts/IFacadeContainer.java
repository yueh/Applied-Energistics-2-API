package appeng.api.parts;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;

/**
 * Used Internally.
 * 
 * not intended for implementation.
 */
public interface IFacadeContainer
{

	/**
	 * add facade part
	 */
	boolean addFacade(IFacadePart a);

	/**
	 * remove facade part
	 */
	void removeFacade(TileEntity te, IFacadePart b);

	/**
	 * get facade part
	 */
	IFacadePart getFacade(ForgeDirection s);

}
