package net.woolgens.api.web.model;

import lombok.Data;

import java.util.Map;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Data
public class WebTemporaryToken {

    private String id;
    private String type;
    private long ttl;
    private Map<String, Object> data;
}
