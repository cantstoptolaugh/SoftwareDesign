
package VisitorAccess;


// 외부인 클래스 Outer
public class Outer extends Visitor {
    
    // 생성자에서 상속을 통해 얻은 outer 변수를 설정
    public Outer() {
        outer = "외부인";
    }
    
    // ArrayList를 순회할 때 사용하기 위한 toString()
    public String toString() {
        return outer + " " + timestamp;
    }
}
