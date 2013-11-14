package appeng.api.parts;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;

/**
 * used internally.
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
