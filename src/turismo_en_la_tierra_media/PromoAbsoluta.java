package turismo_en_la_tierra_media;

import java.util.ArrayList;

public class PromoAbsoluta extends Promocion {

	// Constructor
	public PromoAbsoluta(String nombreAtraccion, Integer costoPromocion, ArrayList<Atraccion> atracciones) {
		super(nombreAtraccion, TipoPromocion.ABSOLUTA, atracciones);
		super.setCosto(costoPromocion);
	}
	
	// Getter
	//----------------------------------------------
	public Integer getCostoAnterior() {
		double suma = 0.0;
		for (Atraccion a : super.getAtracciones()) {
			suma += a.getCosto();
		}
		return (int) Math.ceil(suma);
	}

	@Override
	public String toString() {

		System.out.printf("| Nombre = %-30s"
		                + "| Atracciones = %-50s"
		                + "| Costo Anterior = %-31d"
		                + "| Precio Final = %-5d"
		                + "| Tipo = %-10s |", 
		                super.getNombre(),
		                getNombreAtracciones(),
		                getCostoAnterior(),
		                super.getCosto(),
		                getTipoPromocion());
		return "";
	}

}
