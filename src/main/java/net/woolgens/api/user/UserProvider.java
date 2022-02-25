package net.woolgens.api.user;

import net.woolgens.api.WoolgensProvider;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@WoolgensProvider
public interface UserProvider<T extends User> {

    /**
     * Register a new player
     * PUT request to micro service
     *
     * @param uuid
     * @return = {@link User}
     */
    T register(UUID uuid);

    /**
     * Register a new player async
     *
     * @param uuid
     * @return
     */
    CompletableFuture<T> registerAsync(UUID uuid);

    /**
     * Load or register a player
     * User will be afterwards cached
     *
     * @param uuid
     * @return = {@link User}
     */
    T load(UUID uuid);

    /**
     * Load player async
     *
     * @param uuid
     * @return
     */
    CompletableFuture<T> loadAsync(UUID uuid);

    /**
     * Unload player from cache
     *
     * @param uuid
     */
    void unload(UUID uuid);

    /**
     * Unload all cached players
     *
     */
    void unloadAll();

    /**
     * Get user by uuid
     * User will be loaded sync if he does exist (Caching)
     *
     * @param uuid
     * @return = {@link User}
     */
    T getUserByUUID(UUID uuid);

    /**
     * Check if user exists
     *
     * @param uuid
     * @return
     */
    boolean existsUserByUUID(UUID uuid);

    /**
     * Save user sync
     *
     */
    T save(T user);

    /**
     * Save user async
     *
     * @param queue
     */
    CompletableFuture<T> saveAsync(T user, boolean queue);

    /**
     * Get all users count
     *
     * @return
     */
    long getRegisteredCount();

}
