/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RealEnergyMeter;

import ForLogin.LoginForm;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 이주혁
 */
public class File_task {

    LoginForm form = new LoginForm();
    String SessionID = form.SessionID;

    BufferedWriter bufferedWriter = null;
    Random random = new Random();

    public static String gas_num;
    public static String elec_num;
    public static String water_num;

    int gas;
    int elec;
    int water;

    int add_num1 = random.nextInt(10, 20);
    int add_num2; // :used_Energy
    int add_num3 = random.nextInt(10, 20);

    int yesterday = 2562;

    String str;

    String value1;
    String value2;

    //File Energy_use = new File(id + "'sUse.txt");
    public void read() {
        try {
            File Energy_use = new File(SessionID + "'sUse.txt");
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
        File Energy_use = new File(SessionID + "'sUse.txt");
    }

    public void write() {
        try {
            File Energy_use = new File(SessionID + "'sUse.txt");
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

    public void forAdd() {
        try {
            File Energy_use = new File(SessionID + "'sUsedEnergy.txt");
            Scanner scan = new Scanner(Energy_use);

            add_num2 = Integer.parseInt(scan.next());

            System.out.println(add_num2);
        } catch (FileNotFoundException ex) {
        }
    }

    public String Compare() {
        if (yesterday > (gas + elec + water)) {
            str = "전일 대비 사용량이 적습니다!. 에너지 절약 실천 중입니다!";
        } else if (yesterday < (gas + elec + water)) {
            str = "전일 대비 사용량이 많습니다.! 에너지를 절약해주세요!";
        }
        return str;
    }

    public String sum(String gas_num, String elec_num, String water_num) {
        gas = Integer.parseInt(gas_num);
        elec = Integer.parseInt(elec_num);
        water = Integer.parseInt(water_num);

        return Integer.toString(gas + elec + water);
    }

    public void Month() {

        try {
            File fi = new File(SessionID + "'sMonthEnergy.txt");
            Scanner scan = new Scanner(fi);
            this.value1 = scan.next(); //전월
            this.value2 = scan.next(); //당월 
        } catch (FileNotFoundException ex) {
        }
    }
}
