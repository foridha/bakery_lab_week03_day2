import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CupcakeTest {

    Cupcake cupcake;

    @BeforeEach
    void SetUp(){
        cupcake = new Cupcake("Strawberry Delight", "Strawberry", 2, 250, true);
    }

    @Test
    void canAddIcing(){
        assertThat(cupcake.addIcing()).isEqualTo("That will be an additional 50 pence");
    }

    @Test
    void canCheckHasSprinkles(){
        cupcake.setHasSprinkles(false);
        assertEquals(false, cupcake.getHasSprinkles());
    }
}
