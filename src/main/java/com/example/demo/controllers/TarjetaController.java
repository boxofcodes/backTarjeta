package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.TarjetaModel;
import com.example.demo.services.TarjetaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/tarjeta")
public class TarjetaController {
    @Autowired
    TarjetaService tarjetaService;

    @GetMapping()
    public ArrayList<TarjetaModel> obtenerTarjetas() {
        return tarjetaService.obtenerTarjetas();
    }

    @PostMapping()
    public TarjetaModel guardarTarjeta(@RequestBody TarjetaModel tarjeta) {
        return this.tarjetaService.guardarTarjeta(tarjeta);
    }

    @GetMapping(path = "/{id}")
    public Optional<TarjetaModel> obtenerTarjetaPorId(@PathVariable("id") Long id) {
        return this.tarjetaService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<TarjetaModel> obtenerTarjetaPorPrioridad(@RequestParam("marca") String marca) {
        return this.tarjetaService.obtenerPorMarca(marca);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.tarjetaService.eliminarTarjetas(id);
        if (ok) {
            return "Se eliminó la tarjeta con id " + id;
        } else {
            return "No pudo eliminar la tarjeta con id" + id;
        }
    }

}