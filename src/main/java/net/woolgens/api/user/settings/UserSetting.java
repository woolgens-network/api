package net.woolgens.api.user.settings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@AllArgsConstructor
@Getter
public class UserSetting {

    private final String key;
    private final UserSettingCategory category;
    private final ItemStack icon;
    private final Object defaultValue;
}
