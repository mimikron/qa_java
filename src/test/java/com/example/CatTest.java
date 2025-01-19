package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @InjectMocks
    private Cat cat;

    @Test
    public void checkGetSound() {
        assertEquals(String.format("Звук %s, не соответствует ожидаемому \"Мяу\"", cat.getSound()), "Мяу", cat.getSound());
    }

    @Test
    public void checkGetFood() throws Exception {
        List meat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(meat);
        assertEquals(String.format("Список еды %s, не соответствует ожидаемому", cat.getFood()), meat, cat.getFood());
    }
}