package appeng.api.parts;

import io.netty.buffer.ByteBuf;

import java.io.IOException;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Used Internally.
 * 
 * not intended for implementation.
 */
public interface IFacadeContainer
{

	/**
	 * Attempts to add the {@link IFacadePart} to the given side.
	 * 
	 * @return true if the facade as successfully added.
	 */
	boolean addFacade(IFacadePart a);

	/**
	 * Removed the facade on the given side, or does nothing.
	 */
	void removeFacade(IPartHost host, ForgeDirection side);

	/**
	 * @return the {@link IFacadePart} for a given side, or null.
	 */
	IFacadePart getFacade(ForgeDirection s);

	/**
	 * rotate the facades left.
	 */
	void rotateLeft();

	/**
	 * write nbt data
	 * 
	 * @param data
	 */
	void writeToNBT(NBTTagCompound data);

	/**
	 * read from stream
	 * 
	 * @param data
	 * @return
	 * @throws IOException
	 */
	boolean readFromStream(ByteBuf data) throws IOException;

	/**
	 * read from NBT
	 * 
	 * @param data
	 */
	void readFromNBT(NBTTagCompound data);

	/**
	 * write to stream
	 * 
	 * @param data
	 * @throws IOException
	 */
	void writeToStream(ByteBuf data) throws IOException;

	/**
	 * @return true if there are no facades.
	 */
	boolean isEmpty();

}
