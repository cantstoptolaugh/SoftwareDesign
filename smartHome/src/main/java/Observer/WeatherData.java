package Observer;


import java.util.ArrayList;

public class WeatherData extends Subject {
  private ArrayList observers;
  private float temperature;
  private float humidity;
  
  public WeatherData(){
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
      if(idx>=0){
          observers.remove(idx);
      }
      //옵저버 탈퇴
  }

  public void notifyObservers() {
      for(int i = 0; i<observers.size();i++){
          Observer observer = (Observer)observers.get(i);
          observer.update(temperature, humidity);
            }
        }


  public void measurementChanged() {
      notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity) {
      this.temperature = temperature;
      this.humidity = humidity;
      measurementChanged();
  }
  
  public float getTemperature(){
      return temperature;
  }
  public float getHumidity(){
      return humidity;
  }

}
 
