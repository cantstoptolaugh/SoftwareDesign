package decorator;

public class GasFee extends AdditionalFee {

    forGetFile forget = new forGetFile();
    double plusGas;
    private ManagementFee managementFee;
    
    public GasFee(forGetFile f) {
       f.get();
       plusGas = Double.parseDouble(forget.gas_num)*15.9;
    }
    
    public GasFee(ManagementFee managementFee) {
        this.managementFee = managementFee;
    }
    
    public String getDescription() {
        return managementFee.getDescription() + ", 가스 요금";
    }

    public double bill() {
        forget.get();
        return Double.parseDouble(forget.gas_num)*15.9 + managementFee.bill();
    }

}
