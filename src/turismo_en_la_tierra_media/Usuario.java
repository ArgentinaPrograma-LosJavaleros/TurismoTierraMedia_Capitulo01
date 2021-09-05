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
		setTematicaUsuario(preferenciaUsuario);
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
	
	public void setTematicaUsuario(Tematica preferenciaUsuario) {
		this.preferenciaUsuario = preferenciaUsuario;
	}
	//--------------------------------------------------------------------------
	
	// Getters
	//--------------------------------------------------------------------------
	public Tematica getTematicaUsuario() {
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
		return "Usuario [Nombre = " + nombreUsuario + " | Monedas = " + cantidadMonedas
				+ " | Tiempo = " + tiempoDisponible + " | Preferencia = " + preferenciaUsuario.getNombre()
				+ "]";
	}

}
