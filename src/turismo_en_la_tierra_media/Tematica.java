package turismo_en_la_tierra_media;

public enum Tematica {
	AVENTURA("Aventura"), 
	DEGUSTACION("Desgutación"), 
	PAISAJE("Paisaje"), 
	ENTRETENIMIENTO("Entretenimiento"),
	CARRERA("Carrera"), 
	EXTREMO("Extremo");

	private String nombre;

	private Tematica(String nombre) {
		this.nombre = nombre;
	}

	// Valida que las temáticas en el archivo concuerden con las de este enum.
	// Tira un error si una temática en el archivo no corresponde con las del enum.
	public static Tematica toTematica(String nombre) throws NoExisteTematicaException {
		nombre = nombre.toLowerCase()
				.replace('á', 'a')
				.replace('é', 'e')
				.replace('í', 'i')
				.replace('ó', 'o')
				.replace('ú', 'u');
		
		return Tematica.valueOf(nombre.toUpperCase());
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}

}