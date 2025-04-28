package com.project.conversorUnidades.controller;

import com.project.conversorUnidades.model.ConversorRequest;
import com.project.conversorUnidades.service.ConversorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/conversor")
public class ConversorControler {
    @Autowired
    private ConversorService conversorService;

    @PostMapping("/convert")
    public double convertir(@RequestBody ConversorRequest request) {
        return conversorService.convertir(request.getTipo(),request.getValor(), request.getUnidadOrigen(), request.getUnidadDestino());
    }

}
