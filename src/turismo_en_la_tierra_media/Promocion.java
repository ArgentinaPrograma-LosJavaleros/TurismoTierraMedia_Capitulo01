package turismo_en_la_tierra_media;

public abstract class Promocion {
	private String nombre_atraccion;
	private Tipo_promocion tipo;
	protected Double costo_promocion;
	private Atraccion[] atracciones;

	// Constructor
	public Promocion(String nombre_atraccion, Tipo_promocion tipo, Double costo_promocion, Atraccion[] atracciones) {
		this.nombre_atraccion = nombre_atraccion;
		this.tipo = tipo;
		this.costo_promocion = costo_promocion;
		this.atracciones = atracciones;
	}

	// Setters
	// -------------------------------------------------------------------------
	public void setNombre_atraccion(String nombre_atraccion) {
		this.nombre_atraccion = nombre_atraccion;
	}

	public void setTipo(Tipo_promocion tipo) {
		this.tipo = tipo;
	}

	public void setAtracciones(Atraccion[] atracciones) {
		this.atracciones = atracciones;
	}
	// -------------------------------------------------------------------------

	// Getters
	// -------------------------------------------------------------------------
	public String getNombre_atraccion() {
		return nombre_atraccion;
	}

	public Tipo_promocion getTipo() {
		return tipo;
	}

	public Double getCosto_atraccion() {
		return costo_promocion;
	}

	public Atraccion[] getAtracciones() {
		return atracciones;
	}
	// -------------------------------------------------------------------------

	// Setters abstractos
	// -------------------------------------------------------------------------
	public abstract void setCosto_promocion(Double costo_promocion);

	public abstract void setCosto_promocion();
	// -------------------------------------------------------------------------

}
