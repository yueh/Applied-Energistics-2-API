package appeng.api.networking.events;

/**
 *  An event that is posted Whenever a spatial IO is Actived, called for IGridCache
 *
 * @params IGridHost ( instance of the SpatialIO block )
 *
 *
 * 
 *
 */
 
 // be sure to rewrite stuff and import stuff correctly. this is just the raw idea.
public class MENetworkSpatialEvent extends MENetworkEvent
{

  public final IGridHost host;
  
  
  public MENetworkSpatialEvent(IGridHost SpatialIO) {
               host = SpatialIO;
        }
  
}
