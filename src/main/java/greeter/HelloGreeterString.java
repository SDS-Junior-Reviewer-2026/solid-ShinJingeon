package greeter;

public class HelloGreeterString implements GreeterString{
    private final String greeting;

    public HelloGreeterString() {
        this.greeting = "Hello.";
    }

    @Override
    public String getString() {
        return this.greeting;
    }
}
