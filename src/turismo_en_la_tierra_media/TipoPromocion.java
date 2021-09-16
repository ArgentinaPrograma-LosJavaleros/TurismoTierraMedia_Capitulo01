package turismo_en_la_tierra_media;

public enum TipoPromocion {
	PORCENTUAL,
	ABSOLUTA, 
	AXB; 
	
	// // Valida que las promociones en el archivo concuerden con las de este enum.
	// Tira un error si una promoción en el archivo no corresponde con las del enum.
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