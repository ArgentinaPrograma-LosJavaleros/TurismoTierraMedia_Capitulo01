package turismo_en_la_tierra_media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Archivo {

	// Convierte en string la dirección de la carpeta "Archivos" en donde se está
	// ejecutando el código.
	private static final String DIRECCION_PRINCIPAL = System.getProperty("user.dir");
	private static final String DIRECCION_ARCHIVO = DIRECCION_PRINCIPAL  + "\\archivos\\";

	public static ArrayList<Usuario> cargarUsuarios() {

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		Scanner sc = null;

		try {

			sc = iniciarScanner("usuarios.txt");

			while (sc.hasNext()) {

				String line = sc.nextLine();

				// Crea una array con cada palabra separada por un espacio.
				String valores[] = line.split(" ");

				// Reemplaza el guión bajo en el nombre del usuario por un espacio.
				valores[0] = valores[0].replace('_', ' ');

				int monedas = Integer.parseInt(valores[1]);
				double tiempo = Double.parseDouble(valores[2]);

				// Añade al usuario al arraylist de usuarios con su nombre, monedas, tiempo y
				// temática preferida.
				usuarios.add(new Usuario(valores[0], monedas, tiempo, Tematica.toTematica(valores[3])));

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoExisteTematicaException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

		return usuarios;
	}

	public static ArrayList<Atraccion> cargarAtracciones() {

		ArrayList<Atraccion> atracciones = new ArrayList<Atraccion>();

		Scanner sc = null;

		try {

			sc = iniciarScanner("atracciones.txt");

			while (sc.hasNext()) {

				String line = sc.nextLine();

				// Crea una array con cada palabra separada por un espacio.
				String valores[] = line.split(" ");

				// Reemplaza el guión bajo en el nombre del usuario por un espacio.
				valores[0] = valores[0].replace('_', ' ');

				int costo = Integer.parseInt(valores[1]);
				double tiempo = Double.parseDouble(valores[2]);
				int cupos = Integer.parseInt(valores[3]);

				// Añade la atracción al arraylist con su nombre, costo, tiempo, cupo y
				// temática.
				atracciones.add(new Atraccion(valores[0], costo, tiempo, cupos, Tematica.toTematica(valores[4])));

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoExisteTematicaException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

		return atracciones;
	}

	public static ArrayList<Promocion> cargarPromociones() {

		ArrayList<Promocion> promociones = new ArrayList<Promocion>();

		Scanner sc = null;

		try {

			sc = iniciarScanner("promociones.txt");

			while (sc.hasNext()) {

				String line = sc.nextLine();

				// Crea una array con cada palabra separad por un espacio.
				String valores[] = line.split(" ");

				// Reemplaza el guión bajo en el nombre de la promoción por un espacio.
				valores[0] = valores[0].replace('_', ' ');

				// Revisa que las promociones sean válidas.
				TipoPromocion promo = TipoPromocion.toPromocion(valores[1]);

				ArrayList<Atraccion> atraccionesPromocion = new ArrayList<Atraccion>();

				// Si existen, añade las dos atracciones de la promoción al arraylist,
				// reemplazando el guión bajo con un espacio.
				atraccionesPromocion.add(getAtraccion(valores[3].replace('_', ' ')));
				atraccionesPromocion.add(getAtraccion(valores[4].replace('_', ' ')));

				// Las siguientes condicionales crean una promoción según lo que lea del
				// archivo.
				if (promo.equals(TipoPromocion.ABSOLUTA)) {
					// TODO Añadir excepción por si parseInt retorna null.
					int beneficio = Integer.parseInt(valores[2]);
					promociones.add(new PromoAbsoluta(valores[0], beneficio, atraccionesPromocion));
				}

				if (promo.equals(TipoPromocion.PORCENTUAL)) {
					// TODO Añadir excepción por si parseDouble retorna null.
					double porcentaje = Double.parseDouble(valores[2]);
					promociones.add(new PromoPorcentual(valores[0], porcentaje, atraccionesPromocion));
				}

				if (promo.equals(TipoPromocion.AXB)) {
					Atraccion atraccionGratis = getAtraccion(valores[2]);
					promociones.add(new PromoAxB(valores[0], atraccionGratis, atraccionesPromocion));
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoExistePromocionException e) {
			e.printStackTrace();
		} catch (NoExisteAtraccionException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

		return promociones;
	}

	private static Scanner iniciarScanner(String nombre) throws FileNotFoundException {
		// Abre el archivo indicado en la carpeta Archivos de donde se ejecuta el
		// código.
		Scanner sc = new Scanner(new File(DIRECCION_ARCHIVO + nombre));

		// Setea el lenguaje con el cual se ejecuta el archivo.
		sc.useLocale(Locale.ENGLISH);

		return sc;
	}

	private static Atraccion getAtraccion(String nombre)
			throws NoExisteAtraccionException {
	
		// Compara si la atracción ingresada existe en la lista de atracciones.
		for (Atraccion a : Sistema.getAtracciones()) {
			String s = (a).getNombre();
			if (s.toLowerCase().equals(nombre.replace("_", " ").toLowerCase()))
				return a;
		}

		throw new NoExisteAtraccionException("NO existe la atraccion \"" + nombre + "\"");
	}

	// Genera el archivo de tickets. Si noSobrescribir = false entonces limpia el
	// archivo y empiezo desde el principio.
	public static Ticket generarTicket(Ticket ticket, boolean noSobrescribir)
			throws IOException, FileNotFoundException {
		PrintWriter pw = new PrintWriter(new FileWriter(DIRECCION_ARCHIVO + "tickets.txt", noSobrescribir));
		
		pw.println(" ______________________________________________");
		pw.println("|                                              |");
		pw.println("|           TURISMO EN LA TIERRA MEDIA         |");
		pw.println("|               TICKET DE ACCESO               |");
		pw.println("|______________________________________________|");
		pw.println("|                                              |");
		pw.printf( "|Comprador/a %34s|\n", ticket.getComprador());
		pw.println("|                                              |");
		pw.printf( "|Monedas Gastadas %29s|\n", ticket.getMonedasGastadas());
		pw.println("|                                              |");
		pw.printf( "|Tiempo Gastado  %30s|\n", ticket.getTiempoGastado());
		pw.println("|                                              |");
		pw.println("|::::::::::::::::::::::::::::::::::::::::::::::|");
		pw.println("|Promociones Reservadas:                       |");
		for (String p : ticket.getPromocionesReservadas())
			pw.printf( "|%46s|\n", p);
		pw.println("|Atracciones Reservadas:                       |");
		for (String a : ticket.getAtraccionesReservadas())
			pw.printf( "|%46s|\n", a);
		pw.println("|                                              |");
		pw.println("|                                              |");
		pw.println("|        ¡MUCHAS GRACIAS POR SU COMPRA!        |");
		pw.println("|                                              |");
		pw.println("|______________________________________________|");
		
		pw.close();

		return ticket;
	}
	
	public static void parseCSV(String path) {
		
		Scanner sc = null;
		PrintWriter pw = null;
		try {

			sc = iniciarScanner(path);
			pw = new PrintWriter(new FileWriter(DIRECCION_PRINCIPAL + "\\archivoscsv\\" + path.replace(".txt", ".csv"), false));

			while (sc.hasNext()) {

				String line = sc.nextLine();
				
				
				line = line.replace(' ', ',')
						   .replace('_', ' ');
				
				pw.println(line);
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			pw.close();
		}

	}
}
