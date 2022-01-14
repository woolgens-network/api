package net.woolgens.api.quest;

import net.woolgens.api.WoolgensProvider;
import net.woolgens.api.quest.model.Quest;

import java.util.Collection;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/

@WoolgensProvider
public interface QuestProvider {

    /**
     * Create a new quest (local)
     *
     * @param quest {@link Quest}
     */
    void createQuest(Quest quest);

    /**
     * Delete a quest
     *
     * @param id
     */
    void deleteQuest(String id);

    /**
     * Get quest by id
     *
     * @param id
     * @return {@link Quest}
     */
    Quest getQuest(String id);

    /**
     * Check if quest exists by id
     *
     * @param id
     * @return
     */
    boolean existsQuest(String id);

    /**
     * Get all quests (local)
     *
     * @return {@link Collection} {@link Quest}
     */
    Collection<Quest> getQuests();

    /**
     * Get sum of all objective's max progress
     *
     * @param id
     * @return
     */
    long getNeededQuestProgress(String id);


}
