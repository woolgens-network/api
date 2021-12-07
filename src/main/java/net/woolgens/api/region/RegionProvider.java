package net.woolgens.api.region;

import net.woolgens.api.WoolgensProvider;
import org.bukkit.Location;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@WoolgensProvider
public interface RegionProvider {

    /**
     * Check if a region exists with the given id
     *
     * @param id
     * @return
     */
    boolean existsRegionById(String id);

    /**
     * Check if location is in region
     *
     * @param location
     * @param name
     * @return
     */
    boolean isInRegion(Location location, String id);

}
