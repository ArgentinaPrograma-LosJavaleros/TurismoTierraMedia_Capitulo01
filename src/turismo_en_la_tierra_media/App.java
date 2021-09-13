package turismo_en_la_tierra_media;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class App {
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ArrayList<Usuario> listaUsuarios = Archivo.cargarUsuarios();
		
		boolean existe = false;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Ingrese su Nombre de Usuario: ");
			String nombre = input.nextLine();
			existe = Sistema.login(listaUsuarios, new Usuario(nombre));
		}while(!existe);
		
		
		System.out.println(Sistema.getUsuarioActual());
		
		
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
//		System.out.println(Archivo.genesrarTicket(new Ticket("Camila", 150, 30, b, b), true));
//		// Limpia y reescribe
//		System.out.println(Archivo.generarTicket(new Ticket("Jorge", 130, 10, b, b), false));
//		System.out.println(Archivo.generarTicket(new Ticket("Camila", 150, 30, b, b), true));
		
		ArrayList<Promocion> arr = Archivo.cargarPromociones(Archivo.cargarAtracciones());
		System.out.println("");
		Collections.sort(arr);
		Sistema.generarLista(Sistema.ordenarPromocionSegunTematica(arr));
	}

}
