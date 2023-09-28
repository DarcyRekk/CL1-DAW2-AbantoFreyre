package org.cibertec.edu.pe.InterfaceService;

import java.util.List;
import java.util.Optional;
import org.cibertec.edu.pe.Modelo.Producto;


public interface IProductoService {
	public List<Producto> Listar();
	public Optional<Producto> Buscar(String Id);
}
