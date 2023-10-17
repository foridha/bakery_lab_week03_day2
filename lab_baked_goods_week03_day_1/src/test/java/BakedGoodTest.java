import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BakedGoodTest {

    BakedGood bakedGoodTest;

    @BeforeEach
    void setUp() {

        bakedGoodTest = new BakedGood("Oreo Mania", "Chocolate", 2, 400);
    }

    @Test
    void canSetName(){

        bakedGoodTest.setName("Dairy Delight");

        assertEquals("Dairy Delight", bakedGoodTest.getName());
    }

}
