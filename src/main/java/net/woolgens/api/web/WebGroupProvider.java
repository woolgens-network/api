package net.woolgens.api.web;

import net.woolgens.api.WoolgensProvider;
import net.woolgens.api.web.model.WebGroup;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@WoolgensProvider
public interface WebGroupProvider {

    /**
     * Register groups
     *
     * @param groups List of {@link WebGroup}
     * @return
     */
    List<WebGroup> registerMany(List<WebGroup> groups);

    /**
     * Register groups async
     *
     * @param groups List of {@link WebGroup}
     * @return
     */
    CompletableFuture<List<WebGroup>> registerManyAsync(List<WebGroup> groups);
}
