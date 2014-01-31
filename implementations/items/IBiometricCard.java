package appeng.api.implementations.items;

import java.util.EnumSet;

import net.minecraft.item.ItemStack;
import appeng.api.config.SecurityPermissions;

public interface IBiometricCard
{

	/**
	 * @return username of the player encded on this card, or a blank string.
	 */
	String getUserName(ItemStack is);

	/**
	 * @param is
	 * @return the full list of permissions encoded on the card.
	 */
	EnumSet<SecurityPermissions> getPermissions(ItemStack is);

	/**
	 * Check if a permission is encoded ont he card.
	 * 
	 * @param permission
	 * @return true if this permssion is set on the card.
	 */
	boolean hasPermission(ItemStack is, SecurityPermissions permission);

}
