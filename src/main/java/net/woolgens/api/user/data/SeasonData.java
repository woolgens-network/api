package net.woolgens.api.user.data;

import lombok.Data;
import net.woolgens.api.user.data.quest.SeasonQuestData;
import net.woolgens.api.user.data.skills.Skills;

import java.util.Map;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Data
public class SeasonData {

    private double balance;

    private int level;
    private long exp;

    private SeasonQuestData quests;
    private Skills skills;
    private Map<String, Long> stats;
    private Map<String, Integer> crates;
    private Map<String, Object> extensions;
    private Map<String, Long> timestamps;
    private Map<String, HomeData> homes;
}
