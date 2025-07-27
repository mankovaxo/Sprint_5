package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class LionTest {

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    void doesHaveMane(boolean hasMane) {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(feline, hasMane);
        assertEquals(hasMane, lion.doesHaveMane());
    }

    @Test
    void getFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные"));

        Lion lion = new Lion(feline, true);
        assertEquals(List.of("Животные"), lion.getFood());
    }
}