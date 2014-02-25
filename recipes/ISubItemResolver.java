package appeng.api.recipes;

public interface ISubItemResolver
{

	public ResolveResult resolveItemByName(String namespace, String fullName);

}
