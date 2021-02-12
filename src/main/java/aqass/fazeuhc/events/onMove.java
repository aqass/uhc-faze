package aqass.fazeuhc.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import static aqass.fazeuhc.scoreboards.mainStats.*;


public class onMove implements Listener {
    @EventHandler
    public static void onPlayerMove(PlayerMoveEvent e){
        Player player = null;
        PlayerMainScoreboard(e.getPlayer());




    }

}
