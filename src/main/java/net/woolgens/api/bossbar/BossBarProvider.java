package net.woolgens.api.bossbar;

import net.woolgens.api.WoolgensProvider;

import java.util.Collection;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@WoolgensProvider
public interface BossBarProvider {

    void register(BossBarEntry entry);

    BossBarEntry getCurrentEntry();

    Collection<BossBarEntry> getEntries();
}
