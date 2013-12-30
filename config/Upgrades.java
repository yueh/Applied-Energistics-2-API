package appeng.api.config;

public enum Upgrades
{
	/**
	 * Gold Tier Upgrades.
	 */
	CAPACITY(0, 2), REDSTONE(0, 1),

	/**
	 * Diamond Tier Upgrades.
	 */
	FUZZY(1, 1), SPEED(1, 4);

	public final int myTier;
	public final int maxInstalled;

	private Upgrades(int tier, int maxNum) {
		myTier = tier;
		maxInstalled = maxNum;
	}

}
