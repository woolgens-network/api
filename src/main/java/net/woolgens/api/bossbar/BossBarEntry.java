package net.woolgens.api.bossbar;

import org.bukkit.entity.Player;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public interface BossBarEntry {

    String getMessage(Player player);
    long getStayInSeconds();
}
