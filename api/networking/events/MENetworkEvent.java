package appeng.api.networking.events;

import appeng.api.networking.IGrid;


/**
 * These events are posted via {@link IGrid}.postEvent
 */
public class MENetworkEvent
{

	private int visited = 0;
	private boolean canceled;

	/**
	 * Call to prevent AE from posting the event to any further objects.
	 */
	public void cancel()
	{
		canceled = true;
	}

	/**
	 * called by AE after each object is called to cancel any future calls.
	 * 
	 * @return
	 */
	public boolean isCanceled()
	{
		return canceled;
	}

	/**
	 * the number of objects that were visited by the event.
	 * 
	 * @return
	 */
	public int getVisitedObjects()
	{
		return visited;
	}

	/**
	 * Called by AE after iterating the event subscribers.
	 * 
	 * @param v
	 */
	public void setVisitedObjects(int v)
	{
		visited = v;
	}
}
