
package VisitorAccess;

import java.util.*;

public class AccessTest {
    public static void main(String args[]) {
        // 전체 방문 조회를 위한 List
        List<Visitor> visitorList = new ArrayList<Visitor>();
        
        // 팩토리 객체 VisitorAccessTrace
        VisitorAccessTrace vat = new VisitorAccessTrace();
        
        // VisitorAccess 객체 생성 후 인자에 VisitorAccessTrace 추가
        VisitorAccess visitorAccess = new VisitorAccess(vat);
        
        // 집의 문 선언
        Door d;
        
        
        // 첫번째 방문자 객체를 생성
        Visitor v1 = visitorAccess.checkVisitor("brother");
        
        // instanceof를 통해 v1이 외부인인지 가족 멤버인지 확인
        if(v1 instanceof Family) {
            // 가족멤버일 경우 그에 대한 Door 객체 생성
            d = new Door(v1);    
            // 가족 멤버를 방문자 리스트에 추가
            visitorList.add(v1);
        } else if(v1 instanceof Outer) {
            // 만약 v1이 외부인이라면 그에 대한 Door 객체 생성
            d = new Door(v1);
            // 외부인을 방문자 리스트에 추가
            visitorList.add(v1);
        }
        
        
        // 두번째 방문자 객체를 생성
        Visitor v2 = visitorAccess.checkVisitor("sister");
        
        // instanceof를 통해 v2가 외부인인지 가족 멤버인지 확인
        if(v2 instanceof Family) {
            // 가족멤버일 경우 그에 대한 Door 객체 생성
            d = new Door(v2);    
            // 가족멤버를 방문자 리스트에 추가
            visitorList.add(v2);
        } else if(v2 instanceof Outer) {
            // 만약 v2가 외부인이라면 그에 대한 Door 객체 생성
            d = new Door(v2);
            // 외부인을 방문자 리스트에 추가
            visitorList.add(v2);
        }
        
        // 외부인 객체 생성
        Visitor v3 = visitorAccess.checkVisitor("outer");
        
        // instanceof를 통해 v3가 외부인인지 가족 멤버인지 확인
        if(v3 instanceof Family) {
            // 가족멤버일 경우 그에 대한 Door 객체 생성
            d = new Door(v3);    
            // 가족멤버를 방문자 리스트에 추가
            visitorList.add(v3);
        } else if(v3 instanceof Outer) {
            // 만약 v3가 외부인이라면 그에 대한 Door 객체 생성
            d = new Door(v3);
            // 외부인을 방문자 리스트에 추가
            visitorList.add(v3);
        }
   
        // 네 번째 방문자 객체를 생성        
        Visitor v4 = visitorAccess.checkVisitor("father");
        
        // instanceof를 통해 v4가 외부인인지 가족 멤버인지 확인
        if(v4 instanceof Family) {
            // 가족멤버일 경우 그에 대한 Door 객체 생성
            d = new Door(v4);    
            // 가족멤버를 방문자 리스트에 추가
            visitorList.add(v4);
        } else if(v4 instanceof Outer) {
            // 만약 v3 외부인이라면 그에 대한 Door 객체 생성
            d = new Door(v4);
            // 외부인을 방문자 리스트에 추가
            visitorList.add(v4);
        }

        // 마지막 방문자 객체를 생성   
        Visitor v5 = visitorAccess.checkVisitor("mother");
        
        // instanceof를 통해 v5가 외부인인지 가족 멤버인지 확인
        if(v5 instanceof Family) {
            // 가족멤버일 경우 그에 대한 Door 객체 생성
            d = new Door(v5);    
            // 가족멤버를 방문자 리스트에 추가
            visitorList.add(v5);
        } else if(v5 instanceof Outer) {
            // 만약 v3 외부인이라면 그에 대한 Door 객체 생성
            d = new Door(v5);
            // 외부인을 방문자 리스트에 추가
            visitorList.add(v5);
        }
        
        System.out.println("");
        
        System.out.println("-----------방문자 전체 리스트-----------");
        
        // 방문자 리스트 전체 조회
        for(int i = 0; i < visitorList.size(); i++) {
            System.out.println(visitorList.get(i));
        }
    }
}
