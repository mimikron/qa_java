package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @InjectMocks
    Feline feline;

    int kittensCount = new Random().nextInt(10);

    @Test
    public void checkEatMeat() throws Exception {
        assertEquals(String.format("Список еды %s, не соответствует ожидаемому", feline.eatMeat()), List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void checkGetFamily() {
        assertEquals(String.format("Семейство %s, не соответствует семейству \"Кошачьи\"", feline.getFamily()), "Кошачьи", feline.getFamily());
    }

    @Test
    public void checkGetKittens() {
        assertEquals(String.format("Количество котят: %s, не соответствует 1", feline.getKittens()), 1, feline.getKittens());
    }

    @Test
    public void checkGetKittensWhithCount() {
        assertEquals(String.format("Количество котят: %s, не соответствует переданному значению %s", feline.getKittens(kittensCount), kittensCount), kittensCount, feline.getKittens(kittensCount));
    }
}