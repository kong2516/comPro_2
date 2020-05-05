import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BasketTest {

    private Basket basket;

    @Before
    public void setup() {
        basket = new Basket(5);
    }

    @Test
    public void testInitalBasket() {
        assertEquals(0, basket.basketSize());
        assertEquals(5, basket.getCapacity());
    }
}