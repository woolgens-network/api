package net.woolgens.api.land;

import net.woolgens.api.WoolgensProvider;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@WoolgensProvider
public interface LandProvider {

    /**
     * Check if player is in a land
     *
     * @param player
     * @return
     */
    boolean hasLand(Player player);

    /**
     * Check if location is in player's land
     *
     * @param player
     * @param location
     * @return
     */
    boolean isInOwnLand(Player player, Location location);

    /**
     * Check if location is in a land
     *
     * @param location
     * @return
     */
    boolean isInLand(Location location);

    /**
     * Check if player is allowed to build in this location depended on land
     *
     * @param player
     * @param location
     * @return
     */
    boolean isAllowedToBuild(Player player, Location location);
}
