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

    boolean isInRegion(Location location, String name);

}
