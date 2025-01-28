package de.crazya22.kingdoms;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main plugin;

    @Override
    public void onEnable() {

        plugin = this;
        PluginManager pluginManager = Bukkit.getPluginManager();

    }

    @Override
    public void onDisable() {

    }
}
