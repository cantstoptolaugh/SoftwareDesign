
package VisitorAccess;

public class VisitorAccessTrace {
 
    // 가족 타입 확인 위한 변수
    String member;
    
    // 방문자 초기화
    Visitor visitor = null;
    
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
    
}
