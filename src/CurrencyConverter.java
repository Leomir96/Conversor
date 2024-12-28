import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

class CurrencyConverter {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/66bcea7be9950c83a6e521dc/pair/";

    public double convertCurrency(String fromCurrency, String toCurrency, double amount) throws Exception {
        // Construir la URL con los parámetros adecuados
        String url = API_URL + fromCurrency + "/" + toCurrency;

        // Crear un HttpClient y enviar la solicitud GET
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // Enviar la solicitud y obtener la respuesta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Si la respuesta es exitosa
        if (response.statusCode() == 200) {
            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
            if ("success".equals(jsonResponse.get("result").getAsString())) {
                double conversionRate = jsonResponse.get("conversion_rate").getAsDouble();
                return amount * conversionRate;
            } else {
                throw new Exception("Error en la respuesta de la API: " + jsonResponse.get("error-type").getAsString());
            }
        } else {
            throw new Exception("Error: No se pudo conectar a la API (código de estado: " + response.statusCode() + ")");
        }
    }
}