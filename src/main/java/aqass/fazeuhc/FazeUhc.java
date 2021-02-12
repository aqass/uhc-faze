package aqass.fazeuhc;


import aqass.fazeuhc.events.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class FazeUhc extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new onRegeneration(), this);
        getServer().getPluginManager().registerEvents(new onJoin(), this);
        getServer().getPluginManager().registerEvents(new onMove(), this);
        getServer().getPluginManager().registerEvents(new onDeath(),this);
        getServer().getPluginManager().registerEvents(new onLeave(),this);


        System.out.println("Faze UHC loaded");

    }

    @Override
    public void onDisable() {
        System.out.println("This plugin kinda just died");
    }
}
