import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CookieTest {

    Cookie cookieTest;

    @BeforeEach
    void setUp(){

        cookieTest = new Cookie("Oreo Mania", "Chocolate", 2, 400, true);
    }

    @Test
    void canReduceSugar(){

        assertThat(cookieTest.reduceSugar()).isEqualTo("This cupcake is healthy");
    }

// Assert that the Cookie object called cookieTest when reducedSugar the output is "This cupcake is healthy".

    void canSetHealthy(){

            cookieTest.setHealthy(false);

            assertEquals(false, cookieTest.getHealthyStatus());

    }
}
