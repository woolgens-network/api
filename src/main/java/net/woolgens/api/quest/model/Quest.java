package net.woolgens.api.quest.model;

import lombok.Data;

import java.util.*;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Data
public class Quest {

    private final String id;
    private final String title;
    private final QuestTimeType timeType;
    private final String category;

    private Map<Integer, Map<String, QuestObjective>> objectives;
    private List<String> rewards;
    private List<QuestRewardListener> listeners;

    public Quest(String id, String title, QuestTimeType timeType, String category) {
        this.id = id;
        this.title = title;
        this.timeType = timeType;
        this.category = category;
        this.rewards = new ArrayList<>();
        this.listeners = new ArrayList<>();
        this.objectives = new LinkedHashMap<>();
    }

    public int getMaxStates() {
        return this.objectives.size();
    }

    public Quest addReward(String message) {
        this.rewards.add(message);
        return this;
    }

    public Quest addListener(QuestRewardListener rewardListener) {
        this.listeners.add(rewardListener);
        return this;
    }

    public Quest addObjective(int state, String id, long maxProgress, String message) {
        return addObjective(state, new QuestObjective(id, maxProgress, message));
    }

    public Quest addObjective(int state, QuestObjective objective) {
        if(!this.objectives.containsKey(state)) {
            this.objectives.put(state, new LinkedHashMap<>());
        }
        this.objectives.get(state).put(objective.getId(), objective);
        return this;
    }
}
