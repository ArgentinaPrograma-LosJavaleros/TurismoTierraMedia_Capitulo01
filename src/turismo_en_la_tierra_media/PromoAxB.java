package turismo_en_la_tierra_media;

import java.util.ArrayList;
 
public class PromoAxB extends Promocion {

	private Atraccion atraccionGratis;

	// Constructor
	public PromoAxB(String nombreAtraccion, Atraccion atraccionGratis, ArrayList<Atraccion> atracciones) {
		super(nombreAtraccion, TipoPromocion.AXB, 0, atracciones);
		this.setCostoPromocion();
		this.setAtraccionGratis(atraccionGratis);
	}

	// Setters
	//--------------------------------------------------------------------------
	public void setAtraccionGratis(Atraccion atraccionGratis) {
		this.atraccionGratis = atraccionGratis;
	}

	@Override
	public void setCostoPromocion(Integer costoPromocion) {
		super.costoPromocion = costoPromocion;
	}

	@Override
	public void setCostoPromocion() {
		double suma = 0.0;
		
		// Suma el costo de las atracciones
		for (Atraccion a : super.getAtracciones()) {
			suma += a.getCostoAtraccion();
		}
		
		// Redondea al mayor posible
		super.costoPromocion = (int) Math.ceil(suma);
	}
	//--------------------------------------------------------------------------
	
	// Getters
	//--------------------------------------------------------------------------
	public Atraccion getAtraccionGratis() {
		return atraccionGratis;
	}
	//--------------------------------------------------------------------------

	@Override
	public String toString() {
		
		System.out.printf("| Nombre = %-30s"
                        + "| Atracciones = %-50s"
                        + "| Atracción gratis = %-29s"
                        + "| Precio Final = %-5d"
                        + "| Tipo = %-10s |", 
                        getNombrePromocion(),
                        getNombreAtracciones(),
                        getAtraccionGratis().getNombreAtraccion(),
                        getCostoPromocion(),
                        getTipoPromocion());
		return "";
	}

}
