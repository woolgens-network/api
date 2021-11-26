package net.woolgens.api.vault;

import net.woolgens.api.WoolgensProvider;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@WoolgensProvider
public interface VaultProvider {

    /**
     * Get a secret from our external vault (key-value) service
     *
     * @param category
     * @param key
     * @return = secret
     */
    String getSecret(String category, String key);
}
