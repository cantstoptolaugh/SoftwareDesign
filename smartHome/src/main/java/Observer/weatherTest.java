package Observer;


public class weatherTest{

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        //날씨 데이터 객체 생성
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        // 현재 값 보여주는 클래스 currenCinditionsDisplay 객체 생성
        
        WeatherState TodayWeatherstate = new TodayWeather();
        WeatherState TomorrowWeatherState = new TomorrowWeather();
        
        weatherData.setMeasurements(20,40);
        TodayWeatherstate.WeatherDisplay();
        TomorrowWeatherState.WeatherDisplay();
        
        //날씨 출력
        
        //온도랑 날씨 맞게 출력 if문
        //로그아웃 할 때 온도 날씨 유지 ,
        //새로 로그인하면 날씨 업데이트
   
    }  
    
}
