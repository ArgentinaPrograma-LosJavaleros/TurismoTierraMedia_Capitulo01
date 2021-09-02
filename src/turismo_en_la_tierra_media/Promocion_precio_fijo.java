package turismo_en_la_tierra_media;

public class Promocion_precio_fijo extends Promocion {

	public Promocion_precio_fijo(String nombre_atraccion,  Double costo_atraccion,
			Atraccion[] atracciones) {
		super(nombre_atraccion, Tipo_promocion.VALOR_FIJO , 0.0 , atracciones);
		this.setCosto_atraccion(costo_atraccion);
	
	}

	

	@Override
	public void setCosto_atraccion(Double costo_atraccion) {
		super.costo_atraccion=costo_atraccion;
	}



	@Override
	public void setCosto_atraccion() {
		// TODO Auto-generated method stub
		
	}
	

	
	
}
