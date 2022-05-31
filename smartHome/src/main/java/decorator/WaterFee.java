package decorator;

class WaterFee extends AdditionalFee {

    forGetFile forget = new forGetFile();
    
    private ManagementFee managementFee;

    public WaterFee(ManagementFee managementFee) {
        this.managementFee = managementFee;
    }

    public String getDescription() {
        return managementFee.getDescription() + ", 수도 요금";
    }

    public double bill() {
        return Double.parseDouble(forget.elec_num) + managementFee.bill();
    }

}
