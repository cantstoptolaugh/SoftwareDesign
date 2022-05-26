
package VisitorAccess;

// Timestamp를 위해 import
 public class Visitor {
    // 외부인과 가족 Member 변수
    String outer;
    String family;
    

    // Door에서 활용하기 위한 메서드 getFamily
    public String getFamily() {
        return family;
    }
    
    public String getOuter() {
        return outer;
    }
}
