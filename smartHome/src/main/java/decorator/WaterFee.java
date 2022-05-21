package decorator;

class WaterFee extends AdditionalFee {

    private ManagementFee managementFee;

    public WaterFee(ManagementFee managementFee) {
        this.managementFee = managementFee;
    }

    public String getDescription() {
        return managementFee.getDescription() + ", 수도 요금";
    }

    public double bill() {
        return 65250 + managementFee.bill();
    }

}
