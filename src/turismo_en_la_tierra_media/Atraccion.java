package turismo_en_la_tierra_media;

public class Atraccion {
	private String nombreAtraccion; 
	private Integer costoAtraccion; 
	private Double tiempoAtraccion; 
	private Integer cupoUsuarios;
	private Tematica tematicaAtraccion;

	public Atraccion(String nombreAtraccion, Integer costoAtraccion, Double tiempoAtraccion, 
			         Integer cupoUsuarios, Tematica tematicaAtraccion) {
		this.nombreAtraccion = nombreAtraccion;
		this.costoAtraccion = costoAtraccion;
		this.tiempoAtraccion = tiempoAtraccion;
		this.cupoUsuarios = cupoUsuarios;
		this.tematicaAtraccion = tematicaAtraccion;
	}

	public String getNombreAtraccion() {
		return nombreAtraccion;
	}
	
	public void setNombreAtraccion(String nombreAtraccion) {
		this.nombreAtraccion = nombreAtraccion;
	}

	public Integer getCostoAtraccion() {
		return costoAtraccion;
	}
	
	public void setCostoAtraccion(Integer costoAtraccion) {
		this.costoAtraccion = costoAtraccion;
	}

	public Double getTiempoAtraccion() {
		return tiempoAtraccion;
	}
	
	public void setTiempoAtraccion(Double tiempoAtraccion) {
		this.tiempoAtraccion = tiempoAtraccion;
	}

	public Integer getCupoUsuarios() {
		return cupoUsuarios;
	}

	public void setCupoUsuarios(Integer cupoUsuarios) {
		this.cupoUsuarios = cupoUsuarios;
	}

	public Tematica getTematicaAtraccion() {
		return tematicaAtraccion;
	}

	public void setTematicaAtraccion(Tematica tematicaAtraccion) {
		this.tematicaAtraccion = tematicaAtraccion;
	}

}
