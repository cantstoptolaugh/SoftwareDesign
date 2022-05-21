package decorator;

class SamsungRaemian extends ManagementFee {

    public SamsungRaemian() {
        description = " 삼성래미안 거주자님";
    }

    public double bill() {
        return 200000;
    }

}
