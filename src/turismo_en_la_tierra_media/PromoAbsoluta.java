package turismo_en_la_tierra_media;

import java.util.ArrayList;

public class PromoAbsoluta extends Promocion {

	public PromoAbsoluta(String nombreAtraccion, Integer costoPromocion, ArrayList<Atraccion> atracciones) {
		super(nombreAtraccion, TipoPromocion.ABSOLUTA, 0, atracciones);
		this.setCostoAtraccion(costoPromocion);
	}

	@Override
	public void setCostoAtraccion(Integer costoPromocion) {
		super.costoPromocion = costoPromocion;
	}

	@Override
	public void setCostoAtraccion() {}

	@Override
	public String toString() {
		return "PromoAbsoluta [costoPromocion=" + costoPromocion + ", getNombreAtraccion()=" + getNombreAtraccion()
				+ ", getTipoPromocion()=" + getTipoPromocion() + ", getCostoAtraccion()=" + getCostoAtraccion()
				+ ", getAtracciones()=" + getAtracciones() + "]\n";
	}

	

	
}
