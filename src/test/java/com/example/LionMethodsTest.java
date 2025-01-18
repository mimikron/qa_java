package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionMethodsTest {

    @Mock
    private Feline feline;

    @Test
    public void checkGetKittens() throws Exception{
        Lion lion = new Lion(feline, "Самка");
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void checkGetFood() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
}
