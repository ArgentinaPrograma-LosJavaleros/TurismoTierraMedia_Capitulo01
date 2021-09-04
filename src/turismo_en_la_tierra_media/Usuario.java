package turismo_en_la_tierra_media;

public class Usuario {
	private String nombreUsuario;
	private Integer cantidadMonedas;
	private Double tiempoDisponible;
	private Tematica preferenciaUsuario;

	public Usuario(String nombreUsuario, Integer cantidadMonedas, 
			       Double tiempoDisponible, Tematica preferenciaUsuario) {
		this.nombreUsuario = nombreUsuario;
		this.cantidadMonedas = cantidadMonedas;
		this.tiempoDisponible = tiempoDisponible;
		this.preferenciaUsuario = preferenciaUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Integer getCantidadMonedas() {
		return cantidadMonedas;
	}

	public void setCantidadMonedas(Integer cantidadMonedas) {
		this.cantidadMonedas = cantidadMonedas;
	}

	public Double getTiempoDisponible() {
		return tiempoDisponible;
	}

	public void setTiempoDisponible(Double tiempoDisponible) {
		this.tiempoDisponible = tiempoDisponible;
	}

	public Tematica getTematicaUsuario() {
		return preferenciaUsuario;
	}

	public void setTematicaUsuario(Tematica preferenciaUsuario) {
		this.preferenciaUsuario = preferenciaUsuario;
	}

}
