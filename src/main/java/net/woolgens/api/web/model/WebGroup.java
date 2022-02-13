package net.woolgens.api.web.model;

import lombok.Data;

import java.util.Set;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Data
public class WebGroup {

    private String id;
    private String name;
    private String color;
    private Set<String> permissions;
}
