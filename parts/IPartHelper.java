package appeng.api.parts;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface IPartHelper
{

	/**
	 * Register IBusItem with renderer
	 */
	void setItemBusRenderer(IBusItem i);

	/**
	 * use in use item, to try and place a IBusItem
	 * 
	 * @param is
	 *            ItemStack of an item which implements {@link IBusItem}
	 * @param x
	 * @param y
	 * @param z
	 * @param side
	 * @param player
	 * @param world
	 * @return
	 */
	boolean placeBus(ItemStack is, int x, int y, int z, int side, EntityPlayer player, World world);

}
