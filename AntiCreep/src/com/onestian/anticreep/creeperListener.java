package com.onestian.anticreep;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class creeperListener implements Listener {
	
	boolean blockDmg = readConfig.getblock();
	boolean customRadius = readConfig.getCustom();
	int radius = readConfig.getRadius();
	
	@EventHandler
	public void creeperExplode(EntityExplodeEvent event) {
		String bDmg = Boolean.toString(blockDmg);
		EntityType enty = event.getEntityType();
		
		if (blockDmg) {
			if (enty == EntityType.CREEPER) {
				event.setCancelled(true);
			}
		}
		
		if (customRadius) {
			if (enty == EntityType.CREEPER) {
				//Getting creeper location
				Location creeperLoc = event.getLocation();
				
				//Canceling creeper explosion
				event.setCancelled(true);
				
				//Creating custom explosion
				switch (bDmg.toLowerCase()) {
				case "true":
					creeperLoc.getWorld().createExplosion(creeperLoc, radius, false);
					break;
				case "false":
					creeperLoc.getWorld().createExplosion(creeperLoc.getX(), creeperLoc.getY(), creeperLoc.getZ(), radius, false, false);
					break;
				}
			}
		}
	}
}
