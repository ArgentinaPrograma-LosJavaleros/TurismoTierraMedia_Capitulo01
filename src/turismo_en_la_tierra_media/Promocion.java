package turismo_en_la_tierra_media;

import java.util.ArrayList;

public abstract class Promocion {

	private String nombrePromocion;
	private TipoPromocion tipoPromocion;
	protected Integer costoPromocion;
	private ArrayList<Atraccion> atracciones;

	// Constructor
	public Promocion(String nombrePromocion, TipoPromocion tipoPromocion, Integer costoPromocion,
			ArrayList<Atraccion> atracciones) {
		setNombrePromocion(nombrePromocion);
		setTipoPromocion(tipoPromocion);
		this.costoPromocion = costoPromocion;
		setAtracciones(atracciones);
	}

	// Setters
	//--------------------------------------------------------------------------
	public void setNombrePromocion(String nombreAtraccion) {
		this.nombrePromocion = nombreAtraccion;
	}
	
	public void setTipoPromocion(TipoPromocion tipoPromocion) {
		this.tipoPromocion = tipoPromocion;
	}
	
	public void setAtracciones(Atraccion atraccion) {
		this.atracciones.add(atraccion);
	}
	
	public void setAtracciones(ArrayList<Atraccion> atracciones) {
		this.atracciones = atracciones;
	}
	//--------------------------------------------------------------------------
	
	// Getters
	//--------------------------------------------------------------------------
	public Integer getCostoPromocion() {
		return costoPromocion;
	}
	
	public String getNombrePromocion() {
		return nombrePromocion;
	}

	public TipoPromocion getTipoPromocion() {
		return tipoPromocion;
	}
	
	public ArrayList<Atraccion> getAtracciones() {
		return atracciones;
	}
	//--------------------------------------------------------------------------
	
	// Setters abstractos
	//--------------------------------------------------------------------------
	public abstract void setCostoPromocion(Integer costoPromocion);

	public abstract void setCostoPromocion();
	//--------------------------------------------------------------------------
}