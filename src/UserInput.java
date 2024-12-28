import java.util.Scanner;

class UserInput {
    private String fromCurrency;
    private String toCurrency;
    private double amount;

    public static UserInput getInput() {
        Scanner scanner = new Scanner(System.in);
        UserInput input = new UserInput();

        System.out.println("Introduce la moneda de origen (ej. USD): ");
        input.fromCurrency = scanner.nextLine().toUpperCase();
        System.out.println("Introduce la moneda de destino (ej. EUR): ");
        input.toCurrency = scanner.nextLine().toUpperCase();
        System.out.println("Introduce la cantidad a convertir: ");
        input.amount = scanner.nextDouble();

        return input;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public double getAmount() {
        return amount;
    }
}