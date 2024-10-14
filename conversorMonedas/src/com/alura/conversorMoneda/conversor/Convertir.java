package com.alura.conversorMoneda.conversor;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class Convertir {
    public RatesResponse obtenerTasasDeCambio(String monedaOrigen) throws Exception {
        RatesResponse ratesResponse = new RatesResponse();
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/12b49629bff84124fed69856/latest/"+monedaOrigen);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Crear una instancia de Gson
            Gson gson = new Gson();
            // Deserializar el JSON a un objeto RatesResponse
            return ratesResponse = gson.fromJson(response.body(), RatesResponse.class);

        }
        catch (Exception e) {
            throw new RuntimeException("No encontré esa moneda.");
        }
    }

    // Método que realiza la conversión entre dos monedas
    public static float convierteMoneda(Map<String, Float> rates, String origen, String destino, float cantidad) {
        if (rates == null || !rates.containsKey(destino)) {
            throw new IllegalArgumentException("Moneda no válida: " + destino);
        }
        float tasaOrigen = rates.get(origen);
        float tasaDestino = rates.get(destino);
        return cantidad * tasaDestino;
    }
}
