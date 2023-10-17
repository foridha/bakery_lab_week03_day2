import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.setRemoveAssertJRelatedElementsFromStackTrace;

public class BakeryTest {

    Cupcake cupcake;
    Bakery bakery;

    @BeforeEach
    void setUp() {

        cupcake = new Cupcake("Oreo Mania", "Chocolate", 2, 400, true);
        bakery = new Bakery();
        bakery.addToStock(cupcake); // add the cupcake to the stock
    }

    @Test
    void canRemoveFromStock(){
        bakery.removeFromStock(cupcake);
        assertThat(bakery.countBakedGood()).isEqualTo(0);
    }

    @Test
    void canAddToStock(){
        bakery.addToStock(cupcake);
        assertThat(bakery.countBakedGood()).isEqualTo(2);
    }

    @Test
    void canCountBakedGood(){
        assertThat(bakery.countBakedGood()).isEqualTo(1);
    }
}



