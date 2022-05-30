package Observer;

public class Cloud implements WeatherKinds {

    String weather_type;

    public void Cloud() {
    }

    public String Weather(String Weather) {

        this.weather_type = Weather;

        return this.weather_type;
    }

    @Override
    public String Weather() {

        return null;

    }

}
