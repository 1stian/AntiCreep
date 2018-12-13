package com.onestian.anticreep;

import org.bstats.bukkit.Metrics;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.onestian.anticreep.commands.reloadConfigCommand;
import com.onestian.anticreep.commands.versionCom;

public class anticreep extends JavaPlugin {
	public static anticreep thisPlugin;
	FileConfiguration config = getConfig();
	
	@Override
	public void onEnable() {
		anticreep.thisPlugin = this;
		
		//Config
		saveConfig();
		
		//Metrics
		Metrics metrics = new Metrics(this);
		
		//Listeners
		getServer().getPluginManager().registerEvents(new damageListener(), this);
		getServer().getPluginManager().registerEvents(new creeperListener(), this);
		getServer().getPluginManager().registerEvents(new spawnListener(), this);
		
		//Commands
		this.getCommand("acversion").setExecutor(new versionCom());
		this.getCommand("acreload").setExecutor(new reloadConfigCommand());
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public void saveConfig() {
		this.saveDefaultConfig();
	}
}
