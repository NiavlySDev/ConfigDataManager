package fr.niavlys.dev.cdm.main;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigDataManager {

    /**
     * The file where the configuration data is stored.
     */
    private final File file;

    /**
     * The configuration object for managing the data.
     */
    private final FileConfiguration config;

    /**
     * Constructor to initialize the ConfigDataManager with the specified plugin name and file name.
     *
     * @param pluginName The name of the plugin.
     * @param fileName   The name of the configuration file.
     */
    public ConfigDataManager(String pluginName, String fileName) {
        File pluginFolder = new File("plugins/" + pluginName);
        if (!pluginFolder.exists()) {
            pluginFolder.mkdirs();
        }

        this.file = new File(pluginFolder, fileName);
        if (!this.file.exists()) {
            try {
                this.file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        this.config = YamlConfiguration.loadConfiguration(this.file);
    }

    /**
     * Get a value from the configuration using a UUID and a key.
     *
     * @param uuid The UUID of the object.
     * @param key  The key to retrieve the value.
     * @return The value associated with the key.
     */
    public Object get(UUID uuid, String key) {
        return get(uuid.toString(), key);
    }

    /**
     * Get a value from the configuration using an object identifier and a key.
     * @param objet The identifier of the object.
     * @param key The key to retrieve the value.
     */
    public Object get(String objet, String key) {
        String path = objet + "." + key;
        return config.get(path, null);
    }

    /**
     * Set a value in the configuration using a UUID and a key.
     * @param uuid The UUID of the object.
     * @param key The key to set the value.
     */
    public void set(UUID uuid, String key, Object value) {
        set(uuid.toString(), key, value);
    }

    /**
     * Set a value in the configuration using an object identifier and a key.
     * @param objet The identifier of the object.
     * @param key The key to set the value.
     */
    public void set(String objet, String key, Object value) {
        String path = objet + "." + key;
        config.set(path, value);
        save();
    }

    /**
     * Remove a value from the configuration using a UUID and a key.
     * @param uuid The UUID of the object.
     * @param key The key to remove the value.
     */
    public void remove(UUID uuid, String key) {
        remove(uuid.toString(), key);
    }

    /**
     * Remove a value from the configuration using an object identifier and a key.
     * @param objet The identifier of the object.
     * @param key The key to remove the value.
     */
    public void remove(String objet, String key) {
        String path = key == null ? objet : objet + "." + key;
        config.set(path, null);
        save();
    }

    /**
     * Save the configuration to the file.
     */
    private void save() {
        try {
            config.save(this.file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Check if an object exists in the configuration using a UUID.
     * @param uuid The UUID of the object.
     */
    public boolean exists(UUID uuid) {
        return exists(uuid.toString());
    }

    /**
     * Check if an object exists in the configuration using an object identifier.
     * @param objet The identifier of the object.
     */
    public boolean exists(String objet) {
        return config.contains(objet);
    }

    /**
     * Get the entire configuration section for a player using their UUID.
     * @param uuid The UUID of the player.
     * @return The FileConfiguration section for the player.
     */
    public FileConfiguration getPlayerData(UUID uuid) {
        return (FileConfiguration) config.getConfigurationSection(uuid.toString());
    }
}
