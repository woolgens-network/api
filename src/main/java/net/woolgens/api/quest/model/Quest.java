package net.woolgens.api.quest.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Data
public class Quest {

    private final String id;
    private final QuestTimeType timeType;
    private final String category;

    private Map<String, QuestObjective> objectives;
    private List<String> rewards;
    private List<QuestRewardListener> listeners;

    public Quest(String id, QuestTimeType timeType, String category) {
        this.id = id;
        this.timeType = timeType;
        this.category = category;
        this.rewards = new ArrayList<>();
        this.listeners = new ArrayList<>();
        this.objectives = new LinkedHashMap<>();
    }

    public Quest addReward(String message) {
        this.rewards.add(message);
        return this;
    }

    public Quest addListener(QuestRewardListener rewardListener) {
        this.listeners.add(rewardListener);
        return this;
    }

    public Quest addObjective(String id, long maxProgress, String message) {
        return addObjective(new QuestObjective(id, maxProgress, message));
    }

    public Quest addObjective(QuestObjective objective) {
        this.objectives.put(objective.getId(), objective);
        return this;
    }
}
