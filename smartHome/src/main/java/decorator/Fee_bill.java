package decorator;

public class Fee_bill {

    public static void main(String args[]) {
        ManagementFee ResidentFee_1 = new SamsungRaemian();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(ResidentFee_1.description + ". 기본 관리비는 " + ResidentFee_1.bill() + "(원) 입니다.");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                         **관리비 청구** : 이번 달 총 요금은 ");
        ResidentFee_1 = new WaterFee(ResidentFee_1);
        ResidentFee_1 = new Electricity(ResidentFee_1);
        System.out.println(ResidentFee_1.getDescription() + "을 합산하여 " + ResidentFee_1.bill() + "(원) 입니다.");
        System.out.println("---------------------------------------------------------------------------------\n\n\n");

        ManagementFee ResidentFee_2 = new HannamtheHill();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(ResidentFee_2.description + ". 기본 관리비는 " + ResidentFee_2.bill() + "(원) 입니다.");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                         **관리비 청구** : 이번 달 총 요금은 ");
        ResidentFee_2 = new GasFee(ResidentFee_2);
        ResidentFee_2 = new Electricity(ResidentFee_2);
        System.out.println(ResidentFee_2.getDescription() + "을 합산하여 " + ResidentFee_2.bill() + "(원) 입니다.");
        System.out.println("---------------------------------------------------------------------------------\n\n\n");

        ManagementFee ResidentFee_3 = new HillState();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(ResidentFee_3.description + ". 기본 관리비는 " + ResidentFee_3.bill() + "(원) 입니다.");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                         **관리비 청구** : 이번 달 총 요금은 ");
        ResidentFee_3 = new WaterFee(ResidentFee_3);
        ResidentFee_3 = new GasFee(ResidentFee_3);
        ResidentFee_3 = new Electricity(ResidentFee_3);
        System.out.println(ResidentFee_3.getDescription() + ")을 합산하여 " + ResidentFee_3.bill() + "(원) 입니다.");
        System.out.println("---------------------------------------------------------------------------------\n\n\n");

    }
}