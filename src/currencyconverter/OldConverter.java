package currencyconverter;

// Old conversion class that only converts from  USD to GBP
public class OldConverter {
    public double convertUSDtoGBP(double amount) {
        return amount * 0.80; // 80% of the USD value
    }
}
