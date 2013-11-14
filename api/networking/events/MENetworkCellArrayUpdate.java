package appeng.api.networking.events;


/**
 * Posted when storage options in a AE Network update, such as a new Storage Bus or Cell is added, or removed.
 * 
 * you do not need to send this event when your node is added / removed from the grid.
 */
public class MENetworkCellArrayUpdate extends MENetworkEvent
{

	public MENetworkCellArrayUpdate() {
	}

}
