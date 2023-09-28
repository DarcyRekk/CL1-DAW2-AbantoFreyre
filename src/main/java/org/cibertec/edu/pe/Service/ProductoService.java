package org.cibertec.edu.pe.Service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.InterfaceService.IProductoService;
import org.cibertec.edu.pe.Interfaces.IProducto;
import org.cibertec.edu.pe.Modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{
	@Autowired
	private IProducto data;
	@Override
	public List<Producto> Listar() {
		return (List<Producto>)data.findAll();
	}
	@Override
	public Optional<Producto> Buscar(String Id) {
		return data.findById(Id);
	}
}
