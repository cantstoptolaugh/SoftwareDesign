package RealEnergyMeter;

public class UsageFee implements Observer, DisplayElement {

    private float expectFee1 = 31252;
    private float expectFee2 = 12312;
    private float expectFee3 = 55233;
    private float expectFee4 = 32332;
    private EnergyData energyData;

    public UsageFee(EnergyData energyData) {
        this.energyData = energyData;
        energyData.registerObserver(this);
    }

    public void update(float gas_energy, float elec_energy, float water_energy) {
        //당월,전월 예상 요금, 당월,전월 사용 전력량 계산 메소드 작성해야함.

        display();
    }

    public void display() {

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("전/당월 예상 요금 및 사용 전력량");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("당월 예상 요금은 : " + expectFee1 + " (원)입니다.");
        System.out.println("당월 사용 전력량은 : " + expectFee2 + " (kWh)입니다.");

        System.out.println("전월 예상 요금은 : " + expectFee3 + " (원)입니다.");
        System.out.println("당월 사용 전력량은 : " + expectFee4 + " (kWh)입니다.");

    }
}
