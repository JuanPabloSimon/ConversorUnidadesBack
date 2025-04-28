package com.project.conversorUnidades.utilities;

public interface ConversoresTemperatura {

    static double convCelsius(double valor, String destino) {
        if (destino.equals("F")) {
            return (valor * 9 / 5) + 32;
        } else if (destino.equals("K")) {
            return valor + 273.15;
        } else {
            throw new IllegalArgumentException("Converor de temperatura no válido");
        }
    }
    static double convFahrenheit(double valor, String destino) {
        if (destino.equals("C")){
            return (valor - 32) * 5 / 9;
        }else if(destino.equals("K")) {
            return ((valor-32) * 5/9) + 273.15;
        }
        throw new IllegalArgumentException("Converor de temperatura no válido");
    }
    static double convKelvin(double valor, String destino) {
        if (destino.equals("C")) {
            return valor - 273.15;
        } else if (destino.equals("F")) {
            return (valor - 273.15)* 9/5 +32;
        }
        throw new IllegalArgumentException("Converor de temperatura no válido");
    }
}
