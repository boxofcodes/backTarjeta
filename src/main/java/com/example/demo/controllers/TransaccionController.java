package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.TransaccionModel;
import com.example.demo.services.TransaccionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/transaccion")
public class TransaccionController {
    @Autowired
    TransaccionService transaccionService;

    @GetMapping()
    public ArrayList<TransaccionModel> obtenerTransacciones() {
        return transaccionService.obtenerTransacciones();
    }

    @PostMapping()
    public TransaccionModel guardarTransaccion(@RequestBody TransaccionModel transaccion) {
        return this.transaccionService.guardarTransaccion(transaccion);
    }

    @GetMapping(path = "/{id}")
    public Optional<TransaccionModel> obtenerPorId(@PathVariable("id") Long id) {
        return this.transaccionService.obtenerPorId(id);
    }

}