package turismo_en_la_tierra_media;

public class Usuario {

	private String nombreUsuario;
	private Integer cantidadMonedas;
	private Double tiempoDisponible;
	private Tematica preferenciaUsuario;

	// Constructor
	public Usuario(String nombreUsuario, Integer cantidadMonedas, Double tiempoDisponible,
			Tematica preferenciaUsuario) {
		setNombreUsuario(nombreUsuario);
		setCantidadMonedas(cantidadMonedas);
		setTiempoDisponible(tiempoDisponible);
		setPreferenciaUsuario(preferenciaUsuario);
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
				        getPreferenciaUsuario().getNombre());
		return "";
	}

}
