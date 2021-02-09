package aqass.fazeuhc.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.potion.PotionEffectType;



public class onRegeneration implements Listener {


    @EventHandler
    public void onRegeneration(EntityRegainHealthEvent e) {

        if ( e.getRegainReason().equals(EntityRegainHealthEvent.RegainReason.REGEN)) {
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
        }

    }

}
