package net.woolgens.api.user.settings;

import net.woolgens.api.WoolgensProvider;

import java.util.Collection;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@WoolgensProvider
public interface UserSettingsRegistry {

    /**
     * Register a setting into the local storage
     *
     * @param setting
     */
    void register(UserSetting setting);

    /**
     * Get setting by key from the local storage
     *
     * @param key
     * @return
     */
    UserSetting getSettingByKey(String key);

    /**
     * Get all local cached settings
     *
     * @return
     */
    Collection<UserSetting> getSettings();
}
