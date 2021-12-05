package net.woolgens.api.user;

import net.woolgens.api.user.data.SeasonData;
import net.woolgens.api.user.data.UserData;


/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public interface User {

    /**
     * Saved data in the database
     *
     * @return = {@link UserData}
     */
    UserData getData();


    /**
     * Get current season data
     *
     * @return = {@link SeasonData}
     */
    SeasonData getSeasonData();

    /**
     * Set a local cached key-value tag
     *
     * @param key
     * @param value
     */
    void setTag(String key, Object value);

    /**
     * Remove a tag
     *
     * @param key
     */
    void removeTag(String key);

    /**
     * Get a tag by key
     *
     * @param key
     * @param <T>
     * @return
     */
    <T> T getTag(String key);

    /**
     * Check if a tag exists
     *
     * @param key
     * @return
     */
    boolean containsTag(String key);

}
