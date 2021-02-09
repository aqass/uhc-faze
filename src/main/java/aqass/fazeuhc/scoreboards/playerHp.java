package aqass.fazeuhc.scoreboards;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.*;

public class playerHp implements Listener {
 public static void PlayerHealthScoreboard(Player player){
     ScoreboardManager manager = Bukkit.getScoreboardManager();
     Scoreboard healthScoreboard = manager.getNewScoreboard();
     Objective objective = healthScoreboard.registerNewObjective("Health","Yes", ChatColor.YELLOW + "");
     objective.setDisplaySlot(DisplaySlot.PLAYER_LIST);
     Score hp = objective.getScore("");
     hp.setScore(Integer.parseInt(String.valueOf(player.getHealth())));

 }

}
