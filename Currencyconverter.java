public interface CurrencyConverter {
      // Method to convert a currency amount from source to destination currency
      double convertCurrency(String sourceCurrencyCode, String destinationCurrencyCode, double amount);

      // Method to get an array of available currency codes
      String[] getCurrencyCodes();
  
      // Method to get the exchange rate between two currencies
      double getExchangeRate(String sourceCurrencyCode, String destinationCurrencyCode);
  }

       
