package net.woolgens.api.permission;

import net.woolgens.api.WoolgensProvider;
import org.bukkit.entity.Player;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@WoolgensProvider
public interface PermissionProvider {

    /**
     * Get group prefix of a player
     *
     * @param player
     * @return
     */
    String getPrefix(Player player);

    /**
     * Get group suffix of a player
     *
     * @param player
     * @return
     */
    String getSuffix(Player player);


    /**
     * Get prefix and suffix level format
     *
     * @param player
     * @return
     */
    String getFormat(Player player);

}
