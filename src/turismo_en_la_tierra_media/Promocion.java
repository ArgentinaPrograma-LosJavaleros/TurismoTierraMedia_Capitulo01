package turismo_en_la_tierra_media;

public abstract class Promocion {
	private String nombreAtraccion;
	private TipoPromocion tipoPromocion;
	protected Double costoPromocion;
	private Atraccion[] atracciones;

	public Promocion(String nombreAtraccion, TipoPromocion tipoPromocion, Double costoPromocion, 
			         Atraccion[] atracciones) {
		this.nombreAtraccion = nombreAtraccion;
		this.tipoPromocion = tipoPromocion;
		this.costoPromocion = costoPromocion;
		this.atracciones = atracciones;
	}

	public String getNombreAtraccion() {
		return nombreAtraccion;
	}

	public void setNombreAtraccion(String nombreAtraccion) {
		this.nombreAtraccion = nombreAtraccion;
	}

	public TipoPromocion getTipoPromocion() {
		return tipoPromocion;
	}

	public void setTipoPromocion(TipoPromocion tipoPromocion) {
		this.tipoPromocion = tipoPromocion;
	}

	public Double getCostoAtraccion() {
		return costoPromocion;
	}

	public abstract void setCostoAtraccion(Double costoPromocion);

	public abstract void setCostoAtraccion();

	public Atraccion[] getAtracciones() {
		return atracciones;
	}

	public void setAtracciones(Atraccion[] atracciones) {
		this.atracciones = atracciones;
	}

}
