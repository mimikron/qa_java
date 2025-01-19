package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionMethodsTest {

    @Mock
    private Feline feline;

    @Test
    public void checkLionException() {
        Exception exception = assertThrows(Exception.class, () -> new Lion(feline, "Оно"));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }

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
