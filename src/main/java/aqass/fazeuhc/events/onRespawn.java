package aqass.fazeuhc.events;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

import static aqass.fazeuhc.scoreboards.mainStats.HowManyPlayersIsDead;
import static aqass.fazeuhc.scoreboards.mainStats.HowManyPlayersIsLive;

public class onRespawn implements Listener {
    public static void onPlayerRespawn(PlayerRespawnEvent e){
        Player player = null;
        player.setGameMode(GameMode.SPECTATOR);
    
            HowManyPlayersIsDead++;
            HowManyPlayersIsLive--;
     
    }
}
