package appeng.api.config;

public enum PowerUnits
{
	AE("gui.appliedenergistics.units.appliedenergstics"), // Native Units - AE Energy
	MJ("gui.appliedenergistics.units.buildcraft"), // BuildCraft - Minecraft Joules
	EU("gui.appliedenergistics.units.ic2"), // IndustrialCraft 2 - Energy Units
	KJ("gui.appliedenergistics.units.universalelectricity"), // Universal Electricity - KiloJoules
	WA("gui.appliedenergistics.units.rotarycraft"), // RotaryCraft - Watts
	RF("gui.appliedenergistics.units.thermalexpansion"); // ThermalExpansion - Redstone Flux

	public double conversionRatio = 1.0; // set when AE's configuration loads.
	final public String unlocalizedName;

	private PowerUnits(String un) {
		unlocalizedName = un;
	}

	public double convertTo(PowerUnits target, double value)
	{
		return (value * conversionRatio) / target.conversionRatio;
	}

}