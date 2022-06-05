/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fee_Bill;

import SmartHome.LoginForm;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 이주혁
 */
public class forGetFile {

    public static String gas_num;
    public static String elec_num;
    public static String water_num;

    LoginForm log = new LoginForm();
    String SessionID = log.SessionID;
    
    public void get() {
        try {
            File Energy_use = new File(SessionID + "'sUse.txt");
            Scanner scan = new Scanner(Energy_use);

            gas_num = scan.next();
            elec_num = scan.next();
            water_num = scan.next();
        } catch (IOException ex) {
        }
    }
}
