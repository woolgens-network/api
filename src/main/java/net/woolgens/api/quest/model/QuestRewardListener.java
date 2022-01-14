package net.woolgens.api.quest.model;

import net.woolgens.api.user.User;
import org.bukkit.entity.Player;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public interface QuestRewardListener {

    void onReward(User user, Player player);
}
