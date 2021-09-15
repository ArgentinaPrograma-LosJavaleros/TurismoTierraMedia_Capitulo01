package turismo_en_la_tierra_media;

import java.util.ArrayList;

public class PromoPorcentual extends Promocion {

	private Double porciento;
	private static final String PORCENTAJE_ERRONEO = "El porcentaje "
			+ "Ingresado NO ES V�LIDO, debe ser escrito en el siguiente " + "formato > 0.XX";

	public PromoPorcentual(String nombreAtraccion, Double porciento, ArrayList<Atraccion> atracciones) {
		super(nombreAtraccion, TipoPromocion.PORCENTUAL, atracciones);
		this.setPorciento(porciento);
		super.costo = (int) Math.ceil(super.getCosto() - (super.getCosto() * this.getPorciento()));
	}

	public Double getPorciento() {
		return porciento;
	}

	public void setPorciento(Double porciento) {
		if (porciento < 0 || porciento > 1)
			throw new Error(PORCENTAJE_ERRONEO);
		this.porciento = porciento;
	}

	@Override
	public String toString() {
		System.out.printf("| Nombre = %-30s" 
	                     + "| Atracciones = %-50s" 
				         + "| Descuento = %-36.2f" 
	                     + "| Precio Final = %-5d"
						 + "| Tem�tica = %-15s |",
				         super.getNombre(), 
				         getNombreAtracciones(), 
				         getPorciento(), 
				         super.getCosto(),
				         getTematica());
		return "";
	}

	@Override
	public String mostrarSugerible() {
		super.mostrarSugerible();
		mostrarBeneficio("%" + (int)(getPorciento() * 100) + " OFF");
		return "";
	}
	
}
