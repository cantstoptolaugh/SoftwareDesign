/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI_Design;

import java.io.*;
import java.util.*;

/**
 *
 * @author 이주혁
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String readPath = "C:\\Users\\이주혁\\Documents\\NetBeansProjects\\SoftwareDesign\\smartHome\\src\\main\\java\\GUI_Design\\user.txt";
            String writePath = "C:\\Users\\이주혁\\Documents\\NetBeansProjects\\SoftwareDesign\\smartHome\\src\\main\\java\\GUI_Design\\user.txt";

            File read_file = new File(readPath);
            File write_file = new File(writePath);
            
            Scanner scan = new Scanner(read_file);
            
            String info = scan.nextLine();
            
            while(scan.hasNextLine())
            {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
        }
    }

}
