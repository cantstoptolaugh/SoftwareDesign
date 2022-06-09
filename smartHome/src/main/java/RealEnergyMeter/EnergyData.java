/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RealEnergyMeter;

import RealEnergyMeter.Observer;
import RealEnergyMeter.Subject;
import java.util.*;

/**
 *
 * @author 이주혁
 */
public class EnergyData implements Subject {

    private List<Observer> observers;
    private float gas_energy;
    private float elec_energy;
    private float water_energy;

    public EnergyData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(gas_energy, elec_energy, water_energy);
        }//옵저버 객체s 알림 송신
    }

    public void measurementsChanged() {
        notifyObservers(); //변화된 사항 => 옵저버 객체s 알림 송신
    }

    public void setMeasurements(float gas_energy, float elec_energy, float water_energy) {
        this.gas_energy = gas_energy; //가스 사용량
        this.elec_energy = elec_energy; //전기 사용량
        this.water_energy = water_energy; //수도 사용량
        measurementsChanged();
    }

    public float getGas_energy() {
        return gas_energy;
    }

    public float getElec_energy() {
        return elec_energy;
    }

    public float getWater_energy() {
        return water_energy;
    }

}
