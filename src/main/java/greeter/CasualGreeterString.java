package greeter;

public class CasualGreeterString implements GreeterString {

    private final String greeting;

    public CasualGreeterString() {
        this.greeting = "Sup bro?";
    }

    @Override
    public String getString() {
        return this.greeting;
    }
}
