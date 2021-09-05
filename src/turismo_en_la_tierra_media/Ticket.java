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
		
		System.out.println(" ______________________________________________");
		System.out.println("|                                              |");
		System.out.println("|           TURISMO EN LA TIERRA MEDIA         |");
		System.out.println("|               TICKET DE ACCESO               |");
		System.out.println("|______________________________________________|");
		System.out.println("|                                              |");
		System.out.printf( "|Comprador/a %34s|\n", getComprador());
		System.out.println("|                                              |");
		System.out.printf( "|Monedas Gastadas %29s|\n", getMonedasGastadas());
		System.out.println("|                                              |");
		System.out.printf( "|Tiempo Gastado  %30s|\n", getTiempoGastado());
		System.out.println("|                                              |");
		System.out.println("|::::::::::::::::::::::::::::::::::::::::::::::|");
		System.out.println("|Promociones Reservadas:                       |");
		for (String p : getPromocionesReservadas())
			System.out.printf( "|%46s|\n", p);
		System.out.println("|Atracciones Reservadas:                       |");
		for (String a : getAtraccionesReservadas())
			System.out.printf( "|%46s|\n", a);
		System.out.println("|                                              |");
		System.out.println("|                                              |");
		System.out.println("|        ¡MUCHAS GRACIAS POR SU COMPRA!        |");
		System.out.println("|                                              |");
		System.out.println("|______________________________________________|");
		
		return "";
		
	}
}
