package aqass.fazeuhc.scoreboards;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class mainStats implements Listener{
        public static int HowManyPlayersIsDead = 0;
        public static int HowManyPlayersIsLive = 0;
            public static void PlayerMainScoreboard(Player player){

            ScoreboardManager manager = Bukkit.getScoreboardManager();
            Scoreboard board = manager.getNewScoreboard();

            Objective objective = board.registerNewObjective("Healthscoreboard", "PlayerLive");
            objective.setDisplaySlot(DisplaySlot.SIDEBAR);
            objective.setDisplayName(ChatColor.YELLOW+ "  UHC Faze  ");

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();

            Score date = objective.getScore(ChatColor.GRAY+"Date: "+dtf.format(now));
            date.setScore(12);
                Score score11 = objective.getScore("              ");
                score11.setScore(11);
                Score score10 = objective.getScore("                    ");
                score10.setScore(10);
                Score score9 = objective.getScore("            ");
                score9.setScore(9);
            Score livePlayers = objective.getScore(ChatColor.WHITE+"Players: "+ChatColor.GREEN+ HowManyPlayersIsLive);
            livePlayers.setScore(8);
                Score score7 = objective.getScore("                     ");
                score7.setScore(7);
                Score score6 = objective.getScore("                    ");
                score6.setScore(6);
                Score score5 = objective.getScore("                ");
                score5.setScore(5);
            Score kills = objective.getScore(ChatColor.WHITE+"Kills: "+ ChatColor.GREEN+ player.getStatistic(Statistic.PLAYER_KILLS));
            kills.setScore(4);
                Score score42 = objective.getScore("         ");
                score42.setScore(3);
                Score score31 = objective.getScore("   ");
                score31.setScore(2);
                Score score105 = objective.getScore(" ");
                score105.setScore(1);
                Score score102 = objective.getScore(ChatColor.YELLOW+"Plugin is created by ????");
                score102.setScore(0);



            player.setScoreboard(board);







        }

}
