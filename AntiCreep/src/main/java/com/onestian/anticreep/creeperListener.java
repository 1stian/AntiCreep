package com.onestian.anticreep;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class creeperListener implements Listener {
	
	public static boolean customExplosion = false;
	
	@EventHandler (priority = EventPriority.HIGH)
	public void creeperExplode(EntityExplodeEvent event) {
		//Getting config values
		boolean blockDmg = readConfig.getblock();
		boolean customRadius = readConfig.getCustom();
		int radius = readConfig.getRadius();
		
		String bDmg = Boolean.toString(blockDmg);
		EntityType entity = event.getEntityType();
		Entity creeper = event.getEntity();
		World world = event.getLocation().getWorld();
		
		if (blockDmg) {
			if (entity == EntityType.CREEPER) {
				event.setCancelled(true);
				if (world != null) {
					world.playSound(creeper.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1, 0);
				}
			}
		}
		
		if (customRadius) {
			if (entity == EntityType.CREEPER) {
				//Getting creeper location
				Location creeperLoc = event.getLocation();
				
				//Canceling creeper explosion and setting custom explosion.
				event.setCancelled(true);
				
				customExplosion = true;
				//anticreep.thisPlugin.getLogger().info("Custom explosion true");
				
				//Creating custom explosion
				switch (bDmg.toLowerCase()) {
				case "false": creeperLoc.getWorld().createExplosion(creeperLoc, radius, false);
					break;
				case "true": creeperLoc.getWorld().createExplosion(creeperLoc.getX(), creeperLoc.getY(), creeperLoc.getZ(), radius, false, false);
					break;
					default: creeperLoc.getWorld().createExplosion(creeperLoc, radius, false);
					break;
				}
			}
		}
	}
}
