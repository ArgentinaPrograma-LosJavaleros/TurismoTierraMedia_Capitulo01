package turismo_en_la_tierra_media;

public class Promocion_porcentual extends Promocion {

	private Double porciento;

	// Constructor
	public Promocion_porcentual(String nombre_atraccion, Double porciento, Atraccion[] atracciones) {
		super(nombre_atraccion, Tipo_promocion.PORCENTAJE, 0.0, atracciones);
		this.setPorciento(porciento);
		this.setCosto_promocion();
	}

	// Setters
	// -------------------------------------------------------------------------
	public void setPorciento(Double porciento) {
		this.porciento = porciento;
	}

	@Override
	public void setCosto_promocion() {
		Double suma = 0.0;

		// Se suman los costos de las atracciones incluídas en la promoción
		for (Atraccion a : super.getAtracciones()) {
			suma += a.getCosto_atraccion();
		}

		// Se multiplican los precios por el porcentaje de la promoción.
		super.costo_promocion = suma * this.getPorciento();
	}

	@Override
	public void setCosto_promocion(Double costo_promocion) {
	}
	// -------------------------------------------------------------------------

	// Getters
	// -------------------------------------------------------------------------
	public Double getPorciento() {
		return porciento;
	}
	// -------------------------------------------------------------------------
}
