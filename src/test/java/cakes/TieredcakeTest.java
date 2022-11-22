package cakes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TieredcakeTest {

    private TieredCake tieredCake;

    @BeforeEach
    public void setUp() {
        tieredCake = new TieredCake("Graduation Cake", "Red Velvet", false, 2);
    }

    @Test
    public void getName() {
        String expected = "Graduation Cake";
        String actual = tieredCake.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void areIngredientsMixed() {
        String expected = "Ingredients are not yet mixed";
        String actual = tieredCake.mixIngredients();
        assertEquals(expected, actual);
    }
}
