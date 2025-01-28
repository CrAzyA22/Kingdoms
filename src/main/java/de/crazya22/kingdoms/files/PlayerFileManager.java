package de.crazya22.kingdoms.files;

import de.crazya22.kingdoms.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class PlayerFileManager {

    private final static PlayerFileManager instance = new PlayerFileManager();

    private File blockStorage;
    private YamlConfiguration blockStorageConfig;

    private PlayerFileManager() {

    }

    public void load() {
        blockStorage = new File(Main.plugin.getDataFolder(), "playerStatsStorage.yml");
        if(!blockStorage.exists()) {
            Main.plugin.saveResource("playerStatsStorage.yml", false);
        }
        blockStorageConfig = YamlConfiguration.loadConfiguration(blockStorage);
        blockStorageConfig.options().parseComments(true);
        try{
            blockStorageConfig.load(blockStorage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void set(String path, Object value) {
        blockStorageConfig.set(path, value);
        save();
    }

    public void save() {
        try {
            blockStorageConfig.save(blockStorage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getString(String path) {
        return blockStorageConfig.getString(path);
    }

    public int getInt(String path) {
        return blockStorageConfig.getInt(path);
    }

    public org.bukkit.configuration.ConfigurationSection getConfigurationSection(String path) {
        return blockStorageConfig.getConfigurationSection(path);
    }

    public static PlayerFileManager getInstance() {
        return instance;
    }
}
