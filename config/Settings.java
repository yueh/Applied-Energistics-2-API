package appeng.api.config;

import java.util.EnumSet;

public enum Settings
{
	LEVEL_EMITTER_MODE(EnumSet.allOf( LevelEmitterMode.class )),

	NETWORK_EMITTER_MODE(EnumSet.allOf( NetworkEmitterMode.class )),

	REDSTONE_INPUT(EnumSet.allOf( RedstoneMode.class )), REDSTONE_OUTPUT(EnumSet.of( RedstoneMode.HIGH_SIGNAL, RedstoneMode.LOW_SIGNAL )),

	CONDENSER_OUTPUT(EnumSet.allOf( CondenserOuput.class )),

	POWER_UNITS(EnumSet.allOf( PowerUnits.class )), ACCESS(EnumSet.allOf( AccessRestriction.class )), COMPARISON(EnumSet.allOf( FuzzyMode.class )),

	SORT_DIRECTION(EnumSet.allOf( SortDir.class )), SORT_BY(EnumSet.allOf( SortOrder.class )),

	VIEW_MODE(EnumSet.allOf( ViewItems.class )), SEARCH_MODE(EnumSet.allOf( SearchBoxMode.class )),

	ACTIONS(EnumSet.allOf( ActionItems.class )), IO_DIRECTION(EnumSet.of( RelativeDirection.LEFT, RelativeDirection.RIGHT )),

	INCLUSION(EnumSet.allOf( IncludeExclude.class )), CRAFT(EnumSet.of( YesNo.YES, YesNo.NO )), BLOCK(EnumSet.of( YesNo.YES, YesNo.NO )),

	OPERATION_MODE(EnumSet.allOf( OperationMode.class )), FULLNESS_MODE(EnumSet.allOf( FullnessMode.class )),

	TRASH_CATCH(EnumSet.of( YesNo.YES, YesNo.NO )), FUZZY_MODE(EnumSet.allOf( FuzzyMode.class ));

	EnumSet values;

	private Settings(EnumSet set) {
		if ( set == null || set.isEmpty() )
			throw new RuntimeException( "Invalid configuration." );
		values = set;
	}

	/**
	 * used to disable settings that might rely on mods that are not present.
	 * 
	 * @param val
	 */
	public void disableSetting(Enum val)
	{
		values.remove( val );
	}

}
