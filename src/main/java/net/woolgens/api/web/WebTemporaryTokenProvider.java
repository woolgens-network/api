package net.woolgens.api.web;

import net.woolgens.api.WoolgensProvider;
import net.woolgens.api.web.model.WebTemporaryToken;

import java.util.concurrent.CompletableFuture;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@WoolgensProvider
public interface WebTemporaryTokenProvider {

    /**
     * Register token
     *
     * @param token {@link WebTemporaryToken}
     * @return
     */
    WebTemporaryToken register(WebTemporaryToken token);

    /**
     * Register token async
     *
     * @param token {@link WebTemporaryToken}
     * @return
     */
    CompletableFuture<WebTemporaryToken> registerAsync(WebTemporaryToken token);

    /**
     * Get token by id
     *
     * @param id
     * @return
     */
    WebTemporaryToken getTokenById(String id);

    /**
     * Check if token is valid (exists and ttl)
     *
     * @param id
     * @return
     */
    boolean isTokenValid(String id);
}
