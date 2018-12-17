package com.onestian.anticreep;

import java.util.concurrent.Callable;

import org.bstats.bukkit.Metrics;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.onestian.anticreep.commands.configCommands;
import com.onestian.anticreep.commands.reloadConfigCommand;
import com.onestian.anticreep.commands.versionCom;

public class anticreep extends JavaPlugin {
	public static anticreep thisPlugin;
	FileConfiguration config = getConfig();
	
	@Override
	public void onEnable() {
		anticreep.thisPlugin = this;
		
		//Logger
		this.getLogger().info("Author: Stian '1stian' Tofte");
		this.getLogger().info("Metrics started. bStats");
		
		//Metrics
	    bStats();
		
		//Config
		saveConfig();
		
		//Listeners
		getServer().getPluginManager().registerEvents(new creeperListener(), this);
		getServer().getPluginManager().registerEvents(new damageListener(), this);
		getServer().getPluginManager().registerEvents(new spawnListener(), this);
		
		//Commands
		this.getCommand("acversion").setExecutor(new versionCom());
		this.getCommand("acreload").setExecutor(new reloadConfigCommand());
		//this.getCommand("acconfig").setExecutor(new configCommands());
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public void saveConfig() {
		this.saveDefaultConfig();
	}
	
	//Custom pies and stuff for bStats ;)
	public void bStats() {
		Metrics metrics = new Metrics(this);
		
		//Disabled block damage chart
		metrics.addCustomChart(new Metrics.SimplePie("disabled_block_damage", new Callable<String>() {
	        @Override
	        public String call() throws Exception {
	            return getConfig().getString("Disable Block Damage");
	        }
		}));
		
		//Disabled player damage chart
		metrics.addCustomChart(new Metrics.SimplePie("disabled_player_damage", new Callable<String>() {
	        @Override
	        public String call() throws Exception {
	            return getConfig().getString("Disable Player Damage");
	        }
		}));

		//Creeper spawning
		metrics.addCustomChart(new Metrics.SimplePie("creeper_spawning", new Callable<String>() {
	        @Override
	        public String call() throws Exception {
	            return getConfig().getString("Spawn creepers");
	        }
		}));
		
		//Custom explosion
		metrics.addCustomChart(new Metrics.SimplePie("custom_explosion", new Callable<String>() {
	        @Override
	        public String call() throws Exception {
	            return getConfig().getString("Custom Explosion Radius");
	        }
		}));
		
		//Explosion radius
		metrics.addCustomChart(new Metrics.SimplePie("explosion_radius", new Callable<String>() {
	        @Override
	        public String call() throws Exception {
	            return getConfig().getString("Explosion Radius");
	        }
		}));
	}
}
