package com.onestian.anticreep;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class anticreep extends JavaPlugin {
	
	@Override
	public void onEnable() {
		//Metrics
		Metrics metrics = new Metrics(this);
		
		
		//Listeners
		getServer().getPluginManager().registerEvents(new creeperListener(), this);
	}
	
	@Override
	public void onDisable() {
		
	}

}
