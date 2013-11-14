package appeng.api.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import appeng.api.IAppEngApi;

/**
 * Used to interact with memory card items.
 * 
 * Obtain via {@link IAppEngApi}.getmemeoryCardHandler()
 * 
 * Do Not Implement
 */
public interface IMemoryCard
{

	/**
	 * @param is
	 * @return true if the item is in fact a memory card
	 */
	boolean isMemoryCard(ItemStack is);

	/**
	 * Configures the data stored on the memory card, the SettingsName, will be
	 * localized when displayed.
	 * 
	 * @param is
	 * @param SettingsName
	 * @param data
	 *            tooltip - is a unlocalized string displayed after the
	 *            settings name, optional but can be used to add details to the
	 *            card for later.
	 */
	void setMemoryCardContents(ItemStack is, String SettingsName, NBTTagCompound data);

	/**
	 * returns the settings name provided previously by setMemoryCardContents,
	 * or "AppEng.GuiITooltip.Blank" if there is no settings.
	 * 
	 * @param is
	 * @return
	 */
	String getSettingsName(ItemStack is);

	/**
	 * @param is
	 * @return the NBT Data previously saved by setMemoryCardContents, or an
	 *         empty NBTCompound
	 */
	NBTTagCompound getData(ItemStack is);

	/**
	 * notify the user of a outcome related to the memory card.
	 * 
	 * @param aeBaseBlock
	 * @param player
	 * @param settingsSaved
	 */
	void notifyUser(Block blk, EntityPlayer player, MemoryCardMessages msg);

}