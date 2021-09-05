package turismo_en_la_tierra_media;

public class App {

	public static void main(String[] args) {	
		System.out.println(Archivo.cargarAtracciones());
		System.out.println(Archivo.cargarUsuario());
		System.out.println(Archivo.cargarPromociones(Archivo.cargarAtracciones()));
	}

}
