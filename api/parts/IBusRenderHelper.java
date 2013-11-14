package appeng.api.parts;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.util.Icon;
import net.minecraftforge.common.ForgeDirection;

public interface IBusRenderHelper
{

	/**
	 * sets the Render Helpers Block Bounds. 0.0 - 16.0 block coords.
	 * 
	 * No complaints about the size, I like using pixels :P
	 * 
	 * @param minx
	 * @param miny
	 * @param minz
	 * @param maxx
	 * @param maxy
	 * @param maxz
	 */
	void setBounds(float minx, float miny, float minz, float maxx, float maxy, float maxz);

	/**
	 * static renderer
	 * 
	 * render a single face.
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @param ico
	 * @param face
	 * @param renderer
	 */
	void renderFace(int x, int y, int z, Icon ico, ForgeDirection face, RenderBlocks renderer);

	/**
	 * static renderer
	 * 
	 * render a box with a cut out box in the center.
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @param ico
	 * @param face
	 * @param edgeThickness
	 * @param renderer
	 */
	void renderFaceCutout(int x, int y, int z, Icon ico, ForgeDirection face, float edgeThickness, RenderBlocks renderer);

	/**
	 * static renderer
	 * 
	 * render a block of specified bounds.
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @param renderer
	 */
	void renderBlock(int x, int y, int z, RenderBlocks renderer);

	/**
	 * render a single face in inventory renderer.
	 * 
	 * @param icon
	 * @param south
	 * @param renderer
	 */
	void renderInventoryFace(Icon icon, ForgeDirection south, RenderBlocks renderer);

	/**
	 * render a box in inventory renderer.
	 * 
	 * @param renderer
	 */
	void renderInventoryBox(RenderBlocks renderer);

	/**
	 * inventory, and static renderer.
	 * 
	 * set unique icons for each side of the block.
	 * 
	 * @param Down
	 * @param Up
	 * @param North
	 * @param South
	 * @param West
	 * @param East
	 */
	void setTexture(Icon Down, Icon Up, Icon North, Icon South, Icon West, Icon East);

	/**
	 * inventory, and static renderer.
	 * 
	 * set all sides to a single icon.
	 * 
	 * @param ico
	 */
	void setTexture(Icon ico);

}
