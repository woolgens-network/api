package net.woolgens.api.user.data.quest;

import lombok.Data;

import java.util.Map;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Data
public class SeasonQuestSelectData {

    private Map<String, Long> objectives;
    private long timestamp;
}
