package org.cibertec.edu.pe.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Producto")
public class Producto {
	@Id
	private String idProducto;
	private String nombreProducto;
	private String descripcionProducto;
	private double precio;
	public Producto() {
	}
	public Producto(String id, String nomprodu, String descprodu, double costo) {
		idProducto = id;
		nombreProducto = nomprodu;
		descripcionProducto = descprodu;
		precio = costo;
	}
	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
