package com.ForgeStove.create_cyber_goggles;
import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.ModConfigSpec.*;
public class Config {
	public static final Builder BUILDER = new Builder();
	public static final ModConfigSpec CONFIG_SPEC;
	public static ConfigValue<Boolean> EnableGogglesWhenSurvival;
	public static ConfigValue<Boolean> EnableGogglesWhenCreative;
	public static ConfigValue<Boolean> EnableGogglesWhenSpectator;
	public static ConfigValue<Boolean> EnableGogglesWhenAdventure;
	public static ConfigValue<Boolean> EnhancedGogglesInfo;
	public static ConfigValue<Boolean> AllowEmptyHandToRotate;
	public static ConfigValue<Boolean> AllowEmptyHandToRideChainConveyor;
	public static ConfigValue<Boolean> PreventFallingFromChainConveyor;
	public static ConfigValue<Integer> ChainConveyorSeparationDistance;
	public static ConfigValue<Integer> ChainConveyorSeparationHeight;
	public static ConfigValue<Boolean> EnhancedChainConnection;
	public static ConfigValue<Boolean> AllowForcedFlywheelBackend;
	static {
		BUILDER.push("Client");
		EnableGogglesWhenSurvival = BUILDER.define("EnableGogglesWhenSurvival", true);
		EnableGogglesWhenCreative = BUILDER.define("EnableGogglesWhenCreative", true);
		EnableGogglesWhenSpectator = BUILDER.define("EnableGogglesWhenSpectator", true);
		EnableGogglesWhenAdventure = BUILDER.define("EnableGogglesWhenAdventure", true);
		EnhancedGogglesInfo = BUILDER.define("EnhancedGogglesInfo", true);
		AllowEmptyHandToRotate = BUILDER.define("AllowEmptyHandToRotate", true);
		AllowEmptyHandToRideChainConveyor = BUILDER.define("AllowEmptyHandToRideChainConveyor", true);
		PreventFallingFromChainConveyor = BUILDER.define("PreventFallingFromChainConveyor", true);
		ChainConveyorSeparationDistance = BUILDER.define("ChainConveyorSeparationDistance", 3);
		ChainConveyorSeparationHeight = BUILDER.define("ChainConveyorSeparationHeight", -1);
		EnhancedChainConnection = BUILDER.define("EnhancedChainConnection", true);
		AllowForcedFlywheelBackend = BUILDER.define("AllowForcedFlywheelBackend", false);
		BUILDER.pop();
		CONFIG_SPEC = BUILDER.build();
	}
}
