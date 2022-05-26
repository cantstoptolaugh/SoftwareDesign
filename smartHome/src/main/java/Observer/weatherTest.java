package Observer;


public class weatherTest{

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        //날씨 데이터 객체 생성
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        // 현재 값 보여주는 클래스 currenCinditionsDisplay 객체 생성
        
        weatherData.setMeasurements(20,40);
        weatherData.setMeasurements(25,50);
        weatherData.setMeasurements(30,60);
        //현재 온도, 습도
        
        WeatherState YesterdayWeatherstate = new YesterdayWeather ();
        WeatherState TodayWeatherstate = new TodayWeather();
        WeatherState TomorrowWeatherState = new TomorrowWeather();
        
        YesterdayWeatherstate.WeatherDisplay();
        TodayWeatherstate.WeatherDisplay();
        TomorrowWeatherState.WeatherDisplay();
        
        //날씨 출력
        
       
   
    }  
    
}
