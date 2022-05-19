
package VisitorAccess;

import java.util.*;

/**
 *
 * @author sonjin-yeong
 */
public class AccessTest {
    public static void main(String args[]) {
        // 전체 방문 조회를 위한 List
        List<Visitor> visitorList = new ArrayList<Visitor>();
        
        // 팩토리 객체 VisitorAccessTrace
        VisitorAccessTrace vat = new VisitorAccessTrace();
        
        // VisitorAccess 객체 생성 후 인자에 VisitorAccessTrace 추가
        VisitorAccess visitorAccess = new VisitorAccess(vat);
        
        
        // 첫번째 방문자 객체를 생성
        Visitor v1 = visitorAccess.checkVisitor("brother");
        // 방문자를 방문자 리스트에 추가
        visitorList.add(v1);
        
        System.out.println("----------- " + v1.toString() + " 님이 방문하셨습니다. -----------");
        
        // 두번째 방문자 객체를 생성
        Visitor v2 = visitorAccess.checkVisitor("sister");
        // 방문자를 방문자 리스트에 추가
        visitorList.add(v2);
        
        System.out.println("----------- " + v2.toString() + " 님이 방문하셨습니다. -----------");

   
        // 세 번째 방문자 객체를 생성        
        Visitor v3 = visitorAccess.checkVisitor("father");
        // 방문자를 방문자 리스트에 추가
        visitorList.add(v3);
        
        System.out.println("----------- " + v3.toString() + " 님이 방문하셨습니다. -----------");

        
        // 네번째 방문자 객체를 생성   
        Visitor v4 = visitorAccess.checkVisitor("mother");
        // 방문자를 방문자 리스트에 추가
        visitorList.add(v4);
        
        System.out.println("----------- " + v4.toString() + " 님이 방문하셨습니다. -----------");

        System.out.println("");
        
        System.out.println("-----------방문자 전체 리스트-----------");
        
        // 방문자 리스트 전체 조회
        for(int i = 0; i < visitorList.size(); i++) {
            System.out.println(visitorList.get(i));
        }
    }
}
