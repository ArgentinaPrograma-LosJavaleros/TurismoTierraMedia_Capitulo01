package turismo_en_la_tierra_media;

public class Usuario {
	private String nombre_usuario;
	private Integer cantidad_monedas;
	private Double tiempo_disponible;
	private Tematica tematica_usuario;

	
	
	public Usuario(String nombre_usuario, Integer cantidad_monedas, Double tiempo_disponible,
			Tematica tematica_usuario) {
		this.nombre_usuario = nombre_usuario;
		this.cantidad_monedas = cantidad_monedas;
		this.tiempo_disponible = tiempo_disponible;
		this.tematica_usuario = tematica_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public Integer getCantidad_monedas() {
		return cantidad_monedas;
	}

	public void setCantidad_monedas(Integer cantidad_monedas) {
		this.cantidad_monedas = cantidad_monedas;
	}

	public Double getTiempo_disponible() {
		return tiempo_disponible;
	}

	public void setTiempo_disponible(Double tiempo_disponible) {
		this.tiempo_disponible = tiempo_disponible;
	}

	public Tematica getTematica_usuario() {
		return tematica_usuario;
	}

	public void setTematica_usuario(Tematica tematica_usuario) {
		this.tematica_usuario = tematica_usuario;
	}

}
