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
	
	protected String mostrarBeneficio(Object obj) {
		double size = (double) ((58 - (double) ("Incluyen...").length()) / 2);
		System.out.println("|" + Sistema.repiteCaracteres("x", 58) + "|");
		System.out.println(generarDato(obj, "Beneficio:"));
		System.out.println("|" + Sistema.repiteCaracteres("x", 58) + "|");
		System.out.println("|" + Sistema.repiteCaracteres(" ", (int)Math.floor(size)) + "Incluyen..." + Sistema.repiteCaracteres(" ", (int)Math.ceil(size)) + "|");
		System.out.println("|" + Sistema.repiteCaracteres("_", 58) + "|");
		for(Atraccion a : getAtracciones())
			mostrarAtraccion(a);
		return "";
	}
	
	private String mostrarAtraccion(Atraccion atraccion) {
		String costo = "Costo: $" + atraccion.getCosto();		
		String tiempo = "Tiempo: " + atraccion.getTiempo() + "Hs";
		String cupo = "Cupo: " + atraccion.getCupoUsuarios();
		costo = costo.replace(" ", Sistema.repiteCaracteres(" ", 18 - costo.length()));
		tiempo = tiempo.replace(" ", Sistema.repiteCaracteres(" ", 19 - tiempo.length()));
		cupo = cupo.replace(" ", Sistema.repiteCaracteres(" ", 16 - cupo.length()));
		System.out.println(generarDato("", atraccion.getNombre()));
		System.out.println("| " + costo + " | " + tiempo + " | " + cupo + " |");
		System.out.println("|" + Sistema.repiteCaracteres("_", 58) + "|");
		return "";
	}
	
}
