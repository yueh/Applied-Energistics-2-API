package appeng.api.storage.data;

import java.util.Iterator;
import java.util.List;

import appeng.api.config.FuzzyMode;

/**
 * Represents a list of items in AE.
 * 
 * Don't Implement.
 * 
 * Construct with Util.createItemList()
 * 
 */
public interface IItemList<StackType extends IAEStack> extends Iterable<StackType>
{

	/**
	 * add a stack to the list stacksize is used to add to stackSize, this will merge the stack with an item already in
	 * the list if found.
	 * 
	 * @param option
	 */
	public void addStorage(StackType option); // adds a stack as stored.

	/**
	 * add a stack to the list as craftable, this will merge the stack with an item already in the list if found.
	 * 
	 * @param option
	 */
	public void addCrafting(StackType option);

	/**
	 * add a stack to the list, stack size is used to add to requstable, this will merge the stack with an item already
	 * in the list if found.
	 * 
	 * @param option
	 */
	public void addRequestable(StackType option); // adds a stack as
													// requestable.

	/**
	 * add a stack to the list, this will merge the stack with an item already in the list if found.
	 * 
	 * @param option
	 */
	public void add(StackType option); // adds stack as is.

	/**
	 * return the first item in the list.
	 * 
	 * @return
	 */
	StackType getFirstItem();

	/**
	 * return a stack equivalent to the stack passed in, but with the correct stack size information, or null if its not
	 * present.
	 * 
	 * @param i
	 * @return
	 */
	StackType findPrecise(StackType i);

	/**
	 * return a list of relevant fuzzy matched stacks
	 * 
	 * @param input
	 * @return
	 */
	public List<StackType> findFuzzy(StackType input, FuzzyMode fuzzy);

	/**
	 * the number of items in the list.
	 * 
	 * @return
	 */
	int size();

	/**
	 * allows you to iterate the list.
	 */
	@Override
	public Iterator<StackType> iterator();

	/**
	 * sets the priority of all the items being added to the list, usually only AE needs to call this.
	 * 
	 * @param priority
	 */
	public void setCurrentPriority(int priority);

	/**
	 * returns true if there are no items in the list.
	 * 
	 * @return
	 */
	public boolean isEmpty();

}
