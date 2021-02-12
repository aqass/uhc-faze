package aqass.fazeuhc.events;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import sun.jvm.hotspot.ui.ObjectHistogramPanel;

import static aqass.fazeuhc.scoreboards.mainStats.HowManyPlayersIsOnServer;
import static aqass.fazeuhc.scoreboards.mainStats.HowManyPlayersIsLive;

public class onLeave implements Listener {
    public static void OnPlayerLeaveServer(PlayerQuitEvent e){
        HowManyPlayersIsOnServer--;

    }
}
