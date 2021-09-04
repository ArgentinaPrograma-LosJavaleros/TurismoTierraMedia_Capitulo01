package turismo_en_la_tierra_media;

public class PromoAbsoluta extends Promocion {

	public PromoAbsoluta(String nombreAtraccion, Integer costoPromocion, Atraccion[] atracciones) {
		super(nombreAtraccion, TipoPromocion.ABSOLUTA, 0, atracciones);
		this.setCostoAtraccion(costoPromocion);
	}

	@Override
	public void setCostoAtraccion(Integer costoPromocion) {
		super.costoPromocion = costoPromocion;
	}

	@Override
	public void setCostoAtraccion() {}

}
