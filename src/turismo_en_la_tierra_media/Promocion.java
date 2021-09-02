package turismo_en_la_tierra_media;

public abstract class Promocion {
	private String nombre_atraccion;
	private Tipo_promocion tipo;
	protected Double costo_atraccion;
	private Atraccion[] atracciones;

	
	
	public Promocion(String nombre_atraccion, Tipo_promocion tipo, Double costo_atraccion, Atraccion[] atracciones) {
		this.nombre_atraccion = nombre_atraccion;
		this.tipo = tipo;
		this.costo_atraccion = costo_atraccion;
		this.atracciones = atracciones;
	}

	public String getNombre_atraccion() {
		return nombre_atraccion;
	}

	public void setNombre_atraccion(String nombre_atraccion) {
		this.nombre_atraccion = nombre_atraccion;
	}

	public Tipo_promocion getTipo() {
		return tipo;
	}

	public void setTipo(Tipo_promocion tipo) {
		this.tipo = tipo;
	}

	public Double getCosto_atraccion() {
		return costo_atraccion;
	}

	public abstract void setCosto_atraccion(Double costo_atraccion);
	public abstract void setCosto_atraccion();

	public Atraccion[] getAtracciones() {
		return atracciones;
	}

	public void setAtracciones(Atraccion[] atracciones) {
		this.atracciones = atracciones;
	}

}
