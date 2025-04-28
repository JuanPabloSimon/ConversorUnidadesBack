package com.project.conversorUnidades.utilities;

public interface ConversoresMasa {
    static double convKilogramo(double valor, String destino) {
        if (destino.equals("lb")) {
            return valor * 2.20462;
        } else if (destino.equals("g")) {
            return valor * 1000;
        } else {
            throw new IllegalArgumentException("Converor de masa no válido");
        }
    }
    static double convLibra(double valor, String destino) {
        if (destino.equals("kg")) {
            return valor / 2.20462;
        } else if (destino.equals("g")) {
            return (valor / 2.20462) * 1000;
        }
        throw new IllegalArgumentException("Converor de masa no válido");
    }
    static double convGramo(double valor, String destino) {
        if (destino.equals("kg")) {
            return valor / 1000;
        } else if (destino.equals("lb")) {
            return (valor / 1000) / 2.20462;
        }
        throw new IllegalArgumentException("Converor de masa no válido");
    }

}
