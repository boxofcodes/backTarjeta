package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.TransaccionModel;
import com.example.demo.repositories.TransaccionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransaccionService {
    @Autowired
    TransaccionRepository transaccionRepository;

    public ArrayList<TransaccionModel> obtenerTransacciones() {
        return (ArrayList<TransaccionModel>) transaccionRepository.findAll();
    }

    public TransaccionModel guardarTransaccion(TransaccionModel transaccion) {
        return transaccionRepository.save(transaccion);
    }

    public Optional<TransaccionModel> obtenerPorId(Long id) {
        return transaccionRepository.findById(id);
    }

}