package com.jdrr.crud_productos.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Producto {

    @Id
    private Long id;
    @Column(unique = true)
    private String nombre;
    private float precio;
    private int cantidad;

}
