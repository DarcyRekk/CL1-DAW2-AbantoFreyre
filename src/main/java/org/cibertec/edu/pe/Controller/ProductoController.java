package org.cibertec.edu.pe.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.List;
import java.util.Optional;
import org.cibertec.edu.pe.InterfaceService.IProductoService;
import org.cibertec.edu.pe.Modelo.Producto;
import org.cibertec.edu.pe.Service.ProductoService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class ProductoController {
	@Autowired
	private IProductoService servicio;
	
	@GetMapping("/listaproductos")	// http://localhost:8080/listar
	public String Listado(Model m) {
		List<Producto> lista = servicio.Listar();
		m.addAttribute("producto", lista);
		m.addAttribute("carrito", new Carrito());
		return "listaproductos";
	}
	
	@PostMapping("/agregarAlCarrito")
    public String agregarAlCarrito(@ModelAttribute("carrito") Carrito carrito, @RequestParam String idProducto, @RequestParam int cantidad) {
        Producto producto = servicio.Buscar();
        if (producto != null && cantidad > 0) {
            carrito.agregarProducto(producto, cantidad);
        }
        return "redirect:/productos/lista";
    }
}
