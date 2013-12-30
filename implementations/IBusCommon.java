package appeng.api.implementations;

import appeng.api.config.Upgrades;
import appeng.api.parts.IPart;
import appeng.api.parts.IPartHost;
import appeng.api.util.IConfigureableObject;

public interface IBusCommon extends IConfigureableObject, IPart, ISegmentedInventory
{

	/**
	 * determine how many of an upgrade are installed.
	 */
	int getInstalledUpgrades(Upgrades u);

	/**
	 * get Part Host
	 */
	IPartHost getHost();

}
