package net.woolgens.api.user.data;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Getter @Setter
public class HomeData {

    private String name;
    private String locationValue;
    private transient Location location;

    @Override
    public String toString() {
        return name;
    }
}
