package net.woolgens.api;

import lombok.NonNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public final class WoolgensApi {

    /** Registered providers **/
    private static final Map<Class<?>, Object> PROVIDERS = new HashMap<>();

    /**
     * Register a provider with the given class type and the instance
     *
     * @param clazz the interface on the api side that is annotated with {@link WoolgensProvider}
     * @param instance
     * @param <T>
     * @throws IllegalArgumentException = when instance is not annotated with {@link WoolgensProvider}
     */
    public static <T> void registerProvider(Class<?> clazz, @NonNull T instance) throws IllegalArgumentException {
        if(!clazz.isAnnotationPresent(WoolgensProvider.class)) {
            throw new IllegalArgumentException("Missing WoolgensProvider annotation");
        }
        PROVIDERS.put(clazz, instance);
    }

    /**
     * Get provider by class type that remains on the api side
     *
     * @param provider
     * @param <T> returns the instance that is registered on this class type
     * @return
     */
    public static <T> T getProvider(Class<?> provider) {
        Object instance = PROVIDERS.get(provider);
        if(instance == null){
            return null;
        }
        return (T) instance;
    }

    /**
     * Check if the given class type is registered as a provider
     *
     * @param provider
     * @return
     */
    public static boolean existsProvider(Class<?> provider) {
        return PROVIDERS.containsKey(provider);
    }

}
