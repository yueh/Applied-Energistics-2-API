package appeng.api.networking.crafting;

import java.util.concurrent.Future;

import net.minecraft.world.World;
import appeng.api.networking.IGrid;
import appeng.api.networking.IGridCache;
import appeng.api.networking.security.BaseActionSource;
import appeng.api.storage.data.IAEItemStack;

import com.google.common.collect.ImmutableCollection;

public interface ICraftingGrid extends IGridCache
{

	/**
	 * @param whatToCraft
	 * @return a collection of crafting patterns for the item in question.
	 */
	ImmutableCollection<ICraftingPatternDetails> getCraftingFor(IAEItemStack whatToCraft);

	/**
	 * Begin calculating a crafting job.
	 * 
	 * @param world
	 * @param grid
	 * @param actionSrc
	 * @param craftWhat
	 * @param callback
	 *            -- optional
	 * @return a future which will at an undetermined point in the future get you the {@link ICraftingJob} do not wait
	 *         on this, your be waiting forever.
	 */
	Future<ICraftingJob> beginCraftingJob(World world, IGrid grid, BaseActionSource actionSrc, IAEItemStack craftWhat, ICraftingCallback callback);

	/**
	 * 
	 * @param result
	 *            - the crafting job from beginCraftingJob
	 * @param cpu
	 *            - can be null
	 * @param actionSrc
	 *            - the action source to use when starting the job, this will be used for extracting items, should
	 *            usually be the same as the one provided to beginCraftingJob.
	 */
	boolean submitJob(ICraftingJob job, ICraftingCPU cpu, BaseActionSource src);

}
