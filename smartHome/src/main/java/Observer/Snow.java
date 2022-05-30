package Observer;

public class Snow implements WeatherKinds {

    String weather_type;

    public void Snow() {
    }

    public String Weather(String Weather) {

        this.weather_type = Weather;

        return this.weather_type;
    }

    @Override
    public String Weather() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
