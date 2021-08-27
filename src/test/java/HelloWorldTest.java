import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        String actualResult = helloWorld.greeting("World");
        assertEquals("Hello World", actualResult);
    }
}
