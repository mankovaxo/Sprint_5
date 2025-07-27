package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CatTest {

    @Test
    void getSound() {
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void getFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы"));

        Cat cat = new Cat(feline);
        assertEquals(List.of("Животные", "Птицы"), cat.getFood());
    }
}