package coinpurse;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Testing
 */
public class UnitTesting {

    @Before
    public void setUp() {
        // create test fixture
        // do before every tests
    }

    @After
    public void tearDown() {
        // (close/del) all obj -> null
        // do after every tests
    }

    @Test(timeout = 100)
    public void test() {

    }

    @Test
    public void testAddition() {
        // expected, actual
        Assert.assertEquals(2, 1 + 1);
    }

    @Test
    public void testSqrt() {
        // expected, actual, delta
        Assert.assertEquals(5.0, Math.sqrt(25), 1.0E-12);
    }

    @Test
    public void testPi() {
        Assert.assertTrue(Math.PI < 3.15);
    }

}