package net.woolgens.api.web;

import net.woolgens.api.WoolgensProvider;
import net.woolgens.api.web.model.WebUser;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@WoolgensProvider
public interface WebUserProvider {

    /**
     * Exists user by uuid
     *
     * @param uuid
     * @return
     */
    boolean existsUserByUUID(UUID uuid);

    /**
     * Get user by uuid
     *
     * @param uuid
     * @return
     */
    WebUser getUserByUUID(UUID uuid);

    /**
     * Save user
     *
     * @param user
     */
    WebUser save(WebUser user);

    /**
     * Save user async
     *
     * @param user
     * @return
     */
    CompletableFuture<WebUser> saveAsync(WebUser user);
}
