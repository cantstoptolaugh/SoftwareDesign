
package VisitorAccess;

import ForLogin.LoginForm;
import java.io.File;
import java.util.Scanner;

public class VisitorAccessTrace {
    
    // 가족 타입 확인 위한 변수
    String member;
    
    // 로그인한 사용자 확인 변수 및 객체
    String id; 
    LoginForm loginForm;
    
    // 파일 불러오기 위한 변수
    File user_info;
    
    // 방문자 초기화
    Visitor visitor = null;
    
    public VisitorAccessTrace() {
        loginForm = new LoginForm();
        id = loginForm.SessionID;
        
            try {
            user_info = new File("user_info.txt");
            
            Scanner scan = new Scanner(user_info);
           
            while (scan.hasNext()) {
                
                String str = scan.next();
                
                    
                    str = scan.next();
                    System.out.println(str);
                    
                    if(str.equals("아버지")) {
                      member = "아버지";  
                    } else if(str.equals("어머니")) {
                      member = "어머니";   
                    } else if(str.equals("자식1")) {
                      member = "자식1";  
                    } else if(str.equals("자식2")) {
                      member = "자식2";  
                    } else if(str.equals("외부인")) {
                      member = "외부인";    
                    }
                }
        } catch(Exception e) {
            e.printStackTrace();
        }      

    }
    
    // 방문자 추적 위한 메서드 traceVisitor
    public Visitor traceVisitor(String member) {
        // 누가 들어왔는지 확인(equals(방문자) -> 방문자 객체 생성)
        if(member.equals("자녀1")) {
            visitor = new Brother();
        } else if(member.equals("자녀2")) {
            visitor = new Sister();
        } else if(member.equals("아버지")) {
            visitor = new Father();
        } else if(member.equals("어머니")) {
            visitor = new Mother();
        } else if(member.equals("외부인"))  {
            visitor = new Outer();
        }
        
        // 방문자 리턴
        return visitor;
    }
    
}
