package com.project.conversorUnidades.service;

import com.project.conversorUnidades.utilities.ConversoresArea;
import com.project.conversorUnidades.utilities.ConversoresLongitud;
import com.project.conversorUnidades.utilities.ConversoresMasa;
import com.project.conversorUnidades.utilities.ConversoresTemperatura;
import org.springframework.stereotype.Service;
@Service
public class ConversorService {
    public double convertir(String tipo, double valor, String unidadOrigen, String unidadDestino) {
        switch (tipo.toLowerCase()) {
            case "longitud":
                return convertirLongitud(valor, unidadOrigen, unidadDestino);
            case "masa":
                return  convertirMasa(valor, unidadOrigen, unidadDestino);
            case "temperatura":
                return  convertirTemperatura(valor, unidadOrigen, unidadDestino);
            case "area":
                return  convertirArea(valor,unidadOrigen,unidadDestino);
            default:
                throw new IllegalArgumentException("Tipo de conversión no válido");
        }
    }

    private double convertirLongitud(double valor, String origen, String destino) {
        switch (origen) {
            case "m" -> {
                return ConversoresLongitud.convMetros(valor, destino);
            }
            case "cm" -> {
                return  ConversoresLongitud.convCentimetros(valor, destino);
            }
            case "mm" -> {
                return  ConversoresLongitud.convMilimetros(valor, destino);
            }
            case "un" -> {
                return  ConversoresLongitud.convMicrometros(valor, destino);
            }
            case "nm" -> {
                return  ConversoresLongitud.convNanometros(valor, destino);
            }
            case "km" -> {
                return ConversoresLongitud.convKilometros(valor, destino);
            }
            case "millas" -> {
                return ConversoresLongitud.convMillas(valor, destino);
            }
            default -> throw new IllegalArgumentException("Conversor de longitud no válido");
        }
    }

    private double convertirArea(double valor, String origen, String destino) {
        switch (origen) {
            case "m2" -> {
                return ConversoresArea.convMetrosCuad(valor,destino);
            }
            case "km2" -> {
                return ConversoresArea.convKilometrosCuad(valor,destino);
            }
            case "Ha" -> {
                return ConversoresArea.convHectareas(valor,destino);
            }
            default -> throw new IllegalArgumentException("Converor de Área no válido");
        }
    }
    private double convertirMasa(double valor, String origen, String destino) {
        switch (origen) {
            case "kg" -> {
                return ConversoresMasa.convKilogramo(valor,destino);
            }
            case "lb" -> {
                return ConversoresMasa.convLibra(valor,destino);
            }
            case "g" -> {
                return ConversoresMasa.convGramo(valor,destino);
            }
            default -> throw new IllegalArgumentException("Converor de masa no válido");
        }
    }

    private double convertirTemperatura(double  valor, String origen, String destino) {
        switch (origen) {
            case "C" -> {
                return ConversoresTemperatura.convCelsius(valor,destino);
            }
            case "F" -> {
                return ConversoresTemperatura.convFahrenheit(valor, destino);
            }
            case "K" -> {
                return ConversoresTemperatura.convKelvin(valor, destino);
            }
            default -> throw new IllegalArgumentException("Converor de temperatura no válido");
        }
    }
}
