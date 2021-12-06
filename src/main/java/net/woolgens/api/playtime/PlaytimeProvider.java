package net.woolgens.api.playtime;

import net.woolgens.api.WoolgensProvider;
import net.woolgens.api.user.User;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@WoolgensProvider
public interface PlaytimeProvider {

    /**
     * Get players current time on server
     *
     * @param user {@link User}
     * @return
     */
    long getServerTime(User user);

    /**
     * Get overall playtime (server time + saved time)
     *
     * @param user {@link User}
     * @return
     */
    long getOverallTime(User user);

    /**
     * Get time in `1h` format
     *
     * @param user {@link User}
     * @return
     */
    String getOverallTimeInHours(User user);
}
