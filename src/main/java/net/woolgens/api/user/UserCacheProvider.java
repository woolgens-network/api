package net.woolgens.api.user;

import net.woolgens.api.WoolgensProvider;

import java.util.UUID;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@WoolgensProvider
public interface UserCacheProvider {

    /**
     * Insert uuid and name into cache
     *
     * @param uuid
     * @param name
     */
    void put(String uuid, String name);

    /**
     * Get user name by uuid {@link UUID}
     *
     * @param uuid {@link UUID}
     * @return
     */
    String getNameByUUID(UUID uuid);

    /**
     * Get user uuid by name
     *
     * @param name
     * @return {@link UUID}
     */
    UUID getUUIDByName(String name);

    /**
     * Check if user exists by uuid
     *
     * @param uuid {@link UUID}
     * @return
     */
    boolean existsByUUID(UUID uuid);

    /**
     * Check if user exists by name
     *
     * @param name
     * @return
     */
    boolean existsByName(String name);

}
