package appeng.api.networking;

public interface IMachineSet extends Iterable<IGridNode>
{

	/**
	 * @return the number of machines in in the set.
	 */
	int size();

	/**
	 * @return true if there are no machines in the set
	 */
	boolean isEmpty();

	/**
	 * @return return true if the node is part of the set.
	 */
	boolean contains(Object node);

	/**
	 * @return the machine class for this set.
	 */
	Class<? extends IGridHost> getMachineClass();
}
