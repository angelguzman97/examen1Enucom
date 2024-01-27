
public class Refaccionaria {
	private String nombreRefaccion;
	private String tipoRefaccion;
	private float precioRefaccion;
	private int cantidad;
	private float precioCompra;
	private float ganancias;

	public Refaccionaria() {
	}

	public Refaccionaria(String nombreRefaccion, String tipoRefaccion, float precioRefaccion, int cantidad,
			float precioCompra, float ganancias) {
		this.nombreRefaccion = nombreRefaccion;
		this.tipoRefaccion = tipoRefaccion;
		this.precioRefaccion = precioRefaccion;
		this.cantidad = cantidad;
		this.precioCompra = precioCompra;
		this.ganancias = ganancias;
	}
	
	
	@Override
	public String toString() {
		return "Refaccionaria \nRefacción: " + nombreRefaccion + "\nTipo de Refacción: " + tipoRefaccion
				+ "\nPrecio de Refacción: " + precioRefaccion + "\nCantidad: " + cantidad + "\nPrecio de Compra: " + precioCompra
				+ "\nGanancias: " + ganancias;
	}

	public String getNombreRefaccion() {
		return nombreRefaccion;
	}

	public void setNombreRefaccion(String nombreRefaccion) {
		this.nombreRefaccion = nombreRefaccion;
	}

	public String getTipoRefaccion() {
		return tipoRefaccion;
	}

	public void setTipoRefaccion(String tipoRefaccion) {
		this.tipoRefaccion = tipoRefaccion;
	}

	public float getPrecioRefaccion() {
		return precioRefaccion;
	}

	public void setPrecioRefaccion(float precioRefaccion) {
		this.precioRefaccion = precioRefaccion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public float getGanancias() {
		return ganancias;
	}

	public void setGanancias(float ganancias) {
		this.ganancias = ganancias;
	}

}
