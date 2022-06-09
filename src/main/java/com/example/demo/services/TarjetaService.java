package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.TarjetaModel;
import com.example.demo.repositories.TarjetaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarjetaService {
    @Autowired
    TarjetaRepository tarjetaRepository;

    public ArrayList<TarjetaModel> obtenerTarjetas() {
        return (ArrayList<TarjetaModel>) tarjetaRepository.findAll();
    }

    public TarjetaModel guardarTarjeta(TarjetaModel tarjeta) {
        return tarjetaRepository.save(tarjeta);
    }

    public Optional<TarjetaModel> obtenerPorId(Long id) {
        return tarjetaRepository.findById(id);
    }

    public ArrayList<TarjetaModel> obtenerPorMarca(String marca) {
        return tarjetaRepository.findByMarca(marca);
    }

    public boolean eliminarTarjetas(Long id) {
        try {
            tarjetaRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}