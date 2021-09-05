package turismo_en_la_tierra_media;

import java.util.ArrayList;

public class PromoAxB extends Promocion {
	private Atraccion atraccionGratis;

	public Atraccion getAtraccionGratis() {
		return atraccionGratis;
	}

	public void setAtraccionGratis(Atraccion atraccionGratis) {
		this.atraccionGratis = atraccionGratis;
	}

	public PromoAxB(String nombreAtraccion, Integer costoPromocion, ArrayList<Atraccion> atracciones) {
		super(nombreAtraccion, TipoPromocion.AXB, 0, atracciones);
		this.setCostoAtraccion();
	}

	@Override
	public void setCostoAtraccion(Integer costoPromocion) {
		super.costoPromocion = costoPromocion;
	}

	@Override
	public void setCostoAtraccion() {
		double suma = 0.0;
		for (Atraccion a : super.getAtracciones()) {
			suma += a.getCostoAtraccion();
		}
		super.costoPromocion = (int) Math.ceil(suma);
	}

	@Override
	public String toString() {
		return "PromoAxB [atraccionGratis=" + atraccionGratis + ", costoPromocion=" + costoPromocion
				+ ", getNombreAtraccion()=" + getNombreAtraccion() + ", getTipoPromocion()=" + getTipoPromocion()
				+ ", getCostoAtraccion()=" + getCostoAtraccion() + ", getAtracciones()=" + getAtracciones() + "]\n";
	}
	
	
}
