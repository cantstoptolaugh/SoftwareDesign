/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import ForLogin.LoginForm;


public class File_Command {
static File file=null;

static void createFile(String uId) {
       file = new File(uId+"'sUsedEnergy.txt");
}

static boolean write(String uId, int usedEnergy) {
    boolean res=false;
    
    createFile(uId);
     try {
            FileWriter fw = new FileWriter(file, false);
            if (file.isFile() && file.canWrite()) {
                 System.out.println("can use");
                  fw.write(usedEnergy+"");
                  fw.close();
                System.out.println("write complete!!");
               res= true;
            }
            else {
                System.out.println("can't use");
            }

        } catch (IOException e) {
            e.printStackTrace();
            
        }finally {
         return res;
     }
}
static String read(String uId) { 
        String result =null;
        createFile(uId);
        System.out.println("search Data : "+ file);
       
        try {
              if (file.isFile() && file.canWrite()) {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            result = br.readLine();
            if (result==null) {
                 System.out.println("null Data : "+ result);
                 result = "0";
            }
            else if (result!=null) {
                 System.out.println("exist Data : "+ result);
        }
            br.close();  }
              
        }//파일의 전체 줄 수(유저데이터 수)만큼 반복.
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
    return result;
    }
}
