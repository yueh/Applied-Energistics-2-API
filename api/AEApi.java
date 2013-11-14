package appeng.api;

import cpw.mods.fml.relauncher.ReflectionHelper;

/**
 * 
 * Entry point for api.
 * 
 * Available IMCs:
 * 
 * 
 */
public class AEApi
{

	static private IAppEngApi api = null;

	/**
	 * All future API calls should be made via this method.
	 * 
	 * @return the AE API
	 */
	public static IAppEngApi instance()
	{
		if ( api == null )
		{
			try
			{
				Class c = Class.forName( "appeng.core.Api" );
				api = (IAppEngApi) c.getField( "instance" ).get( c );
			}
			catch (Throwable e)
			{
				return null;
			}
		}

		return api;
	}

}
