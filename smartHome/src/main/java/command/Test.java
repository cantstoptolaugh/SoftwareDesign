package command;

public class Test {

    public static void main(String[] args) {
        // TODO code application logic here
        RemoteControl remote = new RemoteControl();
        Command none = new NoCommand(); 
        
        Led livingRoomLed = new Led("Living Room");
        LedOnCommand livingRoomLedOn = new LedOnCommand(livingRoomLed);
        LedOffCommand livingRoomLedOff = new LedOffCommand(livingRoomLed);
        remote.setCommand(0,  livingRoomLedOn, livingRoomLedOff, none, none);
        
        Refrigerator kitchenRefrigerator = new Refrigerator("Kitchen");
        RefrigeratorUpCommand kitchenRefrigeratorUp = new RefrigeratorUpCommand(kitchenRefrigerator);
        RefrigeratorDownCommand kitchenRefrigeratorDown = new RefrigeratorDownCommand(kitchenRefrigerator);
        remote.setCommand(1, none, none, kitchenRefrigeratorUp, kitchenRefrigeratorDown);
        
        Heating livingRoomHeating = new Heating("Living Room");
        HeatingOnCommand  livingRoomHeatingOn = new HeatingOnCommand(livingRoomHeating);
        HeatingOffCommand  livingRoomHeatingOff = new HeatingOffCommand(livingRoomHeating);
        remote.setCommand(2, livingRoomHeatingOn, livingRoomHeatingOff, none, none);
        
        System.out.println(remote);
        
        for(int i=0;i<3;i++) {
            remote.onButtonWasPushed(i);
            remote.offButtonWasPushed(i);
            remote.upButtonWasPushed(i);
            remote.downButtonWasPushed(i);
        }
    }
    
}
