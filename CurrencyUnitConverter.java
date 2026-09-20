import java.util.Scanner;

public class CurrencyUnitConverter {

    // Convert method
    public static double convert(double value, char type) {

        switch (type) {

            case 'I':
                // INR to USD
                return value / 83;

            case 'K':
                // KM to Miles
                return value * 0.621;

            case 'G':
                // KG to Pounds
                return value * 2.205;

            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Menu
            System.out.println("\n===== Currency & Unit Converter =====");
            System.out.println("1. INR-USD");
            System.out.println("2. KM-Miles");
            System.out.println("3. KG-Pounds");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice;

            // Read choice safely
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number.");
                continue;
            }

            // Exit
            if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }

            // Invalid choice
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please select 1-4.");
                continue;
            }

            System.out.print("Enter value: ");

            double value;

            // Parse value using Double wrapper class
            try {
                value = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a numeric value.");
                continue;
            }

            double result;

            // Switch-based conversion
            switch (choice) {

                case 1:
                    result = convert(value, 'I');
                    System.out.printf("%.2f INR = %.2f USD%n",
                            value, result);
                    break;

                case 2:
                    result = convert(value, 'K');
                    System.out.printf("%.2f km = %.2f miles%n",
                            value, result);
                    break;

                case 3:
                    result = convert(value, 'G');
                    System.out.printf("%.2f kg = %.2f pounds%n",
                            value, result);
                    break;
            }
        }

        sc.close();
    }
}