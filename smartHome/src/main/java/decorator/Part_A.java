package decorator;

class Part_A extends ManagementFee {

    public Part_A() {
        description = " A동 거주자님";
    }

    public double bill() {
        return 200000;
    }

}
