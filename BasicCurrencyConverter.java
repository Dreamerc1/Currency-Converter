import java.util.HashMap;
import java.util.Map;

public class BasicCurrencyConverter implements CurrencyConverter {

// A map to store exchange rates between currencies
    private Map<String, Double> exchangeRates;

// Constructor to initialize exchange rates
    public BasicCurrencyConverter() {
        exchangeRates = new HashMap<>();
         // Adding some sample exchange rates (e.g., USD to GBP, USD to EUR)
         exchangeRates.put("USD_TO_GBP", 0.75);
         exchangeRates.put("GBP_TO_USD", 1.33);
         exchangeRates.put("USD_TO_EUR", 0.85);
         exchangeRates.put("EUR_TO_USD", 1.18);
         // Add more exchange rates as needed
     }
      // Implementation of the convertCurrency method
    @Override
    public double convertCurrency(String sourceCurrencyCode, String destinationCurrencyCode, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid or null amount.");
        }

        String key = sourceCurrencyCode + "_TO_" + destinationCurrencyCode;
        Double rate = exchangeRates.get(key);

        if (rate == null) {
            throw new IllegalArgumentException("Invalid or missing exchange rate for the given currency pair.");
        }

        return amount * rate;
    }
    // Implementation of the getCurrencyCodes method
    @Override
    public String[] getCurrencyCodes() {
        return new String[] {"USD", "GBP", "EUR"}; // Extend this list as needed
    }

    // Implementation of the getExchangeRate method
    @Override
    public double getExchangeRate(String sourceCurrencyCode, String destinationCurrencyCode) {
        String key = sourceCurrencyCode + "_TO_" + destinationCurrencyCode;
        Double rate = exchangeRates.get(key);

        if (rate == null) {
            throw new IllegalArgumentException("Invalid or missing exchange rate for the given currency pair.");
        }

        return rate;
    }

     // Main method for testing purposes
     public static void main(String[] args) {
        BasicCurrencyConverter converter = new BasicCurrencyConverter();
        
        // Testing the convertCurrency method
        try {
            double convertedAmount = converter.convertCurrency("USD", "GBP", 100);
            System.out.println("Converted amount: " + convertedAmount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing the getCurrencyCodes method
        String[] codes = converter.getCurrencyCodes();
        System.out.println("Available currency codes:");
        for (String code : codes) {
            System.out.println(code);
        }

        // Testing the getExchangeRate method
        try {
            double exchangeRate = converter.getExchangeRate("USD", "EUR");
            System.out.println("Exchange rate USD to EUR: " + exchangeRate);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

 

     
    }
