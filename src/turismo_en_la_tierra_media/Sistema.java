package turismo_en_la_tierra_media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Atraccion> atracciones;
	private ArrayList<Promocion> promociones;
	private static Usuario usuarioActual;
	private static final String RESPUESTA_SI = "SI";
	private static final String RESPUESTA_NO = "NO";

	// Setters
	// --------------------------------------------------------------------------
	public void setUsuarios(ArrayList<Usuario> _usuarios) {
		usuarios = _usuarios;
	}

	public void setAtracciones(ArrayList<Atraccion> atracciones) {
		this.atracciones = atracciones;
	}

	public void setPromociones(ArrayList<Promocion> promociones) {
		this.promociones = promociones;
	}
	
	public static boolean login(ArrayList<Usuario> usuarios, Usuario usuarioLogin) {
		try {			
			usuarioActual = usuarios.get(usuarios.indexOf(usuarioLogin));
		}catch(IndexOutOfBoundsException iobe) {
			System.out.println("El usuario actual no existe");
			return false;
		}
		return true;
	}
	
	// --------------------------------------------------------------------------

	// Getters
	// --------------------------------------------------------------------------
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public ArrayList<Atraccion> getAtracciones() {
		return atracciones;
	}

	public ArrayList<Promocion> getPromociones() {
		return promociones;
	}
	
	public static Usuario getUsuarioActual() {
		return usuarioActual;
	}
	// --------------------------------------------------------------------------

	public static void cargarOfertas(ArrayList<Promocion> listaPromociones,
			ArrayList<Atraccion> listaAtracciones) {
		Scanner ingreso = new Scanner(System.in);
		
		Usuario u = Sistema.getUsuarioActual();

		Tematica tematica = u.getPreferenciaUsuario();
		
		for (Promocion p : listaPromociones) {
			System.out.println("¿Desea comprar: " + p.getNombrePromocion() + "?");
			if (ingreso.next().toUpperCase().equals(RESPUESTA_SI)) {
				System.out.println("Acaba de comprar: " + p.getNombrePromocion());
				// Gasta dinero, tiempo, cupo (Atracciones)
			}
			System.out.println("¿Desea seguir?");
			if (ingreso.next().toUpperCase().equals(RESPUESTA_NO)) {
				System.out.println("Abandona for");
				break;
			}
		}
		for (Atraccion a : listaAtracciones) {
			System.out.println("¿Desea comprar: " + a.getNombreAtraccion() + "?");
			if (ingreso.next().toUpperCase().equals(RESPUESTA_SI)) {
				System.out.println("Acaba de comprar: " + a.getNombreAtraccion());
				// Gasta dinero, tiempo, cupo (Atracciones)
			}
			System.out.println("¿Desea seguir?");
			if (ingreso.next().toUpperCase().equals(RESPUESTA_NO)) {
				System.out.println("Abandona for");
				break;
			}
		}
		ingreso.close();
	}

	public static ArrayList<Atraccion> ordenarAtraccionSegunTematica(ArrayList<Atraccion> lista){
		
		Tematica tematica = Sistema.getUsuarioActual().getPreferenciaUsuario();

		ArrayList<Atraccion> a = new ArrayList<Atraccion>();
		for (Atraccion s : lista) {
			if(s.getTematica().equals(tematica))
				a.add(s);
			
		}
		
		lista.removeAll(a);
		a.addAll(lista);
		
		return a;
	}
	
	public static ArrayList<Promocion> ordenarPromocionSegunTematica(ArrayList<Promocion> lista){
		
		
		Tematica tematica = Sistema.getUsuarioActual().getPreferenciaUsuario();

		
		ArrayList<Promocion> a = new ArrayList<Promocion>();
		for (Promocion s : lista) {
			
			if(s.getAtracciones().get(0).getTematica().equals(tematica))
				a.add(s);
			
		}
		
		lista.removeAll(a);
		a.addAll(lista);
		return a;
	}
	
	public static void generarLista(String listaAImprimir) {
		if (listaAImprimir.toLowerCase().equals("usuarios")) {
			System.out.println(
					" _______________________________________________________________________________________ ");
			System.out.println(
					"|                                                                                       |");
			System.out.println(
					"|                                   LISTA DE USUARIOS                                   |");
			System.out.println(
					"|_______________________________________________________________________________________|");
			for (Usuario a : Archivo.cargarUsuarios()) {
				System.out.println(a);
				System.out.println(
						"|---------------------------------------------------------------------------------------|");
			}
			System.out.println(
					"!.......................................................................................!");
		} else if (listaAImprimir.toLowerCase().equals("atracciones")) {
			System.out.println(
					" _______________________________________________________________________________________________________________________");
			System.out.println(
					"|                                                                                                                       |");
			System.out.println(
					"|                                                   LISTA DE ATRACCIONES                                                |");
			System.out.println(
					"|_______________________________________________________________________________________________________________________|");
			for (Sugerible a : Archivo.cargarAtracciones()) {
				System.out.println(a);
				System.out.println(
						"|-----------------------------------------------------------------------------------------------------------------------|");
			}
			System.out.println(
					"!.......................................................................................................................!");
		} else if (listaAImprimir.toLowerCase().equals("promociones")) {
			System.out.println(
					" ______________________________________________________________________________________________________________________________________________________________________________________________________");
			System.out.println(
					"|                                                                                                                                                                                                      |");
			System.out.println(
					"|                                                                                              LISTA DE PROMOCIONES                                                                                    |");
			System.out.println(
					"|______________________________________________________________________________________________________________________________________________________________________________________________________|");
			for (Sugerible a : Archivo.cargarPromociones(Archivo.cargarAtracciones())) {
				System.out.println(a);
				System.out.println(
						"|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
			}
			System.out.println(
					"!......................................................................................................................................................................................................!");
		} else {
			throw new Error("¡¡¡La Lista a buscar NO EXISTE!!!");
		}
	}

//	public static void generarLista(ArrayList<Atraccion> listaAImprimir) {
//		System.out.println(
//				" _______________________________________________________________________________________________________________________");
//		System.out.println(
//				"|                                                                                                                       |");
//		System.out.println(
//				"|                                                   LISTA DE ATRACCIONES                                                |");
//		System.out.println(
//				"|_______________________________________________________________________________________________________________________|");
//		for (Atraccion a : listaAImprimir) {
//			System.out.println(a);
//			System.out.println(
//					"|-----------------------------------------------------------------------------------------------------------------------|");
//		}
//		System.out.println(
//				"!.......................................................................................................................!");
//
//	}
	
	public static void generarLista(ArrayList<Sugerible> listaAImprimir) {
		System.out.println(
				" ______________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println(
				"|                                                                                                                                                                                                      |");
		System.out.println(
				"|                                                                                              LISTA DE PROMOCIONES                                                                                    |");
		System.out.println(
				"|______________________________________________________________________________________________________________________________________________________________________________________________________|");
		for (Sugerible a : listaAImprimir) {
			System.out.println(a);
			System.out.println(
					"|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
		}
		System.out.println(
				"!......................................................................................................................................................................................................!");
	
	}
	
	
}
