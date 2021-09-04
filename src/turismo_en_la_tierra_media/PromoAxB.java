package turismo_en_la_tierra_media;

public class PromoAxB extends Promocion {
	private Atraccion atraccionGratis;

	public Atraccion getAtraccionGratis() {
		return atraccionGratis;
	}

	public void setAtraccionGratis(Atraccion atraccionGratis) {
		this.atraccionGratis = atraccionGratis;
	}

	public PromoAxB(String nombreAtraccion, Integer costoPromocion, Atraccion[] atracciones) {
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

}
