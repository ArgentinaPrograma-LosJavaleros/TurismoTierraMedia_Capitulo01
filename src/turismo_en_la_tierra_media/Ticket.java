package turismo_en_la_tierra_media;

import java.util.List;

public class Ticket {
	
	private String comprador;
	private Integer monedasGastadas, tiempoGastado;
	private List<String> atraccionesReservadas, promocionesReservadas;
	
	public Ticket(String comprador, Integer monedasGastadas, Integer tiempoGastado, List<String> atraccionesReservadas,
			List<String> promocionesReservadas) {
		setComprador(comprador);
		setMonedasGastadas(monedasGastadas);
		setTiempoGastado(tiempoGastado);
		setAtraccionesReservadas(atraccionesReservadas);
		setPromocionesReservadas(promocionesReservadas);
	}

	// Setters
	//--------------------------------------------------------------------------
	public void setComprador(String comprador) {
		this.comprador = comprador;
	}
	
	public void setMonedasGastadas(Integer monedasGastadas) {
		this.monedasGastadas = monedasGastadas;
	}
	
	public void setTiempoGastado(Integer tiempoGastado) {
		this.tiempoGastado = tiempoGastado;
	}
	
	public void setPromocionesReservadas(String promocionesReservadas) {
		this.promocionesReservadas.add(promocionesReservadas);
	}
	
	public void setPromocionesReservadas(List<String> promocionesReservadas) {
		this.promocionesReservadas = promocionesReservadas;
	}
	
	public void setAtraccionesReservadas(String atraccionesReservadas) {
		this.atraccionesReservadas.add(atraccionesReservadas);
	}
	
	public void setAtraccionesReservadas(List<String> atraccionesReservadas) {
		this.atraccionesReservadas = atraccionesReservadas;
	}
	//--------------------------------------------------------------------------
	
	// Getters
	//--------------------------------------------------------------------------
	public String getComprador() {
		return comprador;
	}
	
	public Integer getMonedasGastadas() {
		return monedasGastadas;
	}
	
	public Integer getTiempoGastado() {
		return tiempoGastado;
	}
	
	public List<String> getAtraccionesReservadas() {
		return atraccionesReservadas;
	}
	
	public List<String> getPromocionesReservadas() {
		return promocionesReservadas;
	}
	//--------------------------------------------------------------------------

	@Override
	public String toString() {
		return "Ticket [Comprador = " + getComprador() + " | Monedas gastadas = " + getMonedasGastadas()
				+ " |  Tiempo gastado = " + getTiempoGastado() + " | Atracciones reservadas = "
				+ getAtraccionesReservadas() + " | Promociones reservadas = " + getPromocionesReservadas() + "]";
	}
}
