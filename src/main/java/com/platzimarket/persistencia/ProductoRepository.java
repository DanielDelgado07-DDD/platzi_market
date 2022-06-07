package com.platzimarket.persistencia;

import com.platzimarket.persistencia.crud.ProductoCrudRepository;
import com.platzimarket.persistencia.entity.Producto;
import java.util.List;

/* Clase que usa el repositorio de Spring framework data
* */
public class ProductoRepository {
    
    private ProductoCrudRepository productoCrudRepository;
    /*Metodo que obtiene todos los productos*/
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
