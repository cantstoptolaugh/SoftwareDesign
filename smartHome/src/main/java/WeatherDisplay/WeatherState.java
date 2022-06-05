package WeatherDisplay;

//
public abstract class WeatherState {

    protected WeatherKinds weatherkinds;

    public abstract String Weather(String weather);

    //현재 날씨
    public void WeatherDisplay() {
        weatherkinds.Weather();
    }
}
