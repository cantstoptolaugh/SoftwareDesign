package decorator;

class Electricity extends AdditionalFee {

    private ManagementFee managementFee;

    public Electricity(ManagementFee managementFee) {
        this.managementFee = managementFee;
    }

    public String getDescription() {
        return managementFee.getDescription() + ", 전기 요금";
    }

    public double bill() {
        return 89270 + managementFee.bill();
    }

}
