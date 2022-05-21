/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SignUp;

/**
 *
 * @author 이주혁
 */
public class ArrayObject {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HouseHold[] create = new HouseHold[10];

        create[0] = new HouseHold("이주혁", "joohyeok", "1234", "999호", "아들", "A동");

        System.out.println(create[0].getId());
        System.out.println(create[0].getPw());
        System.out.println(create[0].getRoom_num());
        System.out.println(create[0].getRole());
        System.out.println(create[0].getName());
        System.out.println(create[0].getPart());
    }
}

class HouseHold {

    private String name;
    private String id;
    private String pw;
    private String room_num;
    private String role;
    private String part;

    public HouseHold() {
    }

    //구조체
    public HouseHold(String name, String id, String pw, String room_num, String role, String part) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.room_num = room_num;
        this.role = role;
        this.part = part;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getRoom_num() {
        return room_num;
    }

    public void setRoom_num(String room_num) {
        this.room_num = room_num;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

}
