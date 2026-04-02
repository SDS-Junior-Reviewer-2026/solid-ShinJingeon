package weather;

public class WeatherTracker {
    String currentConditions;

    NotifierFactory notifierFactory = new NotifierFactory();

    public WeatherTracker() {}

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;

        String alert = notifierFactory.create(weatherDescription).generateWeatherAlert(weatherDescription);
        System.out.print(alert);
    }
}