package org.example;

import java.util.List;

public class Feline {
    public List<String> getFood(String animalType) throws Exception {
        if ("Хищник".equals(animalType)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else if ("Травоядное".equals(animalType)) {
            return List.of("Трава", "Различные растения");
        }
        throw new Exception("Неизвестный тип животного");
    }

    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return 1;
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }
}
