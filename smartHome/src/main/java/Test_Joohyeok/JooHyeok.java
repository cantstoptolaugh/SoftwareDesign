/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test_Joohyeok;

import java.io.File;
import ForLogin.LoginForm;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 이주혁
 */
public class JooHyeok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
/*
            LoginForm log = new LoginForm();
            String SessionID = log.SessionID;
             */

            String SessionID = "joohyeok";
            String[] family = new String[4];

            File user_info = new File(SessionID + ".txt");

            Scanner scan = new Scanner(user_info);

            while (scan.hasNext()) {
                String str = scan.next();
                if (str.equals(SessionID)) {
                    System.out.println(SessionID + "님의 가족 구성원은 다음과 같습니다.");
                }
                if (str.equals("아버지")) {
                    family[0] = "아버지";
                }
                if (str.equals("어머니")) {
                    family[1] = "어머니";
                }
                if (str.equals("자녀1")) {
                    family[2] = "자녀1";
                }
                if (str.equals("자녀2")) {
                    family[30] = "자녀2";
                }
            }

            for (int i = 0; i < 4; i++) {
                System.out.println(family[i]);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(JooHyeok.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
