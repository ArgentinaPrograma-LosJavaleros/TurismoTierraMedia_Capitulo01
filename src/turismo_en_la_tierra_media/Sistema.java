package turismo_en_la_tierra_media;

import java.util.ArrayList;

public class Sistema {
	
	private ArrayList<Usuario> usuarios;
	private ArrayList<Atraccion> atracciones;
	private ArrayList<Promocion> promociones;
	
	// Setters
	//--------------------------------------------------------------------------
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void setAtracciones(ArrayList<Atraccion> atracciones) {
		this.atracciones = atracciones;
	}
	
	public void setPromociones(ArrayList<Promocion> promociones) {
		this.promociones = promociones;
	}
	//--------------------------------------------------------------------------
	
	// Getters
	//--------------------------------------------------------------------------
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public ArrayList<Atraccion> getAtracciones() {
		return atracciones;
	}
	
	public ArrayList<Promocion> getPromociones() {
		return promociones;
	}
	//--------------------------------------------------------------------------

	public static void generarLista(String listaAImprimir) {
		if(listaAImprimir.toLowerCase().equals("usuarios")) {
			System.out.println(" _______________________________________________________________________________________ ");
			System.out.println("|                                                                                       |");
			System.out.println("|                                   LISTA DE USUARIOS                                   |");
			System.out.println("|_______________________________________________________________________________________|");
			for (Usuario a : Archivo.cargarUsuario()) {
				System.out.println(a);
				System.out.println("|---------------------------------------------------------------------------------------|");
			}
			System.out.println("!.......................................................................................!");
		} else if (listaAImprimir.toLowerCase().equals("atracciones")) {	
			System.out.println(" _________________________________________________________________________________________________________________");
			System.out.println("|                                                                                                                 |");
			System.out.println("|                                               LISTA DE ATRACCIONES                                              |");
			System.out.println("|_________________________________________________________________________________________________________________|");
			for (Atraccion a : Archivo.cargarAtracciones()) {
				System.out.println(a);
				System.out.println("|-----------------------------------------------------------------------------------------------------------------|");
			}
			System.out.println("!.................................................................................................................!");
		} else if (listaAImprimir.toLowerCase().equals("promociones")) {
			System.out.println(" _____________________________________________________________________________________________________________________________________________________________________________");
			System.out.println("|                                                                                                                                                                             |");
			System.out.println("|                                                                            LISTA DE PROMOCIONES                                                                             |");
			System.out.println("|_____________________________________________________________________________________________________________________________________________________________________________|");
			for (Promocion a : Archivo.cargarPromociones(Archivo.cargarAtracciones())) {
				System.out.println(a);
				System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
			}
			System.out.println("!.............................................................................................................................................................................!");
		} else { throw new Error("¡¡¡La Lista a buscar NO EXISTE!!!"); }
	}
}
