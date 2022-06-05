package Fee_Bill;

class WaterFee extends AdditionalFee {
    
    private ManagementFee managementFee;
        forGetFile forget = new forGetFile();
        double plusWater;


    public WaterFee(forGetFile f) {
        f.get();
        plusWater = Double.parseDouble(forget.water_num)*15.9;
    }        
    public WaterFee(ManagementFee managementFee) {
        this.managementFee = managementFee;
    }

    public String getDescription() {
        return managementFee.getDescription() + ", 수도 요금";
    }

    public double bill() {
        forget.get();
        return Double.parseDouble(forget.water_num)*15.9 + managementFee.bill();
    }

}
