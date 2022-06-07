package com.platzimarket.persistencia;

import com.platzimarket.persistencia.crud.ProductoCrudRepository;
import com.platzimarket.persistencia.entity.Producto;
import java.util.List;
import java.util.Optional;

/* Clase que usa el repositorio de Spring framework data
* */
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;
    /*Metodo que obtiene todos los productos*/
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
    /*Metodo que obtiene los productos por categoria usando  Query methods*/
    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }
}
