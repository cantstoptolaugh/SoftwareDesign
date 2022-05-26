
package Observer;

public class Cloud implements WeatherKinds {
    public void Cloud(){
    }
    
    @Override
    public void Weather(){
        System.out.println("It's cloudy day");
    }

    public void weather() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}