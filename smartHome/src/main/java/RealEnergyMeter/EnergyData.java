/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RealEnergyMeter;

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
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float gas_energy, float elec_energy, float water_energy) {
        this.gas_energy = gas_energy;
        this.elec_energy = elec_energy;
        this.water_energy = water_energy;
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
