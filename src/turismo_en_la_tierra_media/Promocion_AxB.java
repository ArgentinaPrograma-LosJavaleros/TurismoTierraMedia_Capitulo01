package turismo_en_la_tierra_media;

public class Promocion_AxB extends Promocion {
private Atraccion atraccion_gratis;
	
	public Atraccion getAtraccion_gratis() {
	return atraccion_gratis;
}



public void setAtraccion_gratis(Atraccion atraccion_gratis) {
	this.atraccion_gratis = atraccion_gratis;
}



	public Promocion_AxB(String nombre_atraccion,  Double costo_atraccion,
			Atraccion[] atracciones) {
		super(nombre_atraccion, Tipo_promocion.AXB , 0.0 , atracciones);
		this.setCosto_atraccion();
	
	}

	

	@Override
	public void setCosto_atraccion(Double costo_atraccion) {
		
		super.costo_atraccion=costo_atraccion;
	}



	@Override
	public void setCosto_atraccion() {
		Double suma= 0.0;
		for (Atraccion a: super.getAtracciones() ) {
		suma+=a.getCosto_atraccion();
		}
		super.costo_atraccion=suma;
	}
	

	
	
}
