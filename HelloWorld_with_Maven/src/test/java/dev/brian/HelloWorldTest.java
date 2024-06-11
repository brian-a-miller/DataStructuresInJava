package dev.brian;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HelloWorldTest {

    @Test
    public void testGetGreetingValidName() {
 
        String greeting = HelloWorld.getGreeting("Brian");
        System.out.println("Result: " + greeting);

        Assert.assertEquals("Unexpected greeting returned",
                "Hello, Brian!",
                greeting);
    }

    @Test
    public void testOfCISystemWithFailingTest() {

        Assert.fail("Example of a failing test");
    }
}
