package decorator;

public class GasFee extends AdditionalFee {

    private ManagementFee managementFee;

    public GasFee(ManagementFee managementFee) {
        this.managementFee = managementFee;
    }

    public String getDescription() {
        return managementFee.getDescription() + ", 가스 요금";
    }

    public double bill() {
        return 54880 + managementFee.bill();
    }

}
