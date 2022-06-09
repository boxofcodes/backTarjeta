package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "tarjeta")
public class TarjetaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String marca;
    private String descripcion;
    private Float tasa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTasa(Float tasa) {
        this.tasa = tasa;
    }

    public Float getTasa() {
        return tasa;
    }

}