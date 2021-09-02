package turismo_en_la_tierra_media;

public class Promocion_porcentual extends Promocion {

	private Double porciento;
	public Promocion_porcentual(String nombre_atraccion,  Double porciento ,
			Atraccion[] atracciones) {
		super(nombre_atraccion, Tipo_promocion.PORCENTAJE , 0.0, atracciones);
		this.setPorciento(porciento);
		this.setCosto_atraccion();
	
	}

	

	public Double getPorciento() {
		return porciento;
	}



	public void setPorciento(Double porciento) {
		this.porciento = porciento;
	}



	@Override
	public void setCosto_atraccion() {
		Double suma= 0.0;
		for (Atraccion a: super.getAtracciones() ) {
		suma+=a.getCosto_atraccion();
		}
		super.costo_atraccion=suma *  this.getPorciento();
	}



	@Override
	public void setCosto_atraccion(Double costo_atraccion) {
		// TODO Auto-generated method stub
		
	}
		
	

	
	
}
