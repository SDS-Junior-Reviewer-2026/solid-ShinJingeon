package greeter;

public class GreeterStringFactory {

    public GreeterStringFactory() {}

    public GreeterString getGreeterString(String formality) {
        GreeterString greeterString;

        if (formality.equals("formal")) {
             greeterString = new FormalGreeterString();
        } else if (formality.equals("casual")) {
            greeterString = new CasualGreeterString();
        } else if (formality.equals("intimate")) {
            greeterString = new IntimateGreetingString();
        } else {
            greeterString = new HelloGreeterString();
        }

        return greeterString;
    }
}
