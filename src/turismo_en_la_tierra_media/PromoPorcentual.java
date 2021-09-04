package turismo_en_la_tierra_media;

public class PromoPorcentual extends Promocion {

	private Double porciento;

	public PromoPorcentual(String nombreAtraccion, Double porciento, Atraccion[] atracciones) {
		super(nombreAtraccion, TipoPromocion.PORCENTUAL, 0.0, atracciones);
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
		Double suma = 0.0;
		for (Atraccion a : super.getAtracciones()) {
			suma += a.getCostoAtraccion();
		}
		super.costoPromocion = suma * this.getPorciento();
	}

	@Override
	public void setCostoAtraccion(Double costoPromocion) {}

}
