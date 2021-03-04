package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LineaOrdenTest {
	@Test
	public void queSePuedeCalcularElTotalPorDetalle() {	
		Producto prod1 = new Producto(1, "Arroz", 60.0);
		Producto prod2 = new Producto(2, "Azucar", 30.0);
		LineaOrden linea1 = new LineaOrden(prod1, 2);
		LineaOrden linea2 = new LineaOrden(prod2, 2);
		Orden orden = new Orden();
		orden.agregarLinea(linea1);
		orden.agregarLinea(linea2);
		assertEquals(orden.obtenerPrecioTotal(), 10.0, 0.0);

	}
	
}
