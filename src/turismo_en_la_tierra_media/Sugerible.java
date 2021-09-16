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
	
	protected String generarDato(Object obj, String str) {
		int size = 58 - (str + obj.toString()).length();
		return "|" + str + Sistema.repiteCaracteres(" ", (int)size) + obj + "|";
	}
	
	public String mostrarSugerible() {
		double size = (double) ((58 - (double) getNombre().length()) / 2);
		System.out.println(" " + Sistema.repiteCaracteres("_", 58) + " ");
		System.out.println("|" + Sistema.repiteCaracteres(" ", 58) + "|");
		System.out.println("|" + Sistema.repiteCaracteres(" ", (int)Math.floor(size)) + getNombre() + Sistema.repiteCaracteres(" ", (int)Math.ceil(size)) + "|");
		System.out.println("|" + Sistema.repiteCaracteres("_", 58) + "|");
		System.out.println(generarDato("$" + getCosto(), "Costo:"));
		System.out.println(generarDato(getTiempo() + "Hs", "Tiempo:"));
		System.out.println(generarDato(getTematica(), "Temática:"));
		System.out.println("|" + Sistema.repiteCaracteres("_", 58) + "|");
		return "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((tematica == null) ? 0 : tematica.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sugerible other = (Sugerible) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tematica != other.tematica)
			return false;
		return true;
	}
	
}
