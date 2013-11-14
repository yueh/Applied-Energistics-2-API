package appeng.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;
import appeng.api.crafting.ICraftingPatternMAC;
import appeng.api.features.ILocateableRegistry;
import appeng.api.features.IP2PTunnelRegistry;
import appeng.api.features.ISpecialComparisonRegistry;
import appeng.api.features.IWirelessTermRegistery;
import appeng.api.items.IMemoryCard;
import appeng.api.items.ISpatialStorageCell;
import appeng.api.movable.IMovableRegistry;
import appeng.api.networking.IGridBlock;
import appeng.api.networking.IGridCacheRegistry;
import appeng.api.networking.IGridNode;
import appeng.api.parts.IBusItem;
import appeng.api.recipes.IGrinderRecipeManager;
import appeng.api.recipes.Items.Blocks;
import appeng.api.recipes.Items.Items;
import appeng.api.recipes.Items.Materials;
import appeng.api.recipes.Items.Parts;
import appeng.api.storage.ICellRegistry;
import appeng.api.storage.IExternalStorageRegistry;
import appeng.api.storage.data.IAEFluidStack;
import appeng.api.storage.data.IAEItemStack;
import appeng.api.storage.data.IItemList;

public interface IAppEngApi
{

	/**
	 * Use the movable registry to white list your tiles.
	 * 
	 * @param c
	 */
	IMovableRegistry getMovableRegistry();

	/**
	 * Add new Grid Caches for use during run time, only use during loading phase.
	 * 
	 * @return
	 */
	IGridCacheRegistry getGridCacheRegistry();

	/**
	 * Add additional storage bus handlers to improve interplay with mod blocks that contains special inventories that
	 * function unlike vanilla chests. AE uses this internally for barrels, dsu's, quantum chests, AE Networks and more.
	 * *
	 * 
	 * @return IExternalStorageRegistry
	 */
	IExternalStorageRegistry getExternalStorageRegistry();

	/**
	 * Add additional special comparison functionality, AE Uses this internally for Bees.
	 * 
	 * @return ISpecialComparisonRegistry
	 */
	ISpecialComparisonRegistry getSpecialComparsonRegistry();

	/**
	 * Lets you register your items as wireless terminals
	 * 
	 * @return
	 */
	IWirelessTermRegistery getWirelessRegistry();

	/**
	 * return an locatable object by its serial used internally by AE for QNBs / Network Controllers
	 * 
	 * @param serial
	 * @return
	 */
	Object getLocateableBySerial(Long serial);

	/**
	 * creates a new instance of IAEItemStack from a MC ItemStack
	 * 
	 * @param is
	 * @return
	 */
	IAEItemStack createItemStack(ItemStack is);

	/**
	 * creates a new instance of IAEItemStack from a MC ItemStack
	 * 
	 * @param is
	 * @return
	 */
	IAEFluidStack createFluidStack(FluidStack is);

	/**
	 * Creates a new instance of IItemList
	 * 
	 * @return
	 */
	IItemList createItemList();

	/**
	 * Allows you to register new cell types, these will function in drives
	 * 
	 * @return
	 */
	ICellRegistry getCellRegistry();

	/**
	 * Manage grinder recipes via API
	 * 
	 * @return
	 */
	IGrinderRecipeManager getGrinderRecipeManage();

	/**
	 * get access to the locatable registry
	 * 
	 * @return
	 */
	ILocateableRegistry getLocateableRegistry();

	/**
	 * get access to the p2p tunnel registry.
	 * 
	 * @return
	 */
	IP2PTunnelRegistry getP2PTunnelRegistry();

	/**
	 * Blacklist this item from vanilla AE Terminals / IStorageCell
	 * 
	 * @param itemID
	 * @param meta
	 *            - if you use OreDictionary.WILDCARD_VALUE it will blacklist the entire itemID.
	 */
	void blacklistItemFromStorageCells(int itemID, int meta);

	/**
	 * gives you access to assembler pattern data.
	 * 
	 * @param i
	 * @return
	 */
	ICraftingPatternMAC getAssemblerPattern(ItemStack i);

	/**
	 * gives you the ability to interface with AE Memory Cards.
	 * 
	 * @return
	 */
	IMemoryCard getMemoryCardHandler();

	/**
	 * returns the ISpatialStorage for the ItemStack, if it can get from form its item ( or from AE )
	 * 
	 * @param is
	 * @return
	 */
	ISpatialStorageCell getSpatialStorageForItem(ItemStack is);

	/**
	 * returns accessible list of all of AE's Items
	 * 
	 * @return
	 */
	Items items();

	/**
	 * returns accessible list of all of AE's materials; materials are items
	 * 
	 * @return
	 */
	Materials materials();

	/**
	 * returns accessible list of all of AE's blocks
	 * 
	 * @return
	 */
	Blocks blocks();

	/**
	 * returns accessible list of all of AE's parts; parts are items.
	 * 
	 * @return
	 */
	Parts parts();

	/**
	 * create a grid node for your IGridHost
	 * 
	 * @param blk
	 * @return
	 */
	IGridNode createGridNode(IGridBlock blk);

	/**
	 * Register IBusItem with renderer
	 */
	void setItemBusRenderer(IBusItem i);

	/**
	 * use in use item, to try and place a IBusItem
	 * 
	 * @param is
	 * @param x
	 * @param y
	 * @param z
	 * @param side
	 * @param player
	 * @param w
	 * @return
	 */
	boolean placeBus(ItemStack is, int x, int y, int z, int side, EntityPlayer player, World w);

}
