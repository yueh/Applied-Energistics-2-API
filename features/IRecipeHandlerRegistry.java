package appeng.api.features;

import appeng.api.recipes.ICraftHandler;
import appeng.api.recipes.IRecipeHandler;

public interface IRecipeHandlerRegistry {

	/**
	 * Add a new Recipe Handler to the parser.
	 * 
	 * @param name
	 * @param handler
	 */
	void addNewCraftHandler( String name, Class<? extends ICraftHandler> handler );

	/**
	 * @param name
	 * @return A recipe handler by name, returns null on failure.
	 */
	ICraftHandler getCraftHandlerFor( String name );

	/**
	 * @return a new recipe handler, which can be used to parse, and read recipe files.
	 */
	public IRecipeHandler createNewRecipehandler();
	
}
