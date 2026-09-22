public class BasicCellPhone {
    public static void main(String[] args) {
        int numberOfMessages = 1000;

        double priceA = 30.00;
        double messageA = 0.08;
        int thresholdA = -1;
        double extraChargeA = 0.00;

        double priceB = 45.00;
        double messageB = 0.03;
        int thresholdB = 1000;
        double extraChargeB = 10.00;

        double[] thing = {0.0, 1.0, 4.0, 102.0};

        String cheaperPlan = findCheaperPlan(numberOfMessages, priceA, messageA, thresholdA, extraChargeA, priceB, messageB, thresholdB, extraChargeB);

    }

    private static String findCheaperPlan(int numberOfMessages,double basePriceA,double messageA,int thresholdA,double extraChargeA,double basePriceB,double messageB,int thresholdB,double extraChargeB){
        
        double planAPrice = calculatePlanPrice(numberOfMessages,basePriceA,messageA,thresholdA,extraChargeA);
        double planBPrice = calculatePlanPrice(numberOfMessages,basePriceB,messageB,thresholdB,extraChargeB);

        if(planAPrice <= planBPrice){
            return "Plan A";
        } else {
            return "Plan B";
        }
    }

    private static double calculatePlanPrice(int numberOfMessages,double basePrice,double message,int threshold,double extraCharge){
        double totalPrice = basePrice + message * numberOfMessages;
        
        if(numberOfMessages > threshold){
            totalPrice += extraCharge;
        }
        
        return totalPrice;
    }
}
