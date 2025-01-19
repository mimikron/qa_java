package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    final private String gender;
    final private boolean hasMane;

    final private Feline feline = Mockito.mock(Feline.class);


    public LionParametrizedTest(String gender, boolean hasMane) {
        this.gender = gender;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getGenders() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void checkLion() throws Exception {
            Lion lion = new Lion(feline, gender);
            assertEquals(String.format("Значение %s не соответсвует ожидаемому", hasMane), hasMane, lion.doesHaveMane());
    }
}