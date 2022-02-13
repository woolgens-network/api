package net.woolgens.api.user.settings;

import net.woolgens.api.user.User;
import org.bukkit.entity.Player;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public interface UserSettingClick {

    void onClick(User user, Player player, boolean enable);
}
