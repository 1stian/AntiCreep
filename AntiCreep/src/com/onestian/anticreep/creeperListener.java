package com.onestian.anticreep;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class creeperListener implements Listener {
	
	@EventHandler
	public void creeperExplode(EntityExplodeEvent event) {
		
		EntityType enty = event.getEntityType();
		
		if (readConfig.getblock()) {
			if (enty == EntityType.CREEPER) {
				event.setCancelled(true);
			}
		}
	}

}
