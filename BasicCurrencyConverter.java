import java.util.HashMap;
import java.util.Map;

public class BasicCurrencyConverter implements CurrencyConverter {

    // A map to store exchange rates between currencies
    private Map<String, Double> exchangeRates;
    