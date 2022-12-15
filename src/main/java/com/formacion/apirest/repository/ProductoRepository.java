package com.formacion.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacion.apirest.entity.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{
	
	/*@Query("from productos")
	public List<Producto> mostrarProductos();
	
	public Producto findById(long id);*/
}
