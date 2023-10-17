import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TieredCakeTest {

    TieredCake tieredCake;

    @BeforeEach
    void setUp() {
        tieredCake = new TieredCake("Chocolate Delight", "Chocolate", 35, 2_000, 2);
    }

    @Test
    void canAddTier() {

        assertThat(tieredCake.addTier(2)).isEqualTo(4);
    }

    @Test
    void canSetTieredCake(){

        tieredCake.setNumberOfTiers(2);

        assertEquals(2, tieredCake.getNumberOfTiers());
    }



}
