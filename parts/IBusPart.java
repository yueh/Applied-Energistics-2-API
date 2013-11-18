package appeng.api.parts;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Vec3;
import net.minecraftforge.common.ForgeDirection;
import appeng.api.networking.IGridNode;
import appeng.parts.IBusCollsionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public interface IBusPart
{

	/**
	 * get an ItemStack that represents the bus, should contain the settings for whatever, can also be used in
	 * conjunction with removePart to take a part off and drop it or something.
	 * 
	 * @return
	 */
	ItemStack getItemStack();

	/**
	 * render item form for inventory, or entity.
	 * 
	 * GL Available
	 * 
	 * @param te
	 * @param rh
	 */
	@SideOnly(Side.CLIENT)
	void renderInventory(IBusRenderHelper rh, RenderBlocks renderer);

	/**
	 * render world renderer ( preferred )
	 * 
	 * GL is NOT Available
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @param te
	 * @param rh
	 */
	@SideOnly(Side.CLIENT)
	void renderStatic(int x, int y, int z, IBusRenderHelper rh, RenderBlocks renderer);

	/**
	 * render TESR.
	 * 
	 * GL Available
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @param te
	 * @param rh
	 */
	@SideOnly(Side.CLIENT)
	void renderDynamic(double x, double y, double z, IBusRenderHelper rh, RenderBlocks renderer);

	/**
	 * @return if the bus has a solid side, and you can place random stuff on it like torches or levers
	 */
	boolean isSolid();

	/**
	 * @return true if this part can connect to redstone ( also MFR Rednet )
	 */
	boolean canConnectRedstone();

	/**
	 * write additional NBT data to the world, ( the part id is not part of this. )
	 * 
	 * @param extra
	 */
	void writeToNBT(NBTTagCompound extra);

	/**
	 * read from additional NBT in the world.
	 * 
	 * @param extra
	 */
	void readFromNBT(NBTTagCompound extra);

	/**
	 * @return get the amount of light produced by the bus
	 */
	int getLightLevel();

	/**
	 * a block around the bus's host has been changed.
	 */
	void onNeighborChanged();

	/**
	 * @return output redstone on facing side
	 */
	int isProvidingStrongPower();

	/**
	 * @return output redstone on facing side
	 */
	int isProvidingWeakPower();

	/**
	 * write data to bus packet.
	 * 
	 * @param data
	 * @throws IOException
	 */
	void writeToStream(DataOutputStream data) throws IOException;

	/**
	 * read data from bus packet.
	 * 
	 * @param data
	 * @return true will re-draw the part.
	 * @throws IOException
	 */
	boolean readFromStream(DataInputStream data) throws IOException;

	/**
	 * get the Grid Node for the Bus, be sure your IGridBlock is NOT isWorldAccessable, if it is your going to cause
	 * crashes.
	 * 
	 * or null if you don't have a grid node.
	 * 
	 * @return
	 */
	IGridNode getGridNode();

	/**
	 * called when an entity collides with the bus.
	 * 
	 * @param entity
	 */
	void onEntityCollision(Entity entity);

	/**
	 * called when your part is being removed from the world.
	 */
	void removeFromWorld();

	/**
	 * called when your part is being added to the world.
	 */
	void addToWorld();

	/**
	 * used for tunnels.
	 * 
	 * @return a grid node that represents the external facing side, these must be isWorldAccessable with the correct
	 *         faces marked as external
	 */
	IGridNode getExternalFacingNode();

	/**
	 * called by the Part host to keep your part informed.
	 * 
	 * @param host
	 * @param tile
	 */
	void setPartHostInfo(ForgeDirection side, IPartHost host, TileEntity tile);

	/**
	 * add your collision information to the the list.
	 * 
	 * @param boxes
	 */
	void getBoxes(IBusCollsionHelper bch);

	/**
	 * Called when you right click the part, very similar to Block.onActivateBlock
	 * 
	 * @param player
	 * @param pos
	 * @return if your activate method performed something.
	 */
	boolean onActivate(EntityPlayer player, Vec3 pos);

}