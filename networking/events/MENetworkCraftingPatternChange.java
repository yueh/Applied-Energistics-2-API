package appeng.api.networking.events;

import appeng.api.networking.IGridNode;

public class MENetworkCraftingPatternChange extends MENetworkEvent
{

	public final IGridNode node;

	public MENetworkCraftingPatternChange(IGridNode n) {
		node = n;
	}

}
