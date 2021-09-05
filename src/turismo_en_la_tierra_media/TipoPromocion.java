package turismo_en_la_tierra_media;

public enum TipoPromocion {
	PORCENTUAL,
	ABSOLUTA, 
	AXB; 
	
	public static TipoPromocion toPromocion(String nombre) throws NoExistePromocionException{
		nombre = nombre.toLowerCase();
		
		if(nombre.equals("porcentual"))
			return TipoPromocion.PORCENTUAL;
		if(nombre.equals("absoluta"))
			return TipoPromocion.ABSOLUTA;
		if(nombre.equals("axb"))
			return TipoPromocion.AXB;
		
		throw new NoExistePromocionException("El tipo de promocion \"" + nombre + "\" no existe!");
	}
}