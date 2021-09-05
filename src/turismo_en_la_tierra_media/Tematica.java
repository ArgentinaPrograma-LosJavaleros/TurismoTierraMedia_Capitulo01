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

		if (nombre.equals("aventura"))
			return Tematica.AVENTURA;

		if (nombre.equals("degustacion"))
			return Tematica.DEGUSTACION;

		if (nombre.equals("paisaje"))
			return Tematica.PAISAJE;

		if (nombre.equals("entretenimiento"))
			return Tematica.ENTRETENIMIENTO;

		if (nombre.equals("carrera"))
			return Tematica.CARRERA;

		if (nombre.equals("extremo"))
			return Tematica.EXTREMO;

		throw new NoExisteTematicaException("La tematica \"" + nombre + "\" no existe!");
	}

	public String getNombre() {
		return this.nombre;
	}

}