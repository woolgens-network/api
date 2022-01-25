package net.woolgens.api.quest.model;

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
public enum QuestTimeType {

    DAILY(1000 * 60 * 60 * 24),
    WEEKLY(1000 * 60 * 60 * 24 * 7),
    ONE_TIME(-1);

    private final long time;
}
