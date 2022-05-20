
package VisitorAccess;

public class VisitorAccessTrace {
    
    // 방문자 추적 위한 메서드 traceVisitor
    public Visitor traceVisitor(String member) {
        
        // 방문자 초기화
        Visitor visitor = null;
        
        // 누가 들어왔는지 확인(equals(방문자) -> 방문자 객체 생성)
        if(member.equals("brother")) {
            visitor = new Brother();
        } else if(member.equals("sister")) {
            visitor = new Sister();
        } else if(member.equals("father")) {
            visitor = new Father();
        } else if(member.equals("mother")) {
            visitor = new Mother();
        } else if(member.equals("outer")) {
            visitor = new Outer();
        }
        
        // 방문자 리턴
        return visitor;
    }
}
