package turismo_en_la_tierra_media;

public class Promocion_AxB extends Promocion {

	private Atraccion atraccion_gratis;

	// Constructor
	public Promocion_AxB(String nombre_atraccion, Double costo_promocion, Atraccion[] atracciones) {
		super(nombre_atraccion, Tipo_promocion.AXB, 0.0, atracciones);
		this.setCosto_promocion();
	}

	// Setters
	// -------------------------------------------------------------------------
	public void setAtraccion_gratis(Atraccion atraccion_gratis) {
		this.atraccion_gratis = atraccion_gratis;
	}

	@Override
	public void setCosto_promocion(Double costo_promocion) {
		super.costo_promocion = costo_promocion;
	}

	@Override
	public void setCosto_promocion() {
		Double suma = 0.0;

		// Se suman los costos de las atracciones incluídas en la promoción
		for (Atraccion a : super.getAtracciones()) {
			suma += a.getCosto_atraccion();
		}

		// Se multiplican los precios por el porcentaje de la promoción.
		super.costo_promocion = suma;
	}

	// Getters
	// -------------------------------------------------------------------------
	public Atraccion getAtraccion_gratis() {
		return atraccion_gratis;
	}
	// -------------------------------------------------------------------------
}
