package ar.edu.unlam.pb2.ordenes;

import java.util.Set;
import java.util.TreeSet;

/*
 * Mantiene una colección de Productos, los cuales no pueden
 * estar duplicados. Además, por cada Producto se desea mantener 
 * la cantidad del mismo en Stock,
 */
public class Catalogo {
	
	/*
	 * ¿Cuál es la colección adecuada?
	 */
	 private Set<Producto> catalogo;
	 private Integer cantidad;
	 
	 
	public Catalogo() {
		super();
		this.catalogo = new TreeSet<Producto>(); 
		this.cantidad=0;
	}

	/*
	 * Agregar producto al catálogo.
	 * No se permiten Productos duplicados. Criterio: número de Producto. 
	 */
	public Boolean agregarProducto(Producto producto, Integer cantidad) {
		this.cantidad = cantidad;
		return catalogo.add(producto);
		
	}
	
	/*
	 * Remueve Producto del Catálogo.
	 * Lanza una Excepción si el Producto no se encuentra en el Catálogo.
	 */
	public Boolean quitarProducto(Producto producto) throws Exception {
		
		if(catalogo.contains(producto)) {
			this.cantidad=0;
			return catalogo.remove(producto);
		}
		throw new Exception();
				
	}
	
	/*
	 * Descuenta la cantidad deseada de producto del Stock.
	 */
	
	public Boolean removerStock(Producto producto, Integer cantidad) {
		this.cantidad-=cantidad;
		return catalogo.remove(producto);
	}
	
	/*
	 * Devuleve la cantidad de Productos en existencia.
	 */
	public Integer obtenerCantidad(Producto producto) {
		Integer cant = 0;
		if(catalogo.contains(producto)) {
			cant = this.cantidad;
		}
		return cant;
	}
}
