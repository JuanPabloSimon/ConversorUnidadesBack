package com.project.conversorUnidades.utilities;

public interface ConversoresArea {
    static double convMetrosCuad(double valor, String destino) {
        switch (destino) {
            case "km2" -> {
                return valor / 1000000;
            }
            case "Ha" -> {
                return valor / 10000;
            }
            default -> throw new IllegalArgumentException("Converor de Área no válido");
        }
    }
    static double convKilometrosCuad(double valor, String destino) {
        switch (destino) {
            case "m2" -> {
                return valor * 1000000;
            }
            case "Ha" -> {
                return valor * 100;
            }
            default -> throw new IllegalArgumentException("Converor de Área no válido");
        }
    }
    static double convHectareas(double valor, String destino) {
        switch (destino) {
            case "km2" -> {
                return valor / 100;
            }
            case "m2" -> {
                return valor * 10000;
            }
            default -> throw new IllegalArgumentException("Converor de Área no válido");
        }
    }

}
