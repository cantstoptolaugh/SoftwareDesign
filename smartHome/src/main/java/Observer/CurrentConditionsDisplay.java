package Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
// 현재 온도, 습도 나타냄
  private float temperature;
  private float humidity;
  private Subject weatherData;//weatherData의 interface subject가 제어
  
  public CurrentConditionsDisplay(Subject weatherData){
      //생성자에 weatherData 주제객체 전달, 객체를 써 디스플레이를 옵저버로 등록 
      this.weatherData = weatherData;
      weatherData.registerObserver(this);
  }

  @Override
  public void update(float temperature, float humidity) {
      this.temperature = temperature;
      this.humidity = humidity;
      // 온도, 습도
      display();
  }

  @Override
  public void display() {
      System.out.println("current:" + temperature + "degree," + " current:" + humidity + "%humidity");
      
  }
}