package appeng.api.parts;

public interface IPartCollsionHelper
{

	/**
	 * add a collision box, expects 0.0 - 16.0 block coords.
	 * 
	 * No complaints about the size, I like using pixels :P
	 * 
	 * @param minX
	 * @param minY
	 * @param minZ
	 * @param maxX
	 * @param maxY
	 * @param maxZ
	 */
	void addBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ);

}
