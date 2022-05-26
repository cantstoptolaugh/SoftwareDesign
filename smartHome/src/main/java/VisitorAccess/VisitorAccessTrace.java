
package VisitorAccess;

import ForLogin.LoginForm;
import java.io.File;
import java.util.Scanner;
import VisitorAccess.Visitor;

public class VisitorAccessTrace {
    
    // VistiorHome 객체 생성
    VisitorHome vh = new VisitorHome();
    
    // 가족 타입 확인 위한 변수
    String member;
    
    // 로그인한 사용자 확인 변수 및 객체
    String id; 
    LoginForm loginForm;
    
    // 방문자 초기화
    Visitor visitor = null;
    
    // 객체 생성 시 SessionID를 가져옴
    public VisitorAccessTrace() {
        loginForm = new LoginForm();
        id = loginForm.SessionID;
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
        } else {
            visitor = new Outer();
        }
        
        // 방문자 리턴
        return visitor;
    }
    
}
