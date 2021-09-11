package turismo_en_la_tierra_media;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	
	private ArrayList<Usuario> usuarios;
	private ArrayList<Atraccion> atracciones;
	private ArrayList<Promocion> promociones;
	private static final String RESPUESTA_SI = "SI";
	private static final String RESPUESTA_NO = "NO";
	
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
	
	public static boolean validarUsuario(ArrayList<Usuario> listaUsuarios, String nombreUsuario) {
		Usuario usuarioEncontrado = null;
		for (Usuario u : listaUsuarios)
			if(nombreUsuario.toLowerCase().equals(u.getNombreUsuario().toLowerCase())) {
				usuarioEncontrado = u;
			}
		return listaUsuarios.contains(usuarioEncontrado);
	}
	
	public static void cargarOfertas(Usuario usuario, ArrayList<Promocion> listaPromociones, 
			                         ArrayList<Atraccion> listaAtracciones) {
		Scanner ingreso = new Scanner(System.in);
		
		for (Promocion p : listaPromociones) {
			System.out.println("¿Desea comprar: " + p.getNombrePromocion() + "?");
			if(ingreso.next().toUpperCase().equals(RESPUESTA_SI)) {
				System.out.println("Acaba de comprar: " + p.getNombrePromocion());
				// Gasta dinero, tiempo, cupo (Atracciones)
			}	
			System.out.println("¿Desea seguir?");
			if(ingreso.next().toUpperCase().equals(RESPUESTA_NO)) {
				System.out.println("Abandona for");
				break;
			}
		}
		for (Atraccion a : listaAtracciones) {
			System.out.println("¿Desea comprar: " + a.getNombreAtraccion() + "?");
			if(ingreso.next().toUpperCase().equals(RESPUESTA_SI)) {
				System.out.println("Acaba de comprar: " + a.getNombreAtraccion());
				// Gasta dinero, tiempo, cupo (Atracciones)
			}	
			System.out.println("¿Desea seguir?");
			if(ingreso.next().toUpperCase().equals(RESPUESTA_NO)) {
				System.out.println("Abandona for");
				break;
			}
		}
		ingreso.close();
	}

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
			System.out.println(" _______________________________________________________________________________________________________________________");
			System.out.println("|                                                                                                                       |");
			System.out.println("|                                                   LISTA DE ATRACCIONES                                                |");
			System.out.println("|_______________________________________________________________________________________________________________________|");
			for (Atraccion a : Archivo.cargarAtracciones()) {
				System.out.println(a);
				System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
			}
			System.out.println("!.......................................................................................................................!");
		} else if (listaAImprimir.toLowerCase().equals("promociones")) {
			System.out.println(" ______________________________________________________________________________________________________________________________________________________________________________________________________");
			System.out.println("|                                                                                                                                                                                                      |");
			System.out.println("|                                                                                              LISTA DE PROMOCIONES                                                                                    |");
			System.out.println("|______________________________________________________________________________________________________________________________________________________________________________________________________|");
			for (Promocion a : Archivo.cargarPromociones(Archivo.cargarAtracciones())) {
				System.out.println(a);
				System.out.println("|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
			}
			System.out.println("!......................................................................................................................................................................................................!");
		} else { throw new Error("¡¡¡La Lista a buscar NO EXISTE!!!"); }
	}
}
