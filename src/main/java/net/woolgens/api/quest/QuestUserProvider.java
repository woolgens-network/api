package net.woolgens.api.quest;

import net.woolgens.api.WoolgensProvider;
import net.woolgens.api.quest.model.Quest;
import net.woolgens.api.user.User;
import net.woolgens.api.user.data.quest.SeasonQuestSelectData;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@WoolgensProvider
public interface QuestUserProvider<U extends User> {

    /**
     * Select a quest for user
     *
     * @param user
     * @param id
     * @return {@link Quest}
     */
    Quest selectQuest(U user, String id);

    /**
     * Unselect quest for user
     *
     * @param user
     * @param id
     * @return {@link Quest}
     */
    Quest unselectQuest(U user, String id);

    /**
     * Unselect all selected quests for user
     *
     * @param user
     * @return {@link Quest}
     */
    void unselectAllQuests(U user);

    /**
     * Check if user has quest selected
     *
     * @param user
     * @param id
     * @return
     */
    boolean hasQuestSelected(User user, String id);

    /**
     * Get quest progress of the given selected quest id
     *
     * @param user
     * @param id
     * @return
     */
    long getQuestProgress(U user, String id, String objectiveId);

    /**
     * Get sum of all objective's progress
     *
     * @param user
     * @param id
     * @return
     */
    long getQuestOverallProgress(U user, String id);

    /**
     * Check if quest is finished (depended on time)
     *
     * @param user
     * @param id
     * @return
     */
    boolean isQuestFinished(U user, String id);

    /**
     * Progress the selected quest with the given id and objectiveId
     * The long value will be added to the current progress of the quest
     *
     * @param user
     * @param id
     * @param objectiveId
     * @param progress
     * @return
     */
    Quest progress(U user, String id, String objectiveId, long progress);


    /**
     * Get the current selected data of the given quest id
     *
     * @param user
     * @param id
     * @return
     */
    SeasonQuestSelectData getSelection(U user, String id);


    /**
     * Remove daily & weekly quests if time is out
     *
     * @param user
     */
    void reloadQuests(U user);
}
