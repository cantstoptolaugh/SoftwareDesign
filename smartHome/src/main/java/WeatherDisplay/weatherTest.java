package WeatherDisplay;

import java.util.Random;

public class weatherTest {

    public static void main(String[] args) {

        Rain rain = new Rain();
        Snow snow = new Snow();
        Sunny sunny = new Sunny();
        Cloud cloud = new Cloud();

        String todayweather;
        String tomorrowweather;

        Random random = new Random();

        int temperatureR = 27;//random.nextInt(0, 30);
        int humidityR = 40;//random.nextInt(40, 60);

        String temperatureS;
        String humidityS;
        //문자열 변환

        String todayTemperature;
        //출력할 온도
        String todayHumidity;

        WeatherData weatherData = new WeatherData();

        //날씨 데이터 객체 생성
        String todayWeather = null;
        String tomorrowWeather = null;

        todayWeather = sunny.Weather("It's sunny today");
        tomorrowWeather = sunny.Weather("It's sunny tomorrow");

        temperatureS = Integer.toString(temperatureR);
        humidityS = Integer.toString(humidityR);

        todayTemperature = weatherData.setMeasurements(temperatureS);
        todayHumidity = weatherData.setMeasurements(humidityS);

        System.out.println(temperatureS);
        System.out.println(humidityS);
        System.out.println(todayWeather);
        System.out.println(tomorrowWeather);

    }

}
