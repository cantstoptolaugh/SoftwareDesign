package decorator;

class Electricity extends AdditionalFee {

    forGetFile forget = new forGetFile();
    
    private ManagementFee managementFee;
    
    
    public Electricity(ManagementFee managementFee) {
        this.managementFee = managementFee;
    }

    public String getDescription() {
        return managementFee.getDescription() + ", 전기 요금";
    }

    public double bill() {
        forget.get();
        
        return Double.parseDouble(forget.elec_num) + managementFee.bill();
    }

}
