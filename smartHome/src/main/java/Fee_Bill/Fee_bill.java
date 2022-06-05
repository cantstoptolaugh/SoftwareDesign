package Fee_Bill;

public class Fee_bill {

    public static void main(String args[]) {
        ManagementFee ResidentFee_1 = new Part_A();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(ResidentFee_1.description + ". 기본 관리비는 " + ResidentFee_1.bill() + "(원) 입니다.");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                         **관리비 청구** : 이번 달 총 요금은 ");
        ResidentFee_1 = new WaterFee(ResidentFee_1);
        ResidentFee_1 = new ElectricityFee(ResidentFee_1);
        System.out.println(ResidentFee_1.getDescription() + "을 합산하여 " + ResidentFee_1.bill() + "(원) 입니다.");
        System.out.println("---------------------------------------------------------------------------------\n\n\n");

        ManagementFee ResidentFee_2 = new Part_B();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(ResidentFee_2.description + ". 기본 관리비는 " + ResidentFee_2.bill() + "(원) 입니다.");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                         **관리비 청구** : 이번 달 총 요금은 ");
        ResidentFee_2 = new GasFee(ResidentFee_2);
        ResidentFee_2 = new ElectricityFee(ResidentFee_2);
        System.out.println(ResidentFee_2.getDescription() + "을 합산하여 " + ResidentFee_2.bill() + "(원) 입니다.");
        System.out.println("---------------------------------------------------------------------------------\n\n\n");

        ManagementFee ResidentFee_3 = new Part_C();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(ResidentFee_3.description + ". 기본 관리비는 " + ResidentFee_3.bill() + "(원) 입니다.");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                         **관리비 청구** : 이번 달 총 요금은 ");
        ResidentFee_3 = new WaterFee(ResidentFee_3);
        ResidentFee_3 = new GasFee(ResidentFee_3);
        ResidentFee_3 = new ElectricityFee(ResidentFee_3);
        System.out.println(ResidentFee_3.getDescription() + ")을 합산하여 " + ResidentFee_3.bill() + "(원) 입니다.");
        System.out.println("---------------------------------------------------------------------------------\n\n\n");

    }
}
