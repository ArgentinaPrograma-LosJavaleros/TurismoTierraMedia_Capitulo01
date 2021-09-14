package turismo_en_la_tierra_media;

public abstract class Sugerible implements Comparable<Sugerible> {
	
	protected String nombre;
	protected Integer costo;
	protected Double tiempo;
	protected Tematica tematica; 
	
	public Tematica getTematica() {
		return tematica;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getCosto() {
		return costo;
	}

	public Double getTiempo() {
		return tiempo;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setCosto(Integer costo) {
		this.costo = costo;
	}

	protected void setTiempo(Double tiempo) {
		this.tiempo = tiempo;
	}

	protected void setTematica(Tematica tematica) {
		this.tematica = tematica;
	}
	
	@Override
	public String toString() {
		int size = (50 - getNombre().length()) / 2;
		String format = "%" + size + "c%-" + size + "s";
			
		
		
		System.out.println(" ______________________________________________");
		System.out.println("|                                              |");
		System.out.printf(format + "\n",' ', getNombre());
		System.out.println("|______________________________________________|");
//		System.out.println("|                                              |");
//		System.out.printf( "|Comprador/a %34s|\n", getComprador());
//		System.out.println("|                                              |");
//		System.out.printf( "|Monedas Gastadas %29s|\n", getMonedasGastadas());
//		System.out.println("|                                              |");
//		System.out.printf( "|Tiempo Gastado  %30s|\n", getTiempoGastado());
//		System.out.println("|                                              |");
//		System.out.println("|::::::::::::::::::::::::::::::::::::::::::::::|");
//		System.out.println("|Promociones Reservadas:                       |");
//		for (String p : getPromocionesReservadas())
//			System.out.printf( "|%46s|\n", p);
//		System.out.println("|Costo: xxx| Tiempo: xxx |                        |");
//		for (String a : getAtraccionesReservadas())
//			System.out.printf( "|%46s|\n", a);
//		System.out.println("|                                              |");
//		System.out.println("|                                              |");
//		System.out.println("|                                              |");
//		System.out.println("|______________________________________________|");
		
		return "";
		
	}
	
}
