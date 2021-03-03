package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatalogoTest {

	@Test(expected= Exception.class)
	public void queQuitarProductoInexitenteLanceExcepcion() throws Exception {
		
		Producto prod1 = new Producto(1, "Chocolatada", 150.0);
		Producto prod2 = new Producto(3, "Azucar", 45.0);
		
		Catalogo catalogo = new Catalogo();
		
		catalogo.agregarProducto(prod1, 5);
		
		catalogo.quitarProducto(prod2);
		
	}
	
	@Test
	public void queAlRemoverStockLaCantidadEnExistenciaSeaCorrecta() {
		
		Producto prod1 = new Producto(1, "Chocolatada", 150.0);
		Producto prod2 = new Producto(2, "Leche", 150.0);
		Catalogo catalogo = new Catalogo();
		catalogo.agregarProducto(prod1, 5);
		catalogo.agregarProducto(prod2, 2);
		
		catalogo.removerStock(prod2, 5);
		Integer cant=0;
		
		assertEquals(cant,catalogo.obtenerCantidad(prod2));
		
	}
}
