package Observer;

//
public abstract class WeatherState {
    protected WeatherKinds weatherkinds;


  //현재 날씨
   
     public void WeatherDisplay(){
        weatherkinds.Weather();
    }
}
 