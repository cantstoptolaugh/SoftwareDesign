package decorator;

class Part_B extends ManagementFee {

    public Part_B() {
        description = " B동 거주자님";
    }

    public double bill() {
        return 400000;
    }

}
