import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Starting Calculator Tests");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete");
    }

    @Test
    void testAdd() {
        assertEquals(4, calculator.add(2, 2));
        System.out.println("testAdd() passed");
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(2, 1));
        System.out.println("testSubtract() passed");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown complete\n");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("All tests finished successfully");
    }
}
