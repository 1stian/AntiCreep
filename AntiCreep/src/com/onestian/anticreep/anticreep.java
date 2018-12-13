package com.onestian.anticreep;

import org.bukkit.plugin.java.JavaPlugin;

public class anticreep extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new creeperListener(), this);
	}
	
	@Override
	public void onDisable() {
		
	}

}
