package aqass.fazeuhc.events;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static aqass.fazeuhc.scoreboards.mainStats.HowManyPlayersIsOnServer;
import static aqass.fazeuhc.scoreboards.mainStats.HowManyPlayersIsLive;
import static aqass.fazeuhc.scoreboards.mainStats.PlayerMainScoreboard;



public class onJoin implements Listener {

    @EventHandler
    public void  OnJoin(PlayerJoinEvent e){

            PlayerMainScoreboard(e.getPlayer());

            HowManyPlayersIsOnServer++;
            HowManyPlayersIsLive++;
    }
    }

