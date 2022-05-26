package VisitorAccess;

public class VisitorAccess {
    VisitorAccessTrace vat;
    
    // VisitorAccess 생성자에서 VisitorAccessTrace 객체 생성
    public VisitorAccess(VisitorAccessTrace vat) {
        this.vat = vat;
    }
    
    // 방문자 확인하는 메서드인 addVisitor
    public Visitor checkVisitor(String member) {
                
        // Visitor 객체 null로 초기화
        Visitor visitor = null;
        
        // visitor에 대한 방문자 추적 위한 traceVisitor 메서드 실행
        visitor = vat.traceVisitor(member);
        
        // 방문한 방문자 반환
        return visitor;
    }
}
