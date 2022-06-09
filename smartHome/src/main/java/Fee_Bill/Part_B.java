package Fee_Bill;

class Part_B extends ManagementFee {

    public Part_B() {
        description = "B"; // 사용자의 아파트 타입이 A 일때
    }

    public double bill() {
        return 400000; //B타입 아파트 기본 관리비는 40만원이다.
    }

}
