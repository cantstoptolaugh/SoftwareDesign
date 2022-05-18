/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RealTimeEnergyMeter;

/**
 *
 * @author 이주혁
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay
                = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        System.out.println("\n\n");
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("\n\n");

        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("\n\n");

        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("\n\n");

        weatherData.removeObserver(forecastDisplay);
        System.out.println("\n\n");

        weatherData.setMeasurements(62, 90, 28.1f);
        System.out.println("\n\n");

    }
}
