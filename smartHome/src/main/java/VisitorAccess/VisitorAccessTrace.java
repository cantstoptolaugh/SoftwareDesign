
package VisitorAccess;

import SmartHome.LoginForm;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VisitorAccessTrace {

    // 방문자 초기화
    Visitor visitor = null;
    // 가족 확인 위한 family 배열
    String[] family;  
    // 로그인 파일 읽기 위한 File 객체
    File user_info;
    // 세션 id 읽기 위한 변수 id
    String id = LoginForm.SessionID;
    
    // 방문자 추적 위한 메서드 traceVisitor
    public Visitor traceVisitor(String member) {
        
        // 누가 들어왔는지 확인(equals(방문자) -> 방문자 객체 생성)
        switch (member) {
            case "자녀1":
                visitor = new Brother();
                break;
            case "자녀2":
                visitor = new Sister();
                break;
            case "아버지":
                visitor = new Father();
                break;
            case "어머니":
                visitor = new Mother();
                break;
            default:
                visitor = new Outer();
                break;
        }
        // 방문자 리턴
        return visitor;
    }
    
    // 로그인 파일에서 가족 구성원들을 배열 형태로 리턴
    public String[] familyList() {
        
      try { 
            // 로그인 객체 생성 및 sessionID 설정
            LoginForm log = new LoginForm(); 
            
            // 가족은 4개의 배열
            family = new String[4];
            
            // 세션 id의 로그인 파일 생성
            user_info = new File(id+".txt");
            
            // 로그인 파일 scan
            Scanner scan = new Scanner(user_info);
            
            // 스캔 한 파일 하나씩 읽으며 가족 구성원 이름에 따라 배열에 추가
            while (scan.hasNext()) {
                String str = scan.next();
                if (str.equals(id)) {
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
                    family[3] = "자녀2";
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OpenDoor.class.getName()).log(Level.SEVERE, null, ex);
        }
      // family 배열 리턴
      return family;
    }
    
}
