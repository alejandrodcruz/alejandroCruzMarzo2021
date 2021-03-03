package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductoTest {
	@Test
	public void queSePuedePedirImpuestoSobreProducto() {
		
		Producto prod1 = new Producto(1, "Te", 50.0);
		
		Double imp = 10.5;
		
		assertEquals(imp,prod1.getImpuesto());
	}
	
	@Test
	public void queSePuedePedirImpuestoSobreProductoDeLujo() {	
		
		Producto prod1 = new ProductoDeLujo(1, "yerba", 100.0);
		
		Double imp = 36.0;
		assertEquals(imp, prod1.getImpuesto());;
	}
	
}
