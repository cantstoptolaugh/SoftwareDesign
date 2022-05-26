/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test_LeeJoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 이주혁
 */
public class JooHyeok {

    static String gas_num;
    static int gas;
    static String elec_num;
    static int elec;
    static String water_num;
    static int water;

    static int add_num1;
    static int add_num2;
    static int add_num3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        add_num1 = 20;
        add_num2 = 30;
        add_num3 = 15;

        BufferedWriter bufferedWriter1 = null;
        try {
            String id = "joohyeok";
            //String num4 = num1.replace("500", "520");

            File Energy_use = new File(id + "'sUse.txt");
            bufferedWriter1 = new BufferedWriter(new FileWriter(Energy_use, true));
            Scanner scan = new Scanner(Energy_use);

            gas_num = scan.next();
            elec_num = scan.next();
            water_num = scan.next();

            //정수로 변환
            gas = Integer.parseInt(gas_num);
            elec = Integer.parseInt(elec_num);
            water = Integer.parseInt(water_num);

            //문자열로 변환
            gas_num = Integer.toString(gas + add_num1);
            elec_num = Integer.toString(elec + add_num2);
            water_num = Integer.toString(water + add_num3);

            System.out.println(gas_num);
            System.out.println(elec_num);
            System.out.println(water_num);
/*
            if (Energy_use.isFile() && Energy_use.canWrite()) {
                bufferedWriter1.write(gas);
                bufferedWriter1.write(" ");
                bufferedWriter1.write(value2);
                bufferedWriter1.write(" ");
                bufferedWriter1.write(value3);
                bufferedWriter1.newLine();
                bufferedWriter1.close();
            }*/

        } catch (IOException ex) {
        }

    }

}
