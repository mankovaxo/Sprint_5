package org.example;

import java.util.List;

public class Lion {
    private final Feline feline;
    private final boolean hasMane;

    public Lion(Feline feline, boolean hasMane) {
        this.feline = feline;
        this.hasMane = hasMane;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
