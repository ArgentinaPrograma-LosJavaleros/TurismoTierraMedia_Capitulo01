package turismo_en_la_tierra_media;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

	private static ArrayList<Usuario> usuarios;
	private static ArrayList<Atraccion> atracciones;
	private static ArrayList<Promocion> promociones;
	private static Usuario usuarioActual;
	protected static final String RESPUESTA_SI = "SI";
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

	public static boolean login(Usuario usuarioLogin) {
		try {
			usuarioActual = getUsuarios().get(getUsuarios().indexOf(usuarioLogin));
		} catch (IndexOutOfBoundsException iobe) {
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
			if (verificarSugerible(p, ticket)) {
				System.out.println("Le sugerimos la siguiente Promoción:");
				System.out.println(p.mostrarSugerible());
				System.out.println("¿Desea comprar " + p.getNombre() + "?");
				if (ingreso.next().toUpperCase().equals(RESPUESTA_SI)) {
					System.out.println("Acaba de comprar: " + p.getNombre());
					u.comprar(p, ticket);
					
				}
				System.out.println("¿Desea seguir?");
				if (ingreso.next().toUpperCase().equals(RESPUESTA_NO)) {
					break;
				}
			}
		}
		for (Atraccion a : Sistema.getAtracciones()) {
			if (verificarSugerible(a, ticket)) {
				System.out.println("Le sugerimos la siguiente Atracción:");
				System.out.println(a.mostrarSugerible());
				System.out.println("¿Desea comprar " + a.getNombre() + "?");
				if (ingreso.next().toUpperCase().equals(RESPUESTA_SI)) {
					System.out.println("Acaba de comprar: " + a.getNombre());
					u.comprar(a, ticket);
				}
				System.out.println("¿Desea seguir?");
				if (ingreso.next().toUpperCase().equals(RESPUESTA_NO)) {
					break;
				}
			}
		}
		ingreso.close();
		System.out.println(ticket);
	}

	private static boolean verificarSugerible(Sugerible producto, Ticket ticket) {
		Usuario u = Sistema.getUsuarioActual();

		if (u.getCantidadMonedas() >= producto.getCosto() && u.getTiempoDisponible() >= producto.getTiempo()) {
			if (producto.getClass().equals(Atraccion.class)) {
				if (((Atraccion) producto).getCupoUsuarios() > 0
						&& !ticket.getAtraccionesReservadas().contains(producto.getNombre()))
					return true;
			} else {
				for (Atraccion a : ((Promocion) producto).getAtracciones()) {
					if (a.getCupoUsuarios() > 0 && !ticket.getAtraccionesReservadas().contains(a.getNombre()))
						return true;
				}
				if (producto.getClass().equals(PromoAxB.class)) {
					if (((PromoAxB) producto).getAtraccionGratis().getCupoUsuarios() > 0
							&& !ticket.getAtraccionesReservadas()
									.contains(((PromoAxB) producto).getAtraccionGratis().getNombre()))
						return true;
				}
			}
		}
		return false;
	}

	public static void mostrarPromociones() {
		double size = (double) ((207 - (double) ("LISTA DE PROMOCIONES").length()) / 2);
		System.out.println(" " + repiteCaracteres("_", 207) + " ");
		System.out.println("|" + repiteCaracteres(" ", 207) + "|");
		System.out.println("|" + Sistema.repiteCaracteres(" ", (int)Math.floor(size)) + "LISTA DE PROMOCIONES" + Sistema.repiteCaracteres(" ", (int)Math.ceil(size)) + "|");
		System.out.println("|" + repiteCaracteres("_", 207) + "|");
		for (Promocion promocion : Sistema.getPromociones()) {
			System.out.println(promocion);
			System.out.println("|" + repiteCaracteres("-", 207) + "|");
		}
		System.out.println("!" + repiteCaracteres(".", 207) + "!");
	}

	public static void mostrarAtracciones() {
		double size = (double) ((119 - (double) ("LISTA DE ATRACCIONES").length()) / 2);
		System.out.println(" " + repiteCaracteres("_", 119) + " ");
		System.out.println("|" + repiteCaracteres(" ", 119) + "|");
		System.out.println("|" + Sistema.repiteCaracteres(" ", (int)Math.floor(size)) + "LISTA DE ATRACCIONES" + Sistema.repiteCaracteres(" ", (int)Math.ceil(size)) + "|");
		System.out.println("|" + repiteCaracteres("_", 119) + "|");
		for (Atraccion atraccion : Sistema.getAtracciones()) {
			System.out.println(atraccion);
			System.out.println("|" + repiteCaracteres("-", 119) + "|");
		}
		System.out.println("!" + repiteCaracteres(".", 207) + "!");
	}

	public static void mostrarUsuarios() {
		double size = (double) ((87 - (double) ("LISTA DE USUARIOS").length()) / 2);
		System.out.println(" " + repiteCaracteres("_", 87) + " ");
		System.out.println("|" + repiteCaracteres(" ", 87) + "|");
		System.out.println("|" + Sistema.repiteCaracteres(" ", (int)Math.floor(size)) + "LISTA DE USUARIOS" + Sistema.repiteCaracteres(" ", (int)Math.ceil(size)) + "|");
		System.out.println("|" + repiteCaracteres("_", 87) + "|");		
		for (Usuario usuario : Sistema.getUsuarios()) {
			System.out.println(usuario);
			
			System.out.println("|" + repiteCaracteres("-", 87) + "|");
		}
		
		System.out.println("!" + repiteCaracteres(".", 87) + "!");
	}
	
	public static String repiteCaracteres(String str, Integer cantidad) {
		String str2 = "";
		for(int i = 0; i < cantidad; i++) {
			str2 += str;
		}
		return str2;
	}

}
