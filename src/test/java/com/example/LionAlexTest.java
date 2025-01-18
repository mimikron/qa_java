package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @InjectMocks
    private LionAlex lionAlex;

    @Test
    public void checkGetFriends() {
        assertEquals(String.format("Список друзей %s не соответсвует ожидаемому", lionAlex.getFriends()), List.of("Марти", "Глория", "Мелман"), lionAlex.getFriends());
    }

    @Test
    public void checkGetPlaceOfLiving() {
        assertEquals(String.format("Место жительства Алекса %s не соответсвует ожидаемому", lionAlex.getPlaceOfLiving()), "Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

    @Test
    public void checkGetKittens() {
        assertEquals("Количество котят Алекса не равно 0", 0, lionAlex.getKittens());
    }
}