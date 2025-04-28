package com.project.conversorUnidades.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConversorRequest {

    private  String tipo;
    private double valor;
    private String unidadOrigen;
    private String unidadDestino;

}
