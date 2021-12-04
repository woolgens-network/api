package net.woolgens.api.warp;

import net.woolgens.api.WoolgensProvider;
import org.bukkit.Location;
import org.bukkit.Material;

@WoolgensProvider
public interface WarpProvider {

    /**
     * Create a new warp with the given key and display, material
     *
     * @param key
     * @param display
     * @param material
     */
    void setWarp(String key, String display, Material material);

    /**
     * Remove a warp by the given key
     *
     * @param key
     */
    void removeWarp(String key);

    /**
     * Get a warp with the key
     *
     * @param key
     * @return
     */
    Warp getWarp(String key);

    /**
     * Check with a key if the warp exists
     *
     * @param key
     * @return
     */
    boolean existsWarp(String key);

    /**
     * Get the warp location with the key
     *
     * @param key
     * @return
     */
    Location getWarpLocation(String key);

}
