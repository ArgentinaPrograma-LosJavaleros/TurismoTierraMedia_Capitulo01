package turismo_en_la_tierra_media;

import java.util.ArrayList;

public abstract class Promocion extends Sugerible {

	private String nombrePromocion;
	private TipoPromocion tipoPromocion;
	protected Integer costoPromocion;
	private ArrayList<Atraccion> atracciones;
	private Double tiempo;
	

	// Constructor
	public Promocion(String nombrePromocion, TipoPromocion tipoPromocion, Integer costoPromocion,
			ArrayList<Atraccion> atracciones) {
		setNombrePromocion(nombrePromocion);
		setTipoPromocion(tipoPromocion);
		this.costoPromocion = costoPromocion;
		setAtracciones(atracciones);
		this.tiempo = 0.0;
		this.setTiempo();
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
	
	private void setTiempo() {
		for(Atraccion a: this.getAtracciones())
			this.tiempo += a.getTiempoAtraccion();
		
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
	
	public ArrayList<String> getNombreAtracciones() {
		ArrayList<String> lstNombreAtracciones = new ArrayList<String>();
		for (Atraccion a : this.getAtracciones())
			lstNombreAtracciones.add(a.getNombreAtraccion());
		return lstNombreAtracciones;
	}
	
	public Double getTiempo() {
		return this.tiempo;
	}
	
	@Override
	public Tematica getTematica() {
		return atracciones.get(0).getTematica();
	}
	//--------------------------------------------------------------------------
	
	// Setters abstractos
	//--------------------------------------------------------------------------
	public abstract void setCostoPromocion(Integer costoPromocion);

	public abstract void setCostoPromocion();
	//--------------------------------------------------------------------------
	
	@Override
	public int compareTo(Sugerible s) {
		Promocion p = (Promocion) s;

		if (this.costoPromocion < p.costoPromocion)
			return 1;
		
		if (this.costoPromocion > p.costoPromocion) {
			return -1;
		}
		
		if(this.tiempo > p.tiempo)
			return -1;
		
		if(this.tiempo < p.tiempo)
			return 1;
		
		return 0;
	}
}
