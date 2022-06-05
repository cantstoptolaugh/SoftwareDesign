package WeatherDisplay;

public class TodayWeather extends WeatherState {

    String Weather_type;

    public TodayWeather() {

        Rain rain = new Rain();
        Snow snow = new Snow();
        Sunny sunny = new Sunny();
        Cloud cloud = new Cloud();

        //Weather_type = rain.Weather("rainy day");
    }

    @Override
    public String Weather(String weather) {
        return null;
    }
}
