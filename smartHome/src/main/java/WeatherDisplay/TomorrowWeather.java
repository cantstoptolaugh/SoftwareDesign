package WeatherDisplay;

import java.util.Random;

public class TomorrowWeather extends WeatherState {

    String Weather_type;

    Rain rain = new Rain();
    Snow snow = new Snow();
    Sunny sunny = new Sunny();
    Cloud cloud = new Cloud();

    public TomorrowWeather() {

    }

    @Override
    public String Weather(String weather) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
