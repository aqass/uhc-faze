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
        public static int HowManyPlayersIsOnServer = 0;
        public static int HowManyPlayersIsLive = 0;
            public static void PlayerMainScoreboard(Player player){

            ScoreboardManager manager = Bukkit.getScoreboardManager();
                assert manager != null;
                Scoreboard board = manager.getNewScoreboard();

            Objective objective = board.registerNewObjective("s", "d");
            objective.setDisplaySlot(DisplaySlot.SIDEBAR);
            objective.setDisplayName(ChatColor.YELLOW+ " UHC Faze ");

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();

            Score score1 = objective.getScore(ChatColor.GRAY+"Date: "+dtf.format(now));
            score1.setScore(12);

                Score score2 = objective.getScore("              ");
                score2.setScore(11);

                Score score3 = objective.getScore(ChatColor.WHITE +"Nick: "+ChatColor.YELLOW+ player.getName());
                score3.setScore(10);

                Score score4 = objective.getScore("            ");
                score4.setScore(9);

                Score score5 = objective.getScore(ChatColor.WHITE+ "Live Players: "+ChatColor.GRAY+HowManyPlayersIsLive);
                score5.setScore(8);

            Score score6 = objective.getScore(ChatColor.WHITE+"Players: "+ChatColor.GREEN+ HowManyPlayersIsOnServer);
            score6.setScore(7);


                Score score7 = objective.getScore("               ");
                score7.setScore(6);

                Score score8 = objective.getScore("           ");
                score8.setScore(5);

            Score score9 = objective.getScore(ChatColor.WHITE+"Kills: "+ ChatColor.DARK_PURPLE+ player.getStatistic(Statistic.PLAYER_KILLS));
            score9.setScore(4);

                Score score10 = objective.getScore(ChatColor.WHITE+"Health "+ ChatColor.RED+player.getHealth());
                score10.setScore(3);

                Score score11 = objective.getScore("   ");
                score11.setScore(2);

                Score score12 = objective.getScore(ChatColor.YELLOW+"Scoreboard created by SepteRR");
                score12.setScore(1);




            player.setScoreboard(board);







        }

}
