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

    public UsageFee(EnergyData energyData) {
        this.energyData = energyData;
        energyData.registerObserver(this);
    }

    public void update(float gas_energy, float elec_energy, float water_energy) {
        //당월,전월 예상 요금, 당월,전월 사용 전력량 계산 메소드 작성해야함.
        this.gas_energy = gas_energy;
        this.elec_energy = elec_energy;
        this.water_energy = water_energy;
        this.sum = gas_energy + elec_energy + water_energy;
        
        display();
    }

    public void display() {

        this.expect_Fee = (float)((gas_energy+elec_energy+water_energy)*1.8);
        this.use_energy = (float)(sum*15);
        this.Before_Fee = (float)((gas_energy+elec_energy+water_energy)*1.4);
        this.Before_energy = (float)(sum*15-3000);
        
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("전/당월 예상 요금 및 사용 전력량");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("당월 예상 요금은 : " + expect_Fee + " (원)입니다.");
        System.out.println("당월 사용 전력량은 : " + use_energy + " (kWh)입니다.");

        System.out.println("전월 요금은 : " + Before_Fee + " (원)입니다.");
        System.out.println("전월 사용 전력량은 : " + Before_energy + " (kWh)입니다.");

    }
}
