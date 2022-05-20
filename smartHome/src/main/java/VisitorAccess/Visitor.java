
package VisitorAccess;

// Timestamp를 위해 import
import java.text.SimpleDateFormat;
import java.sql.Timestamp;

 public class Visitor {
    // 외부인과 가족 Member 변수
    String outer;
    String family;
    
    // Timestamp를 위한 객체 생성
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    
    
    // Door에서 활용하기 위한 메서드 getFamily
    public String getFamily() {
        return family;
    }
    
}
