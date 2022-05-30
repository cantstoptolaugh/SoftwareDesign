package Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
// 현재 온도, 습도 나타냄

    private String temperature;
    private String humidity;
    private String weatherdata;
    private Subject weatherData;//weatherData의 interface subject가 제어

    public CurrentConditionsDisplay(Subject weatherData) {
        //생성자에 weatherData 주제객체 전달, 객체를 써 디스플레이를 옵저버로 등록 
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(String temperature, String humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        // 온도, 습도
        display(temperature);
        display(humidity);

    }

    @Override
    public String display(String weatherdata) {
        this.weatherdata = weatherdata;
        return weatherdata;
    }

}
