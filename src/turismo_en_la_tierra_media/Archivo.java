package turismo_en_la_tierra_media;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Archivo {
	private static final String DIRECCION_ARCHIVO = System.getProperty("user.dir") + "\\archivos\\";

	public static ArrayList<Usuario> cargarUsuario() {

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		Scanner sc = null;

		try {

			sc = iniciarScanner("usuarios.txt");

			while (sc.hasNext()) {

				String line = sc.nextLine();

				String valores[] = line.split(" ");

				valores[0] = valores[0].replace('_', ' '); // nombre

				int monedas = Integer.parseInt(valores[1]);
				double tiempo = Double.parseDouble(valores[2]);

				usuarios.add(new Usuario(valores[0], monedas, tiempo, Tematica.toTematica(valores[3])));

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoExisteTematicaException e){
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

				String valores[] = line.split(" ");

				valores[0] = valores[0].replace('_', ' ');

				int costo = Integer.parseInt(valores[1]);
				double tiempo = Double.parseDouble(valores[2]);
				int cupos = Integer.parseInt(valores[3]);

				atracciones.add(new Atraccion(valores[0], costo, tiempo, cupos, Tematica.toTematica(valores[4])));

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoExisteTematicaException e){
			e.printStackTrace();
		} finally {
			sc.close();
		}

		return atracciones;
	}

	public static ArrayList<Promocion> cargarPromociones(ArrayList<Atraccion> atracciones) {

		ArrayList<Promocion> promociones = new ArrayList<Promocion>();

		Scanner sc = null;

		try {

			sc = iniciarScanner("promociones.txt");

			while (sc.hasNext()) {

				String line = sc.nextLine();

				String valores[] = line.split(" ");

				valores[0] = valores[0].replace('_', ' ');

				TipoPromocion promo = TipoPromocion.toPromocion(valores[1]);
				
				ArrayList<Atraccion> atraccionesPromocion = new ArrayList<Atraccion>();
				
				atraccionesPromocion.add(getAtraccion(valores[3].replace('_', ' '), atracciones));
				atraccionesPromocion.add(getAtraccion(valores[4].replace('_', ' '), atracciones));
				
				if(promo.equals(TipoPromocion.ABSOLUTA)) {
					int beneficio = Integer.parseInt(valores[2]);
					promociones.add(new PromoAbsoluta(valores[0], beneficio, atraccionesPromocion));
				}
				
				if(promo.equals(TipoPromocion.PORCENTUAL)) {
					//Falta Hacer :D
				}
				
				if(promo.equals(TipoPromocion.AXB)) {
					//Falta Hacer :D
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoExistePromocionException e){
			e.printStackTrace();
		} catch (NoExisteAtraccionException e){
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		return promociones;
	}

	private static Scanner iniciarScanner(String nombre) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(DIRECCION_ARCHIVO + nombre));

		sc.useLocale(Locale.ENGLISH);

		return sc;
	}

	private static Atraccion getAtraccion(String nombre, ArrayList<Atraccion> atracciones) throws NoExisteAtraccionException{
		
		for(Atraccion a : atracciones)
			if(a.getNombreAtraccion().toLowerCase().equals(nombre.toLowerCase()))
				return a;
		
		throw new NoExisteAtraccionException("NO existe la atraccion \"" + nombre + "\"");
	}
	
	public void generarTicket(Ticket ticked) {

	}
}
