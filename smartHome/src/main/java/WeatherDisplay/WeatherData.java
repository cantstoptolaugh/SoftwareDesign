package WeatherDisplay;

import java.util.ArrayList;

public class WeatherData extends Subject {

    private ArrayList observers;
    private String temperature;
    private String humidity;
    private String weatherData;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        //옵저버 등록
    }

    @Override
    public void removeObserver(Observer o) {
        int idx = observers.indexOf(o);
        if (idx >= 0) {
            observers.remove(idx);
        }
        //옵저버 탈퇴
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public String setMeasurements(String weatherData) {

        this.weatherData = weatherData;
        measurementChanged();
        return weatherData;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }

}
