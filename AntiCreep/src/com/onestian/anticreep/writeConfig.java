package com.onestian.anticreep;

public class writeConfig {
	
	public static boolean setBlock(String value) {
		anticreep.thisPlugin.getConfig().set("Disable Block Damage", value);
		anticreep.thisPlugin.saveConfig();
		return true;
	}
	
	public static boolean setPlayer(String value) {
		anticreep.thisPlugin.getConfig().set("Disable Player Damage", value);
		anticreep.thisPlugin.saveConfig();
		return true;
	}
	
	public static boolean setCustom(String value) {
		anticreep.thisPlugin.getConfig().set("Custom Explosion Radius", value);
		anticreep.thisPlugin.saveConfig();
		return true;
	}
	
	public static boolean setRadius(String value) {
		anticreep.thisPlugin.getConfig().set("Explosion Radius", value);
		anticreep.thisPlugin.saveConfig();
		return true;
	}
	
	public static boolean setSpawn(String value) {
		anticreep.thisPlugin.getConfig().set("Spawn creepers", value);
		anticreep.thisPlugin.saveConfig();
		return true;
	}
}
