package net.woolgens.api.user.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Data
@NoArgsConstructor
public class UserData {

    private String uuid;
    private String name;

    //----------------------------------------
    private String land;
    //----------------------------------------

    //----------------------------------------
    // Global
    private long joined;
    private Map<String, Long> stats;
    private Map<String, Object> settings;
    private Map<String, Object> extensions;
    //----------------------------------------

    private Map<String, SeasonData> seasons;
}
