
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreeterTest {
    @Test
    public void testFunctionReturns() {
        Greeter greeter = new Greeter();
        assertEquals(greeter.sayHello(), "Hello world!");
    }
}

