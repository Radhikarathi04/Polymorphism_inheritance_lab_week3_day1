package bakeries;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BakeryTest {

    private Bakery bakery;

    @BeforeEach
    public void setUp() {
        bakery = new Bakery("Feya");
    }

    @Test
    public void getName() {
        String expected = "Feya";
        String actual = bakery.getName();
        assertEquals(expected, actual);
    }
}
