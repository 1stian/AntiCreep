package com.onestian.anticreep;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class damageListener implements Listener {
	
	@EventHandler
	public void creeperExplode(EntityDamageByEntityEvent event) {
			
		if (readConfig.getPlayer()) {
			if (event.getEntityType() == EntityType.PLAYER) {
				if (event.getDamager().getType() == EntityType.CREEPER || creeperListener.customExplosion) {
					event.setCancelled(true);
					
					//Making it false again!
					creeperListener.customExplosion = false;
				}
			}
		}
	}
}
