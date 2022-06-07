package com.platzimarket.persistencia.crud;

import com.platzimarket.persistencia.entity.Producto;
import org.springframework.data.repository.CrudRepository;
/*
* Interface productoCrudRepository
* extends CrudRepository<Clase,tipo> Define un monton de metodos que se usan sin necesidad de escribirlos
*/
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
}
