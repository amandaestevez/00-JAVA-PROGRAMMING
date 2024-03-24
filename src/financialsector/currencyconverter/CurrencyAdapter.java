package financialsector.currencyconverter;

// Novo adaptador que usa a antiga conversão e aplica a taxa adicional de GBP para EUR
class CurrencyAdapter {
    private final OldCurrencyConverter oldConverter;

    public CurrencyAdapter(OldCurrencyConverter oldConverter) {
        this.oldConverter = oldConverter;
    }

    // Método de conversão de USD para EUR usando o adaptador
    public double convertUSDtoEUR(double amount) {
        double amountInGBP = oldConverter.convertUSDtoGBP(amount);
        return amountInGBP * 1.0625; // Conversão de GBP para EUR
    }
}
