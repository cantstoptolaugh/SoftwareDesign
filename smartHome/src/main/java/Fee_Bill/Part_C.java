package Fee_Bill;

class Part_C extends ManagementFee {

    public Part_C() {
        description = "C"; // 사용자의 아파트 타입이 A 일때
    }

    public double bill() {
        return 300000; //C타입의 아파트 기본 관리비는 30만원이다.
    }

}
