package com.jdrr.crud_productos.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    private Long id;
    @Column(unique = true)
    private String nombre;
    private float precio;
    private int cantidad;

}
