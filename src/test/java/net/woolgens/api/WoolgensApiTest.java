package net.woolgens.api;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public class WoolgensApiTest {

    @Test
    public void registerAndGetProvider() {
        WoolgensApi.registerProvider(TestProvider.class, new TestAdapter());

        TestProvider provider = WoolgensApi.getProvider(TestProvider.class);


        List<Double> randomList = new ArrayList<>();

        for (int i = 0; i < 105; i++) {
            randomList.add(Math.random());
        }

        int get = 100;

        List<Double> newList = randomList.size() < 100 ? new ArrayList<>(randomList) : randomList.subList(randomList.size() - get, randomList.size());
        System.out.println(newList.size());

        assertEquals(true, provider.execute());


    }


    @WoolgensProvider
    interface TestProvider {

        boolean execute();

    }

    class TestAdapter implements TestProvider{

        @Override
        public boolean execute() {
            return true;
        }
    }


}
