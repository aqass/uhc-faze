package aqass.fazeuhc.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static aqass.fazeuhc.scoreboards.playerHp.PlayerHealthScoreboard;

public class onJoin implements Listener {
    @EventHandler
    public void OnJoin(PlayerJoinEvent e){
    Player player;

        PlayerHealthScoreboard(e.getPlayer());

    }

}
