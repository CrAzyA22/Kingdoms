package de.crazya22.kingdoms.player;

import de.crazya22.kingdoms.files.PlayerFileManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashMap;

public class PlayerManager implements Listener {

    public static HashMap<String, PlayerMirror> playerStats = new HashMap<>();

    public static void savePlayerStats() {
        for(String name : playerStats.keySet()) {
            for(String stat : playerStats.get(name).getStats().keySet()) {
                PlayerFileManager.getInstance().set(name + "." + stat, playerStats.get(name).getStats().get(stat));
            }
        }
    }

    public static void loadPlayerStats() {
        if (PlayerFileManager.getInstance().getConfigurationSection("blocks") != null) {
            for (String name : PlayerFileManager.getInstance().getConfigurationSection("").getKeys(false)) {



                double health = PlayerFileManager.getInstance().getDouble(name + ".health");
                double intelligence = PlayerFileManager.getInstance().getDouble(name + ".intelligence");
                double defense = PlayerFileManager.getInstance().getDouble(name + ".defense");
                double critChance = PlayerFileManager.getInstance().getDouble(name + ".critChance");
                double critDamage = PlayerFileManager.getInstance().getDouble(name + ".critDamage");
                double damage = PlayerFileManager.getInstance().getDouble(name + ".damage");
                double strength = PlayerFileManager.getInstance().getDouble(name + ".strength");
                double speed = PlayerFileManager.getInstance().getDouble(name + ".speed");
                double luck = PlayerFileManager.getInstance().getDouble(name + ".luck");
                double breakingSpeed = PlayerFileManager.getInstance().getDouble(name + ".breakingSpeed");
                double fortune = PlayerFileManager.getInstance().getDouble(name + ".fortune");
                double spellbound = PlayerFileManager.getInstance().getDouble(name + ".spellbound");
                double manaRegen = PlayerFileManager.getInstance().getDouble(name + ".manaRegen");

                playerStats.put(name, new PlayerMirror(health, intelligence, defense, critChance, critDamage, damage, strength, speed, luck, breakingSpeed, fortune, spellbound, manaRegen));
            }
        }
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        if(!playerStats.containsKey(e.getPlayer().getName())) {

        }
    }

}
