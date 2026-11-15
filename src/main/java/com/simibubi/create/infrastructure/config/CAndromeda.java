package com.simibubi.create.infrastructure.config;

import net.createmod.catnip.config.ConfigBase;

public class CAndromeda extends ConfigBase {
	public final ConfigBool disableExponentialStress = b(false, "disableExponentialStress", Comments.disableExponentialStress);
	public final ConfigFloat exponentialStressGain = f(4, 2, 256, "exponentialStressGain", Comments.exponentialStressGain);
	public final ConfigFloat exponentialStressCutoff = f(128, 1, 16384, "exponentialStressCutoff", Comments.exponentialStressCutoff);
	public final ConfigBool machineParallels = b(true, "machineParallels", Comments.machineParallels);
	public final ConfigFloat parallelCutoff = f(256, 1, 16384, "parallelCutoff", Comments.parallelCutoff);
	public final ConfigInt parallelMultiplier = i(1, 1, "parallelMultiplier", Comments.parallelMultiplier);

	public final ConfigBool pressChanges = b(true, "pressChanges", Comments.pressChanges);

	private static class Comments {
		static String disableExponentialStress = "Disable the exponential Stress cost with speed gain.";
		static String exponentialStressGain = "The multiplier for stress impact when doubling machine speed.";
		static String exponentialStressCutoff = "At which RPM should the exponential stress gain start.";
		static String machineParallels = "Allow machines to do multiple recipes at once with enough speed";
		static String parallelCutoff = "When to start giving a machine parallels.";
		static String parallelMultiplier = "The multiplier on parallels.";

		static String pressChanges = "Allow presses to require multiple hits per recipe.";
	}

	@Override
	public String getName() {
		return "andromeda";
	}
}
