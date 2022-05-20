
package VisitorAccess;

// 가족 클래스인 Family
public class Family extends Visitor {
    public Family() {
        super();
    }
    
    // ArrayList를 순회할때 사용되는 toString()
    public String toString() {
        return family + " " + timestamp;
    }
}
