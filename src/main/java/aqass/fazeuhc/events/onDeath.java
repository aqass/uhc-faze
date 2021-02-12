package aqass.fazeuhc.events;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

import static aqass.fazeuhc.scoreboards.mainStats.HowManyPlayersIsDead;
import static aqass.fazeuhc.scoreboards.mainStats.HowManyPlayersIsLive;

public class onDeath implements Listener {
    @EventHandler
    public static void onPlayerDeath(PlayerRespawnEvent e){
        Player player = e.getPlayer();
        player.setGameMode(GameMode.SPECTATOR);
        player.sendMessage(ChatColor.WHITE+ "Player "+ChatColor.YELLOW+player.getDisplayName() +ChatColor.WHITE + " has been killed by "+ChatColor.DARK_PURPLE+ player.getKiller());

        HowManyPlayersIsDead++;
        HowManyPlayersIsLive--;

    }
}
