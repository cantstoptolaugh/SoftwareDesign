/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RealEnergyMeter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 이주혁
 */
public class Calculator {

    BufferedWriter bufferedWriter = null;

    static String gas_num;
    static String elec_num;
    static String water_num;

    int gas;
    int elec;
    int water;

    int add_num1 = 15; //랜덤 메소드
    int add_num2 = 10; //채은이로부터 받는 정수 :used_Energy
    int add_num3 = 20; //랜덤 메소드

    String id = "joohyeok"; //LoginForm의 id 변수

    //File Energy_use = new File(id + "'sUse.txt");
    public void read() {
        try {
            File Energy_use = new File(id + "'sUse.txt");
            Scanner scan = new Scanner(Energy_use);

            this.gas_num = scan.next();
            this.elec_num = scan.next();
            this.water_num = scan.next();
        } catch (IOException ex) {
        }
    }

    public void calculate() {
        //정수로 변환
        gas = Integer.parseInt(this.gas_num);
        elec = Integer.parseInt(this.elec_num);
        water = Integer.parseInt(this.water_num);

        //문자열로 변환
        this.gas_num = Integer.toString(gas + add_num1);
        this.elec_num = Integer.toString(elec + add_num2);
        this.water_num = Integer.toString(water + add_num3);
    }

    public void delete() {
        File Energy_use = new File(id + "'sUse.txt");
    }

    public void write() {
        try {
            File Energy_use = new File(id + "'sUse.txt");
            bufferedWriter = new BufferedWriter(new FileWriter(Energy_use));
            
            if (Energy_use.isFile() && Energy_use.canWrite()) {
                bufferedWriter.write(this.gas_num);
                bufferedWriter.write(" ");
                bufferedWriter.write(this.elec_num);
                bufferedWriter.write(" ");
                bufferedWriter.write(this.water_num);
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
        } catch (IOException ex) {
        }
    }

    public String sum(String gas_num, String elec_num, String water_num)
    {
        gas = Integer.parseInt(gas_num);
        elec = Integer.parseInt(elec_num);
        water = Integer.parseInt(water_num);
        
        return Integer.toString(gas + elec + water);
    }
}
