package net.woolgens.api.quest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Data
@AllArgsConstructor
public class QuestObjective {

    private final String id;
    private final long maxProgress;
    private final String message;


}
