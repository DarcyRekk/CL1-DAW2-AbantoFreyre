package org.cibertec.edu.pe.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BoletaVenta")
public class BoletaVenta {
	@Id
	private String idBoleta;
	private double Subtotal;
	private double Precioenvio;
	private double Descuento;
	private double Total;
	public BoletaVenta(String id, double subtotal, double precioenvio, double descuento, double total) {
		idBoleta = id;
		Subtotal = subtotal;
		Precioenvio = precioenvio;
		Descuento = descuento;
		Total = total;
	}
	public String getIdBoleta() {
		return idBoleta;
	}
	public void setIdBoleta(String idBoleta) {
		this.idBoleta = idBoleta;
	}
	public double getSubtotal() {
		return Subtotal;
	}
	public void setSubtotal(double subtotal) {
		Subtotal = subtotal;
	}
	public double getPrecioenvio() {
		return Precioenvio;
	}
	public void setPrecioenvio(double precioenvio) {
		Precioenvio = precioenvio;
	}
	public double getDescuento() {
		return Descuento;
	}
	public void setDescuento(double descuento) {
		Descuento = descuento;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	
}

