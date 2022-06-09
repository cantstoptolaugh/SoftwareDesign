package Fee_Bill;

public class GasFee extends AdditionalFee {

    forGetFile forget = new forGetFile();
    double plusGas;
    private ManagementFee managementFee;
    
    public GasFee(forGetFile f) {
       f.get(); // 텍스트 파일로부터 가스 사용량을 불러온다.
       plusGas = Double.parseDouble(forget.gas_num)*15.9;
       //불러온 가스 사용량에 요금 산정을 한다.
    }
    
    public GasFee(ManagementFee managementFee) {
        this.managementFee = managementFee;
    }
    
    public String getDescription() {
        return managementFee.getDescription() + ", 가스 요금";
    }

    public double bill() {
        forget.get(); 
        //텍스트 파일로부터 가스 사용량을 불러온다.
        return Double.parseDouble(forget.gas_num)*15.9 + managementFee.bill();
        //불러온 가스 사용량 + 전체 관리비 ( 누적 합산 ) 을 반환한다.
    }

}
