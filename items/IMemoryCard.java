package appeng.api.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import appeng.api.IAppEngApi;

/**
 * Used to interact with memory card items.
 * 
 * Obtain via {@link IAppEngApi}.getMemoryCardHandler()
 * 
 * Do Not Implement
 */
public interface IMemoryCard
{

	/**
	 * @param is
	 * @return true if the item is in fact a memory card.
	 */
	boolean isMemoryCard(ItemStack is);

	/**
	 * Configures the data stored on the memory card, the SettingsName, will be
	 * localized when displayed.
	 * 
	 * @param is
	 * @param SettingsName
	 *            unlocalized string that represents the tile entity.
	 * @param data
	 *            may contain a String called "tooltip" which is is a unlocalized
	 *            string displayed after the settings name, optional but can be
	 *            used to add details to the card for later.
	 */
	void setMemoryCardContents(ItemStack is, String SettingsName, NBTTagCompound data);

	/**
	 * returns the settings name provided by a pervious call to setMemoryCardContents,
	 * or "AppEng.GuiITooltip.Blank" if there was no previous call to setMemoryCardContents.
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
	 * @param Block that the card was used on
	 * @param player that used the card.
	 * @param settingsSaved which message to send.
	 */
	void notifyUser(Block blk, EntityPlayer player, MemoryCardMessages msg);

}
