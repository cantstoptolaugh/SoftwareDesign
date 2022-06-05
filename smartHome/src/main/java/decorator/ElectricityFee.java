package decorator;

class ElectricityFee extends AdditionalFee {

    forGetFile forget = new forGetFile();
    double plusElec;
    private ManagementFee managementFee;
    
    public ElectricityFee(forGetFile f) {
        f.get();
        plusElec = Double.parseDouble(forget.elec_num)*15.9;
    }
    public ElectricityFee(ManagementFee managementFee) {
        this.managementFee = managementFee;
    }

    public String getDescription() {
        return managementFee.getDescription() + ", 전기 요금";
    }

    public double bill() {
        return plusElec + managementFee.bill();
    }

}
