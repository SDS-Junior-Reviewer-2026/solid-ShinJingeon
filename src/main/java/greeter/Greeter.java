package greeter;

public class Greeter {

    GreeterStringFactory factory = new GreeterStringFactory();
    String formality;

    public Greeter() {}

    public String greet() {
        if (formality == null) { formality = ""; }
        return factory.getGreeterString(formality).getString();
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}