package aqass.fazeuhc;

import aqass.fazeuhc.events.onRegeneration;
import org.bukkit.plugin.java.JavaPlugin;

public final class FazeUhc extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new onRegeneration(), this);

        System.out.println("Faze UHC loaded");

    }

    @Override
    public void onDisable() {
        System.out.println("This plugin kinda just died");
    }
}
