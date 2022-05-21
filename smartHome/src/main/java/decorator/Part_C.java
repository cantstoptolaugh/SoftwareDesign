package decorator;

class Part_C extends ManagementFee {

    public Part_C() {
        description = " C동 거주자님";
    }

    public double bill() {
        return 300000;
    }

}
