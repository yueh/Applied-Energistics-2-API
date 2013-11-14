package appeng.api.util;

import net.minecraft.item.ItemStack;

/**
 * List of all colors supported by AE, their names, and various colors for
 * display.
 * 
 * Should be the same order as Dyes, excluding Transparent.
 */
public enum AEColor
{

	White("AppEng.Colors.White", 0xBEBEBE, 0xDBDBDB, 0xFAFAFA),

	Orange("AppEng.Colors.Orange", 0xF99739, 0xFAAE44, 0xF4DEC3),

	Magenta("AppEng.Colors.Magenta", 0x821E82, 0xB82AB8, 0xC598C8),

	LightBlue("AppEng.Colors.LightBlue", 0x628DCB, 0x82ACE7, 0xD8F6FF),

	Yellow("AppEng.Colors.Yellow", 0xFFF7AA, 0xF8FF4A, 0xFFFFE8),

	Lime("AppEng.Colors.Lime", 0x7CFF4A, 0xBBFF51, 0xE7F7D7),

	Pink("AppEng.Colors.Pink", 0xDC8DB5, 0xF8B5D7, 0xF7DEEB),

	Gray("AppEng.Colors.Gray", 0x7C7C7C, 0xA0A0A0, 0xC9C9C9),

	LightGray("AppEng.Colors.LightGray", 0x9D9D9D, 0xCDCDCD, 0xEFEFEF),

	Cyan("AppEng.Colors.Cyan", 0x2F9BA5, 0x51AAC6, 0xAEDDF4),

	Purple("AppEng.Colors.Purple", 0x8230B2, 0xA453CE, 0xC7A3CC),

	Blue("AppEng.Colors.Blue", 0x2D29A0, 0x514AFF, 0xDDE6FF),

	Brown("AppEng.Colors.Brown", 0x724E35, 0xB7967F, 0xE0D2C8),

	Green("AppEng.Colors.Green", 0x45A021, 0x60E32E, 0xE3F2E3),

	Red("AppEng.Colors.Red", 0xA50029, 0xFF003C, 0xFFE6ED),

	Black("AppEng.Colors.Black", 0x2B2B2B, 0x565656, 0x848484),

	Transparent("AppEng.Colors.Transparent", 0x1B2344, 0x895CA8, 0xDABDEF);

	final public String uName;
	final public int blackVarient;
	final public int mediumVarient;
	final public int whiteVarient;

	AEColor(String unlocalizedName, int sv, int dv, int lv) {
		uName = unlocalizedName;
		blackVarient = sv;
		mediumVarient = dv;
		whiteVarient = lv;
	}

	/**
	 * Logic to see which colors match each other.. special handle for fluix
	 */
	public boolean matches(AEColor color)
	{
		if ( equals( Transparent ) || color.equals( Transparent ) ) return true;
		return equals( color );
	}

	public static AEColor fromCable(ItemStack is)
	{
		int dmg = is.getItemDamage();
		return AEColor.values()[dmg];
	}

}
