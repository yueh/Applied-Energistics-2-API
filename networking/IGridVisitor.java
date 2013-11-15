package appeng.api.networking;

import appeng.me.GridNode;

/**
 * Simple Visitor pattern access to network nodes.
 */
public interface IGridVisitor
{

	/**
	 * Called for each node on the network.
	 * 
	 * By returning false your informing the host to stop visiting nodes beyond the current node.
	 * 
	 * @param n
	 * @return
	 */
	public boolean visit(GridNode n);

}
