package turismo_en_la_tierra_media;

public class Promocion_precio_fijo extends Promocion {

	// Constructor
	public Promocion_precio_fijo(String nombre_atraccion, Double costo_promocion, Atraccion[] atracciones) {
		super(nombre_atraccion, Tipo_promocion.VALOR_FIJO, 0.0, atracciones);
		this.setCosto_promocion(costo_promocion);
	}

	// Setters
	// -------------------------------------------------------------------------
	@Override
	public void setCosto_promocion(Double costo_promocion) {
		super.costo_promocion = costo_promocion;
	}

	@Override
	public void setCosto_promocion() {
	}
	// -------------------------------------------------------------------------
}
