package ar.edu.unlam.pb2.ordenes;

/*
 * Es un tipo "especial" de Producto.
 */
public class ProductoDeLujo extends Producto{	
	
	/*
	 * Se le aplica el 21% y un 15% de impuesto adicional = 36%
	 * por derechos de importación.
	 */
	
	public ProductoDeLujo(Integer numero, String descripcion, Double precio) {
		super(numero, descripcion, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getImpuesto() { 
		return super.getImpuesto() + getPrecio()*15/100; // Agrega 15% adicional
	}

}
