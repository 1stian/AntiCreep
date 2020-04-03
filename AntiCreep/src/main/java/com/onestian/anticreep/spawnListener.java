package com.onestian.anticreep;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class spawnListener implements Listener {
	
	@EventHandler
	public void creeperSpawn(EntitySpawnEvent event) {
		
		if (!readConfig.getSpawn()) {
			if (event.getEntityType() == EntityType.CREEPER) {
				event.setCancelled(true);
			}
		}
	}
}
