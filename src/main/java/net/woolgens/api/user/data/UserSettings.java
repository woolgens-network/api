package net.woolgens.api.user.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Getter
@AllArgsConstructor
public enum UserSettings {

    SIDEBAR(true),
    CLEARLAG_MESSAGES(true),
    CRATE_ANIMATION(true);

    private final Object defaultValue;
}
