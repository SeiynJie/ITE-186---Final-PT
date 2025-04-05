import java.util.Scanner;

public class ElectricBillSystem{
    public static double calculateBill(int units){
        double ratePerKwh = 11.00;
        return units * ratePerKwh;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CENPELCO Electric Billing System ---");

        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();
        
        System.out.println("Enter account number: ");
        String accountNumber = scanner.nextLine();
        
        System.out.println("Enter number of units consumed (kWh): ");
        int units = scanner.nextInt();

        double billAmount = calculateBill(units);
        System.out.println("\n--- Bill Details ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Units Consumed: " + units + " kWh");
        System.out.printf("Total bill amount: P%.2f\n", billAmount);

        scanner.close();
    }
}