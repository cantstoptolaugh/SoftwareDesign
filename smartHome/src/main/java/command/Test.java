package command;

public class Test {

    public static void main(String[] args) { 
        // TODO code application logic here
        RemoteControl remote = new RemoteControl();
        Command none = new NoCommand(); 
        
        // 0번 슬롯 : 거실 LED 등 전원 및 밝기 조절
        Led livingRoomLed = new Led("Living Room");
        LedOnCommand livingRoomLedOn = new LedOnCommand(livingRoomLed);
        LedOffCommand livingRoomLedOff = new LedOffCommand(livingRoomLed);

        remote.setOnOffCommand(0,  livingRoomLedOn, livingRoomLedOff);

        
        // 1번 슬롯 : 부엌 냉장고 전원 및 온도 조절
        Refrigerator kitchenRefrigerator = new Refrigerator("Kitchen");
        RefrigeratorOnCommand kitchenRefrigeratorOn = new RefrigeratorOnCommand(kitchenRefrigerator);
        RefrigeratorOffCommand kitchenRefrigeratorOff = new RefrigeratorOffCommand(kitchenRefrigerator);

        remote.setOnOffCommand(1, kitchenRefrigeratorOn, kitchenRefrigeratorOff);

        
        // 2번 슬롯 : 거실 난방 전원 및 온도 조절
        Heating livingRoomHeating = new Heating("Living Room");
        HeatingOnCommand  livingRoomHeatingOn = new HeatingOnCommand(livingRoomHeating);
        HeatingOffCommand  livingRoomHeatingOff = new HeatingOffCommand(livingRoomHeating);

        remote.setOnOffCommand(2, livingRoomHeatingOn, livingRoomHeatingOff);


       // 슬롯에 할당된 명령 출력
        System.out.println(remote);
        
        for(int i=0;i<3;i++) {
            remote.onButtonWasPushed(i);
            remote.offButtonWasPushed(i);
        }
    }
    
}
