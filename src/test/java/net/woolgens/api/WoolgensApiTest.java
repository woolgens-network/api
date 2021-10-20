package net.woolgens.api;

import org.junit.Test;

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
