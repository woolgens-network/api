package net.woolgens.api.user.data;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Data
@NoArgsConstructor
public class UserData {

    private String uuid;

    public UserData(String uuid) {
        this.uuid = uuid;
    }
}
