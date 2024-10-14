package com.alura.conversorMoneda.principal;

import com.alura.conversorMoneda.conversor.Convertir;
import com.alura.conversorMoneda.conversor.RatesResponse;

import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Boolean blContinuar = true;
        Scanner teclado = new Scanner(System.in);
        Short nuMenu;
        float nuCantidad;
        float nuMoneda;

        while (blContinuar) {
            System.out.println("************************************************");
            System.out.println("Bienvenido al conversor de monedas");
            System.out.println("1 - Peso Col (COP)- Dolar EUA (USD)");
            System.out.println("2 - Peso Col (COP)- Euro (EUR)");
            System.out.println("3 - Peso Col (COP)- Peso Mexicano (MXN)");
            System.out.println("4 - Peso Col (COP)- Dolar Canadiense (CAD)");
            System.out.println("5 - Peso Col (COP)- Peso Chileno (CLP)");
            System.out.println("6 - Peso Col (COP)- Yen (JPY)");
            System.out.println("7 - Peso Col (COP)- Rublo ruso (RUB)");
            System.out.println("8 - Otras conversiones - Moneda 1, Moneda 2");
            System.out.println("9 - Salir");

            nuMenu = teclado.nextShort();

            switch (nuMenu) {
                case 1: {
                    System.out.println("Peso Col (COP)- Dolar EUA (USD)");
                    System.out.println("Ingrese Valor a convertir");
                    nuCantidad = teclado.nextFloat();
                    Convertir convertir = new Convertir();
                    RatesResponse ratesResponse = convertir.obtenerTasasDeCambio("COP");
                    Map<String, Float> rates = ratesResponse.getConversionRates();
                    float resultado = Convertir.convierteMoneda(rates, "COP", "USD", nuCantidad);
                    System.out.println("Resultado : "+resultado);
                    //System.out.println(ratesResponse);
                    break;
                }
                case 2: {
                    System.out.println("Peso Col (COP)- Euro (EUR)");
                    System.out.println("Ingrese Valor a convertir");
                    nuCantidad = teclado.nextFloat();
                    Convertir convertir = new Convertir();
                    RatesResponse ratesResponse = convertir.obtenerTasasDeCambio("COP");
                    Map<String, Float> rates = ratesResponse.getConversionRates();
                    float resultado = Convertir.convierteMoneda(rates, "COP", "EUR", nuCantidad);
                    System.out.println("Resultado : "+resultado);
                    //System.out.println(ratesResponse);
                    break;
                }
                case 3: {
                    System.out.println("Peso Col (COP)- Peso Mexicano (MXN)");
                    System.out.println("Ingrese Valor a convertir");
                    nuCantidad = teclado.nextFloat();
                    Convertir convertir = new Convertir();
                    RatesResponse ratesResponse = convertir.obtenerTasasDeCambio("COP");
                    Map<String, Float> rates = ratesResponse.getConversionRates();
                    float resultado = Convertir.convierteMoneda(rates, "COP", "MXN", nuCantidad);
                    System.out.println("Resultado : "+resultado);
                    //System.out.println(ratesResponse);
                    break;
                }
                case 4: {
                    System.out.println("Peso Col (COP)- Dolar Canadiense (CAD)");
                    System.out.println("Ingrese Valor a convertir");
                    nuCantidad = teclado.nextFloat();
                    Convertir convertir = new Convertir();
                    RatesResponse ratesResponse = convertir.obtenerTasasDeCambio("COP");
                    Map<String, Float> rates = ratesResponse.getConversionRates();
                    float resultado = Convertir.convierteMoneda(rates, "COP", "CAD", nuCantidad);
                    System.out.println("Resultado : "+resultado);
                    //System.out.println(ratesResponse);
                    break;
                }
                case 5: {
                    System.out.println("Peso Col (COP)- Peso Chileno (CLP)");
                    System.out.println("Ingrese Valor a convertir");
                    nuCantidad = teclado.nextFloat();
                    Convertir convertir = new Convertir();
                    RatesResponse ratesResponse = convertir.obtenerTasasDeCambio("COP");
                    Map<String, Float> rates = ratesResponse.getConversionRates();
                    float resultado = Convertir.convierteMoneda(rates, "COP", "CLP", nuCantidad);
                    System.out.println("Resultado : "+resultado);
                    //System.out.println(ratesResponse);
                    break;
                }
                case 6: {
                    System.out.println("Peso Col (COP)- Yen (JPY)");
                    System.out.println("Ingrese Valor a convertir");
                    nuCantidad = teclado.nextFloat();
                    Convertir convertir = new Convertir();
                    RatesResponse ratesResponse = convertir.obtenerTasasDeCambio("COP");
                    Map<String, Float> rates = ratesResponse.getConversionRates();
                    float resultado = Convertir.convierteMoneda(rates, "COP", "JPY", nuCantidad);
                    System.out.println("Resultado : "+resultado);
                    //System.out.println(ratesResponse);
                    break;
                }
                case 7: {
                    System.out.println("Peso Col (COP)- Rublo ruso (RUB)");
                    System.out.println("Ingrese Valor a convertir");
                    nuCantidad = teclado.nextFloat();
                    Convertir convertir = new Convertir();
                    RatesResponse ratesResponse = convertir.obtenerTasasDeCambio("COP");
                    Map<String, Float> rates = ratesResponse.getConversionRates();
                    float resultado = Convertir.convierteMoneda(rates, "COP", "RUB", nuCantidad);
                    System.out.println("Resultado : "+resultado);
                    //System.out.println(ratesResponse);
                    break;
                }
                case 8: {
                    System.out.println("Otras conversiones - Moneda Origen, Moneda Destino");
                    System.out.println("Ingrese Nombre Moneda Origen");
                    String monedaOrigen = teclado.next().toUpperCase();
                    Convertir convertir = new Convertir();
                    RatesResponse ratesResponse = convertir.obtenerTasasDeCambio(monedaOrigen);
                    Map<String, Float> rates = ratesResponse.getConversionRates();

                    System.out.println("Monedas disponibles para conversión: " + rates.keySet());

                    System.out.println("Ingrese Nombre Moneda Destino");
                    String monedaDestino = teclado.next().toUpperCase();
                    System.out.println("Ingrese Valor a convertir");
                    nuCantidad = teclado.nextFloat();
                    try {
                        float resultado = Convertir.convierteMoneda(rates, monedaOrigen, monedaDestino, nuCantidad);
                        System.out.printf("%.2f %s equivalen a %.2f %s%n", nuCantidad, monedaOrigen, resultado, monedaDestino);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 9: {
                    blContinuar = false;
                    break;
                }
            }
        }


    }
}
