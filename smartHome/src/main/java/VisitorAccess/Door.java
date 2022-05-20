
package VisitorAccess;


public class Door {
    
    // 생성자의 매개변수로 Visitor 객체를 받음
    
    public Door(Visitor v) {
        
        // instanceof를 통해 Family임을 확인
        
        if(v instanceof Family) {
            
            // 만약 true라면 해당 문장들이 실행
            
            System.out.println("문이 열립니다.");
            System.out.println("----------- " + v.getFamily() + " 님이 방문하셨습니다. -----------");
            System.out.println("문이 닫힙니다.");
            System.out.println("");
            
        } else if(v instanceof Outer) {
            
            // 만약 Outer 객체일 경우 해당 문장이 실행
            
            System.out.println("외부인임을 감지하였습니다. 문을 닫습니다.");
            System.out.println("");
        }
    }
}
