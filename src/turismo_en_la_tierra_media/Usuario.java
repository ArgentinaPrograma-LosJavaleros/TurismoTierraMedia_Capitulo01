package turismo_en_la_tierra_media;

public class Usuario {

	private String nombreUsuario;
	private Integer cantidadMonedas;
	private Double tiempoDisponible;
	private Tematica preferenciaUsuario;

	// Constructores
	public Usuario(String nombreUsuario, Integer cantidadMonedas, Double tiempoDisponible,
			Tematica preferenciaUsuario) {
		setNombreUsuario(nombreUsuario);
		setCantidadMonedas(cantidadMonedas);
		setTiempoDisponible(tiempoDisponible);
		setPreferenciaUsuario(preferenciaUsuario);
	}
	
	public Usuario(String nombreUsuario) {
		this(nombreUsuario, null, null, null);
	}
	
	// Setters
	//--------------------------------------------------------------------------
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public void setCantidadMonedas(Integer cantidadMonedas) {
		this.cantidadMonedas = cantidadMonedas;
	}
	
	public void setTiempoDisponible(Double tiempoDisponible) {
		this.tiempoDisponible = tiempoDisponible;
	}
	
	public void setPreferenciaUsuario(Tematica preferenciaUsuario) {
		this.preferenciaUsuario = preferenciaUsuario;
	}
	//--------------------------------------------------------------------------
	
	// Getters
	//--------------------------------------------------------------------------
	public Tematica getPreferenciaUsuario() {
		return preferenciaUsuario;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public Double getTiempoDisponible() {
		return tiempoDisponible;
	}

	public Integer getCantidadMonedas() {
		return cantidadMonedas;
	}
	//--------------------------------------------------------------------------

	@Override
	public String toString() {
		System.out.printf("| Nombre = %-12s"
				        + "| Monedas = %-5d"
				        + "| Tiempo = %-5.1f"
				        + "| Preferencia = %-15s |", 
				        getNombreUsuario(), 
				        getCantidadMonedas(), 
				        getTiempoDisponible(), 
				        getPreferenciaUsuario());
		return "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreUsuario == null) ? 0 : nombreUsuario.hashCode());
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
		Usuario other = (Usuario) obj;
		if (nombreUsuario == null) {
			if (other.nombreUsuario != null)
				return false;
		} else if (!nombreUsuario.toLowerCase().equals(other.nombreUsuario.toLowerCase()))
			return false;
		return true;
	}

	
	
	
	
}
