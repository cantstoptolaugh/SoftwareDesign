package RealEnergyMeter;

import RealEnergyMeter.Observer;

public class UsageFee implements Observer, DisplayElement {

    private static float gas_energy;
    private static float elec_energy;
    private static float water_energy;
    private static float sum;
    static float expect_Fee;
    static float use_energy;
    static float Before_Fee;
    static float Before_energy;
    
    private EnergyData energyData;

    public UsageFee(EnergyData energyData) {//객체 등록을 위한 메소드
        this.energyData = energyData;
        energyData.registerObserver(this);
    }

    public void update(float gas_energy, float elec_energy, float water_energy) {
        this.gas_energy = gas_energy;
        this.elec_energy = elec_energy;
        this.water_energy = water_energy;
        this.sum = gas_energy + elec_energy + water_energy;
        //가스, 전기, 수도 에너지 사용량을 불러온 뒤, 예상 요금과 사용 에너지량(이번달)을 계산 
        this.expect_Fee = (float)((gas_energy+elec_energy+water_energy)*15.9);
        this.use_energy = (float)(sum*15);
        //저번 달 에너지 총 사용량과 요금 Default 값
        this.Before_Fee = 56870;
        this.Before_energy = 49820;
        
        display();
    }

    public void display() {
        
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("전/당월 예상 요금 및 사용 전력량");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("당월 예상 요금은 : " + expect_Fee + " (원)입니다.");
        System.out.println("당월 사용 전력량은 : " + use_energy + " (kWh)입니다.");

        System.out.println("전월 요금은 : " + Before_Fee + " (원)입니다.");
        System.out.println("전월 사용 전력량은 : " + Before_energy + " (kWh)입니다.");

    }
}
