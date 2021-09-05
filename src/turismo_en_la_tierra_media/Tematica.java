package turismo_en_la_tierra_media;

public enum Tematica {
	AVENTURA("Aventura"), 
	DEGUSTACION("Desgutaci�n"), 
	PAISAJE("Paisaje"), 
	ENTRETENIMIENTO("Entretenimiento"),
	CARRERA("Carrera"), 
	EXTREMO("Extremo");

	private String nombre;

	private Tematica(String nombre) {
		this.nombre = nombre;
	}

	// Valida que las tem�ticas en el archivo concuerden con las de este enum.
	// Tira un error si una tem�tica en el archivo no corresponde con las del enum.
	public static Tematica toTematica(String nombre) throws NoExisteTematicaException {
		nombre = nombre.toLowerCase()
				.replace('�', 'a')
				.replace('�', 'e')
				.replace('�', 'i')
				.replace('�', 'o')
				.replace('�', 'u');

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