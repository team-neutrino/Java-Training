public class Main {
    public static void main(String[] args) {
        int numberOfMessages = 10001;
        CellPhonePlan plan1 = new CellPhonePlan("Plan A", 1000, 1.2, 1, 999.99);
        CellPhonePlan plan2 = new CellPhonePlan("Plan B",500, 2, 10000, -999.99);

        System.out.println(comparePlans(numberOfMessages, plan1,plan2).getName());
    }

    public static CellPhonePlan comparePlans(int numberOfMessages, CellPhonePlan plan1, CellPhonePlan plan2){
        double plan1Cost = plan1.calculatePrice(numberOfMessages);
        double plan2Cost = plan2.calculatePrice(numberOfMessages);

        if(plan1Cost < plan2Cost){
            return plan1;
        } else {
            return  plan2;
        }
    }
}