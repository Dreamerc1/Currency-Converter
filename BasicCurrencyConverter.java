import java.util.InputMismatchException;
import java.util.Scanner;
   
public class BasicCurrencyConverter {
    public static void main(String[] args) {
    // Step 1: Define the exchange rate
        double exchangeRate = 0.76;  // Example rate from USD to GBP
    // Step 2: Get user input
        Scanner scanner = new Scanner(System.in);
        double amountInUSD = 0;
        System.out.print("Enter amount in USD: ");

  
