package turismo_en_la_tierra_media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

	private static ArrayList<Usuario> usuarios;
	private static ArrayList<Atraccion> atracciones;
	private static ArrayList<Promocion> promociones;
	private static Usuario usuarioActual;
	private static final String RESPUESTA_SI = "SI";
	private static final String RESPUESTA_NO = "NO";

	// Setters
	// --------------------------------------------------------------------------
	public static void setUsuarios(ArrayList<Usuario> _usuarios) {
		usuarios = _usuarios;
	}

	public static void setAtracciones(ArrayList<Atraccion> _atracciones) {
		atracciones = _atracciones;
	}

	public static void setPromociones(ArrayList<Promocion> _promociones) {
		promociones = _promociones;
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
	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public static ArrayList<Atraccion> getAtracciones() {
		return atracciones;
	}

	public static ArrayList<Promocion> getPromociones() {
		return promociones;
	}
	
	public static Usuario getUsuarioActual() {
		return usuarioActual;
	}
	// --------------------------------------------------------------------------

	public static void cargarOfertas() {
		Scanner ingreso = new Scanner(System.in);
		
		Usuario u = Sistema.getUsuarioActual();

		Ticket ticket = new Ticket();
		
		Tematica tematica = u.getPreferenciaUsuario();
		
		for (Promocion p : Sistema.getPromociones()) {
			System.out.println("¿Desea comprar: " + p.getNombre() + "?");
			if (ingreso.next().toUpperCase().equals(RESPUESTA_SI)) {
				System.out.println("Acaba de comprar: " + p.getNombre());
				u.comprar(p, ticket);
			}
			System.out.println("¿Desea seguir?");
			if (ingreso.next().toUpperCase().equals(RESPUESTA_NO)) {
				System.out.println("Abandona for");
				break;
			}
		}
		for (Atraccion a : Sistema.getAtracciones()) {
			System.out.println("¿Desea comprar: " + a.getNombre() + "?");
			if (ingreso.next().toUpperCase().equals(RESPUESTA_SI)) {
				System.out.println("Acaba de comprar: " + a.getNombre());
				u.comprar(a, ticket);
			}
			System.out.println("¿Desea seguir?");
			if (ingreso.next().toUpperCase().equals(RESPUESTA_NO)) {
				System.out.println("Abandona for");
				break;
			}
		}
		ingreso.close();
		System.out.println(ticket);
	}

	public static void mostrarPromociones() {
		System.out.println(
				" ______________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println(
				"|                                                                                                                                                                                                      |");
		System.out.println(
				"|                                                                                              LISTA DE PROMOCIONES                                                                                    |");
		System.out.println(
				"|______________________________________________________________________________________________________________________________________________________________________________________________________|");
		for (Promocion promocion : Sistema.getPromociones()) {
			System.out.println(promocion);
			System.out.println(
					"|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
		}
		System.out.println(
				"!......................................................................................................................................................................................................!");
	}

	public static void mostrarAtracciones() {
		System.out.println(
				" _______________________________________________________________________________________________________________________");
		System.out.println(
				"|                                                                                                                       |");
		System.out.println(
				"|                                                   LISTA DE ATRACCIONES                                                |");
		System.out.println(
				"|_______________________________________________________________________________________________________________________|");
		for (Atraccion atraccion : Sistema.getAtracciones()) {
			System.out.println(atraccion);
			System.out.println(
					"|-----------------------------------------------------------------------------------------------------------------------|");
		}
		System.out.println(
				"!.......................................................................................................................!");
	}

	public static void mostrarUsuarios() {
		System.out.println(
				" _______________________________________________________________________________________ ");
		System.out.println(
				"|                                                                                       |");
		System.out.println(
				"|                                   LISTA DE USUARIOS                                   |");
		System.out.println(
				"|_______________________________________________________________________________________|");
		for (Usuario usuario : Sistema.getUsuarios()) {
			System.out.println(usuario);
			System.out.println(
					"|---------------------------------------------------------------------------------------|");
		}
		System.out.println(
				"!.......................................................................................!");
	}
	
}
