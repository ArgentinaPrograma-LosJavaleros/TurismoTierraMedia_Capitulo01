package turismo_en_la_tierra_media;

public abstract class Promocion {
	private String nombrePromocion;
	private TipoPromocion tipoPromocion;
	protected Integer costoPromocion;
	private Atraccion[] atracciones;

	public Promocion(String nombrePromocion, TipoPromocion tipoPromocion, Integer costoPromocion, 
			         Atraccion[] atracciones) {
		this.nombrePromocion = nombrePromocion;
		this.tipoPromocion = tipoPromocion;
		this.costoPromocion = costoPromocion;
		this.atracciones = atracciones;
	}

	public String getNombreAtraccion() {
		return nombrePromocion;
	}

	public void setNombreAtraccion(String nombreAtraccion) {
		this.nombrePromocion = nombreAtraccion;
	}

	public TipoPromocion getTipoPromocion() {
		return tipoPromocion;
	}

	public void setTipoPromocion(TipoPromocion tipoPromocion) {
		this.tipoPromocion = tipoPromocion;
	}

	public Integer getCostoAtraccion() {
		return costoPromocion;
	}

	public abstract void setCostoAtraccion(Integer costoPromocion);

	public abstract void setCostoAtraccion();

	public Atraccion[] getAtracciones() {
		return atracciones;
	}

	public void setAtracciones(Atraccion[] atracciones) {
		this.atracciones = atracciones;
	}

}
