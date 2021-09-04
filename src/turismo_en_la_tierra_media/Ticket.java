package turismo_en_la_tierra_media;

import java.util.List;

public class Ticket {
	private String comprador;
	private Integer monedasGastadas;
	private Integer tiempoGastado;
	private List<String> atraccionesReservadas;
	private List<String> promocionesReservadas;
	
	public String getComprador() {
		return comprador;
	}
	
	public void setComprador(String comprador) {
		this.comprador = comprador;
	}
	
	public Integer getMonedasGastadas() {
		return monedasGastadas;
	}
	
	public void setMonedasGastadas(Integer monedasGastadas) {
		this.monedasGastadas = monedasGastadas;
	}
	
	public Integer getTiempoGastado() {
		return tiempoGastado;
	}
	
	public void setTiempoGastado(Integer tiempoGastado) {
		this.tiempoGastado = tiempoGastado;
	}
	
	public List<String> getAtraccionesReservadas() {
		return atraccionesReservadas;
	}
	
	public void setAtraccionesReservadas(String atraccionesReservadas) {
		this.atraccionesReservadas.add(atraccionesReservadas);
	}
	
	public List<String> getPromocionesReservadas() {
		return promocionesReservadas;
	}
	
	public void setPromocionesReservadas(String promocionesReservadas) {
		this.promocionesReservadas.add(promocionesReservadas);
	}
	
}
