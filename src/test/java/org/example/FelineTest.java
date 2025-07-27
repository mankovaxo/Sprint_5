package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FelineTest {
    private final Feline feline = new Feline();

    @Test
    void getFoodForPredator() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }

    @Test
    void getFoodForHerbivore() throws Exception {
        assertEquals(List.of("Трава", "Различные растения"), feline.getFood("Травоядное"));
    }

    @Test
    void getFoodThrowsException() {
        assertThrows(Exception.class, () -> feline.getFood("Неизвестный"));
    }

    @Test
    void getFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void getKittens() {
        assertEquals(1, feline.getKittens());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 5})
    void getKittensWithCount(int count) {
        assertEquals(count, feline.getKittens(count));
    }
}