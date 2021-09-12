package turismo_en_la_tierra_media;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*String nombreUsuario;
		Scanner ingreso = new Scanner(System.in);
		
		do {
			System.out.print("Ingrese su Nombre de Usuario: ");	
			nombreUsuario = ingreso.nextLine();
		} while(!Sistema.validarUsuario(Archivo.cargarUsuario(), nombreUsuario));
		
		System.out.println("Hola " + nombreUsuario);
		Sistema.cargarOfertas(null, Archivo.cargarPromociones(Archivo.cargarAtracciones()), Archivo.cargarAtracciones());
//		System.out.println();
//		System.out.println();
//		System.out.println();
		
		ingreso.close();*/
		
//		System.out.println(Archivo.cargarAtracciones());
//		System.out.println(Archivo.cargarUsuario());
//		System.out.println(Archivo.cargarPromociones(Archivo.cargarAtracciones()));
		
//		Sistema.generarLista("usuarios");
//		Sistema.generarLista("atracciones");
//		Sistema.generarLista("promociones");

//		ArrayList<String> b = new ArrayList<String>();
//		b.add("Moria");
//
//		System.out.println(Archivo.generarTicket(new Ticket("Juani", 100, 20, b, b), true));
//		System.out.println(Archivo.generarTicket(new Ticket("Camila", 150, 30, b, b), true));
//		// Limpia y reescribe
//		System.out.println(Archivo.generarTicket(new Ticket("Jorge", 130, 10, b, b), false));
//		System.out.println(Archivo.generarTicket(new Ticket("Camila", 150, 30, b, b), true));
		
		ArrayList<Atraccion> arr = Archivo.cargarAtracciones();
		Sistema.generarLista("atracciones");
		System.out.println("");
		Collections.sort(arr);
		Sistema.generarLista(arr);
		System.out.println(Sistema.validarUsuario(Archivo.cargarUsuario(), new Usuario("Profe Lucas", null, null, null)));
	}

}
