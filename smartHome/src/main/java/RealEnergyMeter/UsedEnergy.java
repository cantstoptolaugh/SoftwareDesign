package RealEnergyMeter;

import RealEnergyMeter.Observer;

public class UsedEnergy implements Observer, DisplayElement {

    private float gas_energy;
    private float elec_energy;
    private float water_energy;
    private float sum;
    //전일대비 사용량 차이를 위한 테스트 변수 (임의의 값)
    private float testValue = 18000;
    private EnergyData energyData;
    //날짜별 총 에너지 사용량 저장 (한 달 기준 31 일)
    // int[] sum1 = new int[31];

    public UsedEnergy(EnergyData energyData) {
        this.energyData = energyData;
        energyData.registerObserver(this); //객체 등록을 위한 메소드
    }

    public void update(float gas_energy, float elec_energy, float water_energy) {
        this.gas_energy = gas_energy; //가스 에너지 사용량
        this.elec_energy = elec_energy; //전기 에너지 사용량
        this.water_energy = water_energy; //수도 에너지 사용량
        this.sum = gas_energy + elec_energy + water_energy; //에너지 총 사용량
        display();

    }

    public void display() { //테스트 코드 출력용 display()
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("현재 에너지 사용량 (기준 : 24 h )");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("가스 사용량: " + gas_energy + " kWh"
                + "\n전기 사용량: " + elec_energy + " kWh"
                + "\n수도 사용량: " + water_energy + " kWh"
                + "\n총 에너지 사용량: " + sum + " kWh"
                + "\n전일대비 사용량 차이: " + (sum - testValue) + " kWh\n");
        if (sum > (testValue - sum)) {
            System.out.println("전일대비 에너지 사용량이 많습니다.");
            System.out.println("에너지 절약을 위해 신경써주세요!\n");
        } else if (sum < (testValue - sum)) {
            System.out.println("전일대비 에너지 사용량이 적습니다.");
            System.out.println("에너지 절약을 위해 신경쓰시는군요!\n");
        }
    }
}
