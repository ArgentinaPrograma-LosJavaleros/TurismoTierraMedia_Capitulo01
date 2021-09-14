package turismo_en_la_tierra_media;

public abstract class Sugerible implements Comparable<Sugerible> {
	
	protected String nombre;
	protected Integer costo;
	protected Double tiempo;
	protected Tematica tematica; 
	
	public Tematica getTematica() {
		return tematica;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getCosto() {
		return costo;
	}

	public Double getTiempo() {
		return tiempo;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setCosto(Integer costo) {
		this.costo = costo;
	}

	protected void setTiempo(Double tiempo) {
		this.tiempo = tiempo;
	}

	protected void setTematica(Tematica tematica) {
		this.tematica = tematica;
	}
}
