package net.woolgens.api.user;

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


}
