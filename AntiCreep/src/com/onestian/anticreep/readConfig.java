package com.onestian.anticreep;

import org.bukkit.plugin.Plugin;

public class readConfig {
	
	static Plugin plugin = anticreep.thisPlugin;
	
	public static boolean getblock() {
		boolean state = anticreep.thisPlugin.getConfig().getBoolean("Disable Block Damage");
		
		return state;
	}
	
	public static boolean getPlayer() {
		boolean state = anticreep.thisPlugin.getConfig().getBoolean("Disable Player Damage");
		
		return state;
	}
	
	public static boolean getCustom() {
		boolean state = anticreep.thisPlugin.getConfig().getBoolean("Custom Explosion Radius");
		
		return state;
	}
	
	public static int getRadius() {
		int state = anticreep.thisPlugin.getConfig().getInt("Explosion Radius");
		
		return state;
	}
	
	public static boolean getSpawn() {
		boolean state = anticreep.thisPlugin.getConfig().getBoolean("Spawn creepers");
		
		return state;
	}
}
