package aqass.fazeuhc.events;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public class onRegeneration implements Listener {

    @EventHandler
    public void onRegeneration(EntityRegainHealthEvent e) {

        e.setCancelled(true);

    }

}
