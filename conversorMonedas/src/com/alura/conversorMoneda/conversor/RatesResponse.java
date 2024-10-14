package com.alura.conversorMoneda.conversor;

import java.util.Map;

public class RatesResponse {
    private Map<String, Float> conversion_rates;

    public Map<String, Float> getConversionRates() {
        return conversion_rates;
    }

    public void setConversionRates(Map<String, Float> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    @Override
    public String toString() {
        return "RatesResponse{" +
                "conversion_rates=" + conversion_rates +
                '}';
    }
}
