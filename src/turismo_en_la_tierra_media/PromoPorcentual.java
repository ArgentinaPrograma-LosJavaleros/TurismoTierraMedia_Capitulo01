package turismo_en_la_tierra_media;

import java.util.ArrayList;

public class PromoPorcentual extends Promocion {

	private Double porciento;

	public PromoPorcentual(String nombreAtraccion, Double porciento, ArrayList<Atraccion> atracciones) {
		super(nombreAtraccion, TipoPromocion.PORCENTUAL, 0, atracciones);
		this.setPorciento(porciento);
		this.setCostoAtraccion();
	}

	public Double getPorciento() {
		return porciento;
	}

	public void setPorciento(Double porciento) {
		this.porciento = porciento;
	}

	@Override
	public void setCostoAtraccion() {
		double suma = 0.0;
		for (Atraccion a : super.getAtracciones()) {
			suma += a.getCostoAtraccion();
		}
		super.costoPromocion = (int) Math.ceil(suma * this.getPorciento()) ;
	}

	@Override
	public void setCostoAtraccion(Integer costoPromocion) {}

	@Override
	public String toString() {
		return "PromoPorcentual [porciento=" + porciento + ", costoPromocion=" + costoPromocion
				+ ", getNombreAtraccion()=" + getNombreAtraccion() + ", getTipoPromocion()=" + getTipoPromocion()
				+ ", getCostoAtraccion()=" + getCostoAtraccion() + ", getAtracciones()=" + getAtracciones() + "]\n";
	}

}
