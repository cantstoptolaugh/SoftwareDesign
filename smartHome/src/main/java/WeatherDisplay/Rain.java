package WeatherDisplay;

public class Rain implements WeatherKinds {

    String weather_type;

    public void Rain() {
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
