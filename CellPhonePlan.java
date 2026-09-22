public class CellPhonePlan{
    private double m_basePrice;
    private double m_pricePerMessage;
    private double m_extraChargeThreshold;
    private double m_extraCharge;
    private String m_name;

    public CellPhonePlan(String name, double basePrice, double pricePerMessage, int extraChargeThreshold, double extraCharge){
        m_name = name;
        m_basePrice = basePrice;
        m_pricePerMessage = pricePerMessage;
        m_extraChargeThreshold = extraChargeThreshold;
        m_extraCharge = extraCharge;
    }

    public double calculatePrice(double numberOfMessages){
        double totalPrice = m_basePrice + m_pricePerMessage * numberOfMessages;
        
        if(numberOfMessages > m_extraChargeThreshold){
            totalPrice += m_extraCharge;
        }
        
        return totalPrice;   
    }

    public double getBasePrice(){
        return m_basePrice;
    }

    public double getPricePerMessage(){
        return m_pricePerMessage;
    }

    public double getExtraChargeThreshold(){
        return m_extraChargeThreshold;
    }

    public double getExtraCharge(){
        return m_extraCharge;
    }

    public String getName(){
        return m_name;
    }

    public void setExtraCharge(double extraCharge){
        m_extraCharge = extraCharge;
    }
}