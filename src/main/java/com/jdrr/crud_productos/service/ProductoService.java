package com.jdrr.crud_productos.service;

import com.jdrr.crud_productos.entity.Producto;
import com.jdrr.crud_productos.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    } 

    public List<Producto> listar(){
        return productoRepository.findAll();
    }

    public Producto obtenerProducto(Long id){
        return productoRepository.findById(id).orElse(null);
    }

    public Producto crearProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public Producto editarProducto(Long id, Producto producto){
        Producto producto1 = productoRepository.findById(id).orElse(null);
        if (producto1 != null){
            producto1.setNombre(producto.getNombre());
            producto1.setPrecio(producto.getPrecio());
            producto1.setCantidad(producto.getCantidad());
            return productoRepository.save(producto1);
        }
        return null;
    }

    public void crearProducto(Long id){
        productoRepository.deleteById(id);
    }

}
