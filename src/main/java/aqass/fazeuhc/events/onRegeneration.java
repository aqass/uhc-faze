package aqass.fazeuhc.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.potion.PotionEffectType;



public class onRegeneration implements Listener {


    @EventHandler
    public void onRegeneration(EntityRegainHealthEvent e) {
        Player player = null;
        if(player.getActivePotionEffects()== PotionEffectType.REGENERATION){
            e.setCancelled(false);

        }
        if(!(player.getActivePotionEffects()== PotionEffectType.REGENERATION)){
            e.setCancelled(true);

        }

    }

}