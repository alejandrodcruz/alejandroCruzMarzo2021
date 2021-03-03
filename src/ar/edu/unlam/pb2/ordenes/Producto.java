package ar.edu.unlam.pb2.ordenes;

public class Producto implements Comparable<Producto>{
	private Integer numero; //id d
	private String descripcion;
	private Double precio;

	/*
	 * Se crea un producto.
	 */
	public Producto(Integer numero, String descripcion, Double precio) {
		super();
		this.numero = numero;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	/*
	 * Retorna el precio unitario del Producto.
	*/
	public Double getPrecio() {
		return this.precio;
	}
	
	/*
	 * Devulve el monto del impuesto.
	 * Todo producto tiene un 21% de impuesto.
	 */
	public Double getImpuesto() {
		return precio*0.21;
	}
	
	/*
	 * Devuelve la descripción del Producto
	 */
	public String getDescripcion() {
		return this.descripcion;
	}
	
	/*
	 * Devuelve el precio del producto luego de aplicar el impuesto.
	 */
	public Double getPrecioFinal() {
		return this.precio*1.21;
	}

	@Override
	public int compareTo(Producto o) {
		return this.numero.compareTo(o.numero);
	}
}
