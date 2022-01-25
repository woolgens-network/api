package net.woolgens.api.user.data.skills;

import lombok.Data;

import java.util.Map;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/

@Data
public class Skills {

    private int basePoints;
    private int farmingPoints;

    private Map<String, Integer> base;
    private Map<String, Integer> farming;
}
