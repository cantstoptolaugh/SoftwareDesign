/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VisitorAccess;

/**
 *
 * @author sonjin-yeong
 */
public class VisitorAccessTrace {
    
    // 방문자 추적 위한 메서드 traceVisitor
    public Visitor traceVisitor(String family) {
        
        // 방문자 초기화
        Visitor visitor = null;
        
        // 누가 들어왔는지 확인(equals(방문자) -> 방문자 객체 생성)
        if(family.equals("brother")) {
            visitor = new Brother();
        } else if(family.equals("sister")) {
            visitor = new Sister();
        } else if(family.equals("father")) {
            visitor = new Father();
        } else if(family.equals("mother")) {
            visitor = new Mother();
        }
        
        // 방문자 리턴
        return visitor;
    }
}
