package turismo_en_la_tierra_media;

public class Atraccion {
	private String nombre_atraccion;
	private Double costo_atraccion;
	private Double tiempo_atraccion;
	private Integer cupo_usuarios;
	private Tematica tema_atraccion;

	
	public Atraccion(String nombre_atraccion, Double costo_atraccion, Double tiempo_atraccion, Integer cupo_usuarios,
			Tematica tema_atraccion) {
		this.nombre_atraccion = nombre_atraccion ;
		this.costo_atraccion = costo_atraccion;
		this.tiempo_atraccion = tiempo_atraccion;
		this.cupo_usuarios = cupo_usuarios;
		this.tema_atraccion = tema_atraccion;
	}

	public String getNombre_atraccion() {
		return nombre_atraccion;
	}

	public void setNombre_atraccion(String nombre_atraccion) {
		this.nombre_atraccion = nombre_atraccion;
	}

	public Double getCosto_atraccion() {
		return costo_atraccion;
	}

	public void setCosto_atraccion(Double costo_atraccion) {
		this.costo_atraccion = costo_atraccion;
	}

	public Double getTiempo_atraccion() {
		return tiempo_atraccion;
	}

	public void setTiempo_atraccion(Double tiempo_atraccion) {
		this.tiempo_atraccion = tiempo_atraccion;
	}

	public Integer getCupo_usuarios() {
		return cupo_usuarios;
	}

	public void setCupo_usuarios(Integer cupo_usuarios) {
		this.cupo_usuarios = cupo_usuarios;
	}

	public Tematica getTema_atraccion() {
		return tema_atraccion;
	}

	public void setTema_atraccion(Tematica tema_atraccion) {
		this.tema_atraccion = tema_atraccion;
	}
	
	

}
