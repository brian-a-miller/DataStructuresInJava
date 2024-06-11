package dev.brian;

/**
 * Hello world!
 *
 */
public class HelloWorld {

    public static void main( String[] args ) {

        System.out.println( "Hello World!" );
    }

    public static String getGreeting(String name) {
        if (name == null) {
            throw new IllegalArgumentException("null name not allowed!");
        }
        if (name.isBlank()) {
            throw new IllegalArgumentException("blank name not allowed!");
        }
        return ("Hello, " + name + "!");
    }
}
