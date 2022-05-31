/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RealEnergyMeter;

import RealEnergyMeter.UsageFee;
import java.util.Random;
/**
 *
 * @author 이주혁
 */
public class RealEnergyMeter {

    public static void main(String[] args) {
        EnergyData energyData = new EnergyData();
        Random random = new Random();
        float value1 = (float)random.nextInt(5000, 10000);
        float value2 = (float)random.nextInt(5000, 10000);
        float value3 = (float)random.nextInt(5000, 10000);
        
        UsedEnergy usedEnergy = new UsedEnergy(energyData);
        UsageFee usageFee = new UsageFee(energyData);
        
        System.out.println("\n\n");
        energyData.setMeasurements(value1, value2, value3);
        System.out.println("\n\n");

    }
}
