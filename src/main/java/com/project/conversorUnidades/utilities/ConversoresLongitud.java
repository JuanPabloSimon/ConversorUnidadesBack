package com.project.conversorUnidades.utilities;

public interface ConversoresLongitud {
    static double convMetros(double valor, String destino) {
        switch (destino) {
            case "km" -> {
                return valor / 1000;
            }
            case "millas" -> {
                return valor / 1609.34;
            }
            case "cm" -> {
                return valor * 100;
            }
            case "dm" -> {
                return valor * 10;
            }
            case "mm" -> {
                return valor * 1000;
            }
            case "um" -> {
                return valor * 1000000;
            }
            case "nm" -> {
                return valor * 1000000000;
            }
            default -> throw new IllegalArgumentException("Converor de longitud no válido");
        }
    }
    static double convMilimetros(double valor, String destino) {
        switch (destino) {
            case "km" -> {
                return valor / 1000000;
            }
            case "cm" -> {
                return valor / 10;
            }
            case "dm" -> {
                return valor / 100;
            }
            case "m" -> {
                return valor / 1000;
            }
            case "um" -> {
                return valor * 1000;
            }
            case "nm" -> {
                return valor * 1000000;
            }
            default -> throw new IllegalArgumentException("Converor de longitud no válido");
        }
    }
    static double convCentimetros(double valor, String destino) {
        switch (destino) {
            case "km" -> {
                return valor / 100000;
            }
            case "mm" -> {
                return valor * 10;
            }
            case "dm" -> {
                return valor / 10;
            }
            case "m" -> {
                return valor / 100;
            }
            case "um" -> {
                return valor * 10000;
            }
            case "nm" -> {
                return valor * 10000000;
            }
            default -> throw new IllegalArgumentException("Converor de longitud no válido");
        }
    }
    static double convMicrometros(double valor, String destino) {
        switch (destino) {
            case "km" -> {
                return valor / 1000000000;
            }
            case "mm" -> {
                return valor / 1000;
            }
            case "dm" -> {
                return valor / 100000;
            }
            case "m" -> {
                return valor / 1000000;
            }
            case "cm" -> {
                return valor / 10000;
            }
            case "nm" -> {
                return valor * 1000;
            }
            default -> throw new IllegalArgumentException("Converor de longitud no válido");
        }
    }
    static double convNanometros(double valor, String destino) {
            switch (destino) {
                case "km" -> {
                    double numerador = 1000000000000.0;
                    return valor / numerador;
                }
                case "mm" -> {
                    return valor / 1000000;
                }
                case "dm" -> {
                    return valor / 100000000;
                }
                case "m" -> {
                    return valor / 1000000000;
                }
                case "cm" -> {
                    return valor / 10000000;
                }
                case "um" -> {
                    return valor / 1000;
                }
                default -> throw new IllegalArgumentException("Converor de longitud no válido");
            }
    }
    static double convKilometros(double valor, String destino) {
        switch (destino) {
            case "m" -> {
                return valor * 1000;
            }
            case "millas" -> {
                return (valor * 1000 / 1609.34);
            }
            case "cm" -> {
                return valor * 100000;
            }
            case "dm" -> {
                return valor * 10000;
            }
            case "mm" -> {
                return valor * 1000000;
            }
            case "um" -> {
                return valor * 1000000000;
            }
            case "nm" -> {
                return valor * 1000000000000.0;
            }
            default -> throw new IllegalArgumentException("Converor de longitud no válido");
        }
    }
    static double convMillas(double valor, String destino) {
        if (destino.equals("m")) {
            return valor * 1609.34;
        } else if(destino.equals("km")) {
            return valor * 1609.34 / 1000;
        }
        throw new IllegalArgumentException("Converor de longitud no válido");
    }
}
