package turismo_en_la_tierra_media;

import java.util.ArrayList;

public class PromoPorcentual extends Promocion {

	private Double porciento;
	private static final String PORCENTAJE_ERRONEO = "El porcentaje "
			+ "Ingresado NO ES VÁLIDO, debe ser escrito en el siguiente "
			+ "formato > 0.XX";

	public PromoPorcentual(String nombreAtraccion, Double porciento, ArrayList<Atraccion> atracciones) {
		super(nombreAtraccion, TipoPromocion.PORCENTUAL, 0, atracciones);
		this.setPorciento(porciento);
		this.setCostoPromocion();
	}

	public Double getPorciento() {
		return porciento;
	}

	public void setPorciento(Double porciento) {
		if(porciento < 0 || porciento > 1) throw new Error(PORCENTAJE_ERRONEO);
		this.porciento = porciento;
	}

	@Override
	public void setCostoPromocion() {
		double suma = 0.0;
		
		// Suma el costo de las atracciones
		for (Atraccion a : super.getAtracciones()) {
			suma += a.getCostoAtraccion();
		}
		
		// Redondea al máximo posible del costo de las atracciones por el descuento
		super.costoPromocion = (int) Math.ceil(suma - (suma * this.getPorciento())) ;
	}

	@Override
	public void setCostoPromocion(Integer costoPromocion) {}

	@Override
	public String toString() {
		System.out.printf("| Nombre = %-15s"
				        + "| Atracciones = %-40s"
				        + "| Descuento = %-36.2f"
				        + "| Precio Final = %-5d"
				        + "| Tipo = %-10s |", 
				        getNombrePromocion(),
				        getNombreAtracciones(),
				        getPorciento(),
				        getCostoPromocion(),
				        getTipoPromocion());		
		return "";
	}

}
