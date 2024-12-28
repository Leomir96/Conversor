public class Main {
    public static void main(String[] args) {
        // Obtener los datos del usuario
        UserInput input = UserInput.getInput();

        // Llamada al servicio de conversión de divisas
        try {
            CurrencyConverter converter = new CurrencyConverter();
            double convertedAmount = converter.convertCurrency(input.getFromCurrency(), input.getToCurrency(), input.getAmount());
            // Mostrar el resultado
            System.out.printf("%.2f %s son equivalentes a %.2f %s%n", input.getAmount(), input.getFromCurrency(), convertedAmount, input.getToCurrency());
        } catch (Exception e) {
            System.out.println("Ocurrió un error al realizar la conversión: " + e.getMessage());
        }
    }
}