package org.cibertec.edu.pe.Interfaces;

import org.cibertec.edu.pe.Modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProducto extends JpaRepository<Producto,String>{

}