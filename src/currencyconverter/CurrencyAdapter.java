package currencyconverter;

// Adapter
class CurrencyAdapter {
    private final OldConverter oldConverter;

    public CurrencyAdapter(OldConverter oldConverter) {
        this.oldConverter = oldConverter;
    }

    // Using the Adapter
    public double convertUSDtoEUR(double amount) {
        double amountInGBP = oldConverter.convertUSDtoGBP(amount);
        return amountInGBP * 1.0625; // Converts GBP to EUR
    }
}
