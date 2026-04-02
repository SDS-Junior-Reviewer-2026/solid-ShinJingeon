package weather;

public class NotifierFactory {

    public NotifierFactory() {}

    public Notifier create(String weatherDescription) {
        if (weatherDescription.equals("rainy")) {
            return new Phone();
        } else {
            return new Email();
        }
    }
}
