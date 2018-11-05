import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {
    @Test
    public void testFunctionReturns() {
        Greeter greeter = new Greeter();
        assertEquals(greeter.sayHello(), "Hello world!");
    }
}

