package turismo_en_la_tierra_media;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException {
//		System.out.println(Archivo.cargarAtracciones());
//		System.out.println(Archivo.cargarUsuario());
//		System.out.println(Archivo.cargarPromociones(Archivo.cargarAtracciones()));

		for (Usuario a : Archivo.cargarUsuario()) {
			System.out.println(a);
		}

		for (Atraccion a : Archivo.cargarAtracciones()) {
			System.out.println(a);
		}

		for (Promocion a : Archivo.cargarPromociones(Archivo.cargarAtracciones())) {
			System.out.println(a);
		}

		ArrayList<String> b = new ArrayList<String>();
		b.add("Moria");

		System.out.println(Archivo.generarTicket(new Ticket("Juani", 100, 20, b, b), true));
		System.out.println(Archivo.generarTicket(new Ticket("Camila", 150, 30, b, b), true));
		// Limpia y reescribe
		System.out.println(Archivo.generarTicket(new Ticket("Jorge", 130, 10, b, b), false));
		System.out.println(Archivo.generarTicket(new Ticket("Camila", 150, 30, b, b), true));

	}

}
