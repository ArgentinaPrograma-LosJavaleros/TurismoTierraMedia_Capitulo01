package turismo_en_la_tierra_media;

import java.util.ArrayList;

public abstract class Promocion extends Sugerible {
	
	private TipoPromocion tipoPromocion;
	private ArrayList<Atraccion> atracciones;

	// Constructor
	public Promocion(String nombrePromocion, TipoPromocion tipoPromocion,
			ArrayList<Atraccion> atracciones) {
		setNombre(nombrePromocion);
		setTipoPromocion(tipoPromocion);
		setAtracciones(atracciones);
		this.costo = 0;
		setCosto();
		this.tiempo = 0.0;
		this.setTiempo();
	}

	// Setters
	//--------------------------------------------------------------------------
	public void setTipoPromocion(TipoPromocion tipoPromocion) {
		this.tipoPromocion = tipoPromocion;
	}
	
	public void setAtracciones(Atraccion atraccion) {
		this.atracciones.add(atraccion);
	}
	
	public void setAtracciones(ArrayList<Atraccion> atracciones) {
		this.atracciones = atracciones;
	}
	
	protected void setTiempo() {
		for(Atraccion a: this.getAtracciones())
			super.tiempo += a.getTiempo();
	}
	
	protected void setCosto() {
		// Suma el costo de las atracciones
		for (Atraccion a :	this.getAtracciones()) {
			super.setCosto(super.getCosto() + a.getCosto());
		}
	}
	//--------------------------------------------------------------------------
	
	// Getters
	//--------------------------------------------------------------------------
	
	public TipoPromocion getTipoPromocion() {
		return tipoPromocion;
	}
	
	public ArrayList<Atraccion> getAtracciones() {
		return atracciones;
	}
	
	public ArrayList<String> getNombreAtracciones() {
		ArrayList<String> lstNombreAtracciones = new ArrayList<String>();
		for (Atraccion a : this.getAtracciones())
			lstNombreAtracciones.add(a.getNombre());
		return lstNombreAtracciones;
	}
	
	@Override
	public Tematica getTematica() {
		return atracciones.get(0).getTematica();
	}
	//--------------------------------------------------------------------------
	
	@Override
	public int compareTo(Sugerible s) {
		Promocion p = (Promocion) s;

		if (this.costo < p.costo)
			return 1;
		
		if (this.costo > p.costo) {
			return -1;
		}
		
		if(this.tiempo > p.tiempo)
			return -1;
		
		if(this.tiempo < p.tiempo)
			return 1;
		
		return 0;
	}
}
