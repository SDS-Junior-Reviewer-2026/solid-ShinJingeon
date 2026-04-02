package greeter;

public class IntimateGreetingString implements GreeterString {

    private final String greeting;

    public IntimateGreetingString() {
        this.greeting = "Hello Darling!";
    }

    @Override
    public String getString() {
        return this.greeting;
    }
}
