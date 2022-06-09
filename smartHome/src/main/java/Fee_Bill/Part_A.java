package Fee_Bill;

class Part_A extends ManagementFee {

    public Part_A() {
        description = "A"; // 사용자의 아파트 타입이 A 일때
    }

    public double bill() {
        return 200000; // A타입 아파트 기본 관리비는 20만원이다.
    }

}
