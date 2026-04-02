package greeter;

public class FormalGreeterString implements GreeterString{

    private final String greeting;

    public FormalGreeterString() {
        this.greeting = "Good evening, sir.";
    }

    @Override
    public String getString() {
        return this.greeting;
    }
}
