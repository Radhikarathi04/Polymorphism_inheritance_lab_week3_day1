package cakes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CupcakeTest {

    private Cupcake cupcake;

    @BeforeEach
    public void setUp() {
        cupcake = new Cupcake("Christmas cupcakes", "Chocolate", false, "Fondant");
    }

    @Test
    public void getName() {
        String expected = "Christmas cupcakes";
        String actual = cupcake.getName();
        assertEquals(expected, actual);
    }
}
