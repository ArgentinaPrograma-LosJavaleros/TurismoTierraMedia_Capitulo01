package turismo_en_la_tierra_media;

import java.util.ArrayList;

public class PromoAbsoluta extends Promocion {

	// Constructor
	public PromoAbsoluta(String nombreAtraccion, Integer costoPromocion, ArrayList<Atraccion> atracciones) {
		super(nombreAtraccion, TipoPromocion.ABSOLUTA, 0, atracciones);
		this.setCostoPromocion(costoPromocion);
	}

	// Setters
	//--------------------------------------------------------------------------
	@Override
	public void setCostoPromocion(Integer costoPromocion) {
		super.costoPromocion = costoPromocion;
	}

	@Override
	public void setCostoPromocion() {}
	//--------------------------------------------------------------------------

	@Override
	public String toString() {
		return "Promo Absoluta [Costo = " + getCostoPromocion() + " | Nombre = " + getNombrePromocion() + " | Tipo = "
				+ getTipoPromocion() + " | Costo = " + getCostoPromocion() + " | Atracciones = " + getAtracciones()
				+ "]";
	}

}
