package turismo_en_la_tierra_media;

public class Usuario {
	private String nombre_usuario;
	private Integer cantidad_monedas;
	private Double tiempo_disponible;
	private Tematica tematica_usuario;

	// Constructor
	public Usuario(String nombre_usuario, Integer cantidad_monedas, Double tiempo_disponible, Tematica tematica_usuario) {
		this.setNombre_usuario(nombre_usuario);
		this.setCantidad_monedas(cantidad_monedas);
		this.setTiempo_disponible(tiempo_disponible);
		this.setTematica_usuario(tematica_usuario);
	}

	// Setters
	// -------------------------------------------------------------------------
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public void setCantidad_monedas(Integer cantidad_monedas) {
		this.cantidad_monedas = cantidad_monedas;
	}

	public void setTiempo_disponible(Double tiempo_disponible) {
		this.tiempo_disponible = tiempo_disponible;
	}

	public void setTematica_usuario(Tematica tematica_usuario) {
		this.tematica_usuario = tematica_usuario;
	}
	// -------------------------------------------------------------------------

	// Getters
	// -------------------------------------------------------------------------
	public String getNombre_usuario() {
		return this.nombre_usuario;
	}

	public Integer getCantidad_monedas() {
		return this.cantidad_monedas;
	}

	public Double getTiempo_disponible() {
		return this.tiempo_disponible;
	}

	public Tematica getTematica_usuario() {
		return this.tematica_usuario;
	}
	// -------------------------------------------------------------------------
}
