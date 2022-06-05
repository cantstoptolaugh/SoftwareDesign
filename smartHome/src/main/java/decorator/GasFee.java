package decorator;

public class GasFee extends AdditionalFee {

    forGetFile forget = new forGetFile();
    
    private ManagementFee managementFee;

    public GasFee(ManagementFee managementFee) {
        this.managementFee = managementFee;
    }

    public String getDescription() {
        return managementFee.getDescription() + ", 가스 요금";
    }

    public double bill() {
        return Double.parseDouble(forget.elec_num)*15.9 + managementFee.bill();
    }

}
