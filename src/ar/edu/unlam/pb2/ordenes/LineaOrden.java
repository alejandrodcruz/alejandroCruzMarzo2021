package ar.edu.unlam.pb2.ordenes;


public class LineaOrden {
	private Producto item;
	private Integer cantidad;
		
	/*
	 * Crea un Item en la Orden con un Producto y catidad especificados.
	 */
	public LineaOrden(Producto producto, Integer cantidad) {
		
		super();
		this.item = item;
		this.cantidad = cantidad;
		
	}	
	/*
	 * Informa el Subtotal del Item.
	 */
	public Double getSubtotal() {
		return getSubtotal();
		
	}
	/*
	 * Devuelve el Producto.	
	 */
	public Producto getProducto() {
		return item;
	}
	/*
	 * Devuelve la cantidad.
	 */
	public Integer getCantidad() {
		return cantidad;
	}	
	
}
