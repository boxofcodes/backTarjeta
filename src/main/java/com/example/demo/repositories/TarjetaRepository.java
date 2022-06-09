package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.TarjetaModel;

@Repository
public interface TarjetaRepository extends CrudRepository<TarjetaModel, Long> {
    public abstract ArrayList<TarjetaModel> findByMarca(String marca);
}