package net.woolgens.api.user;

import net.woolgens.api.user.data.Badge;
import net.woolgens.api.user.data.SeasonData;
import net.woolgens.api.user.data.UserData;
import net.woolgens.api.user.data.UserSettings;


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
     * Set settings by {@link UserSettings} with the given value
     *
     * @param setting
     * @param value
     */
    void setSetting(UserSettings setting, Object value);

    /**
     * Get setting generic
     *
     * @param settings {@link UserSettings}
     * @param <T>
     * @return
     */
    <T> T getSetting(UserSettings settings);

    /**
     * Get setting with the boolean type (casted to boolean)
     *
     * @param settings {@link UserSettings}
     * @return
     */
    boolean isSetting(UserSettings settings);

    /**
     * Set settings by {@link String} with the given value
     *
     * @param setting
     * @param value
     */
    void setSetting(String setting, Object value);

    /**
     * Get setting generic
     *
     * @param settings {@link String}
     * @param <T>
     * @return
     */
    <T> T getSetting(String settings);

    /**
     * Get setting with the boolean type (casted to boolean)
     *
     * @param settings {@link String}
     * @return
     */
    boolean isSetting(String settings);


    /**
     * Add exp
     *
     * @param exp
     */
    void addExp(long exp);

    /**
     * Get exp to next level
     *
     * @return
     */
    long getExpToNextLevel();

    /**
     * Get colored level (depends on level)
     *
     * @return
     */
    String getColoredLevel();

    /**
     * Wait for a given time (timestamp) (non-blocking)
     *
     * @param key
     * @param millis
     * @return
     */
    boolean wait(String key, long millis);

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

    /**
     * Check if a timestamp is available by time
     * Saved as a until timestamp
     *
     * @param key
     * @return
     */
    boolean isTimestampAvailable(String key);

    /**
     * Get until timestamp by key
     *
     * @param key
     * @return
     */
    long getTimestamp(String key);

    /**
     * Set until timestamp by ket
     *
     * @param key
     * @param until
     */
    void setTimestamp(String key, long until);

    /**
     * Add a badge (without save)
     *
     * @param badge {@link Badge}
     */
    void addBadge(Badge badge);

    /**
     * Remove badge (without save)
     *
     * @param badge {@link Badge}
     */
    void removeBadge(Badge badge);

    /**
     * Check if user has badge by title
     *
     * @param title
     * @return
     */
    boolean hasBadge(String title);

    /**
     * Get badge by title
     *
     * @param title
     * @return {@link Badge}
     */
    Badge getBadgeByTitle(String title);

}
