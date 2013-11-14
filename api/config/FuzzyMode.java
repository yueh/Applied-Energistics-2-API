package appeng.api.config;

public enum FuzzyMode
{
	IGNORE_ALL(-1.0F), PERCENT_99(1.0F), PERCENT_75(0.75F), PERCENT_50(0.5F), PERCENT_25(0.25F);

	public float breakPoint;

	private FuzzyMode(float p) {
		breakPoint = p;
	}

}