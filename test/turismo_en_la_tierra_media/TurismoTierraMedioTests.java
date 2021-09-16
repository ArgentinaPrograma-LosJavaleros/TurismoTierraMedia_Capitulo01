package turismo_en_la_tierra_media;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

public class TurismoTierraMedioTests {

	@Before
	public void setUp() throws Exception {
		Sistema.setAtracciones(Archivo.cargarAtracciones());
		Sistema.setPromociones(Archivo.cargarPromociones());
		Sistema.setUsuarios(Archivo.cargarUsuarios());
		assertNotNull(Sistema.getAtracciones());
		assertNotNull(Sistema.getPromociones());
		assertNotNull(Sistema.getUsuarios());
		assertTrue(Sistema.login(new Usuario("profe leo")));
		assertNotNull(Sistema.getUsuarioActual());
	}

	@Test
	public void seCarganLosArchivosTest() {
		assertNotNull(Archivo.cargarAtracciones());
		assertNotNull(Archivo.cargarPromociones());
		assertNotNull(Archivo.cargarUsuarios());
	}
	
	@Test
	public void loginDeUsuarioYExisteTest() {
		assertTrue(Sistema.login(new Usuario("profe lucas")));
	}

	@Test
	public void loginDeUsuarioYNOExisteTest() {
		assertFalse(Sistema.login(new Usuario("Noe Xiste")));
	}
	
	@Test
	public void comproUnaAtraccionTest() {
		Ticket ticket = new Ticket();
		Usuario usuarioActual = Sistema.getUsuarioActual();
		Atraccion atraccionParaComprar = Sistema.getAtracciones().get(1);
		
		usuarioActual.comprar(atraccionParaComprar, ticket);
		assertEquals(usuarioActual.getCantidadMonedas(), (Integer)1975);
		assertEquals(usuarioActual.getTiempoDisponible(), (Double)7.0);
		assertEquals(atraccionParaComprar.getCupoUsuarios(), (Integer)3);
	}
	
	@Test
	public void NOQuedanCuposEnAtraccionTest() {
		Ticket ticket = new Ticket();
		Usuario usuarioActual = Sistema.getUsuarioActual();
		Atraccion atraccionParaComprar = Sistema.getAtracciones().get(1);
		
		usuarioActual.comprar(atraccionParaComprar, ticket);
		usuarioActual.comprar(atraccionParaComprar, ticket);
		usuarioActual.comprar(atraccionParaComprar, ticket);
		usuarioActual.comprar(atraccionParaComprar, ticket);
		
		assertFalse(Sistema.verificarSugerible(atraccionParaComprar, ticket));
	}
	
	@Test
	public void NOQuedanCuposEnPromocionesTest() {
		Ticket ticket = new Ticket();
		Usuario usuarioActual = Sistema.getUsuarioActual();
		
		//Contemplad_La_Profundidad AxB Erebor Minas_Tirith Abismo_De_Helm
		Promocion promocionParaComprar = Sistema.getPromociones().get(4);
		
		//Erebor 12 3 32 Paisaje
		Atraccion atraccionParaComprar = Sistema.getAtracciones().get(10);
		
		
		while(Sistema.verificarSugerible(atraccionParaComprar, ticket))
			usuarioActual.comprar(atraccionParaComprar, ticket);
		
		assertFalse(Sistema.verificarSugerible(promocionParaComprar, ticket));
	}
	
	@Test
	public void NOAlcanzanLasMonedasParaComprarLaAtraccionTest() {
		Ticket ticket = new Ticket();
		Usuario usuarioActual = Sistema.getUsuarioActual();
		Atraccion atraccionParaComprar = Sistema.getAtracciones().get(22);
		
		usuarioActual.comprar(atraccionParaComprar, ticket);
		usuarioActual.comprar(atraccionParaComprar, ticket);
		
		assertFalse(Sistema.verificarSugerible(atraccionParaComprar, ticket));
	}
	
	@Test
	public void NOAlcanzanElTiempoParaComprarLaAtraccionTest() {
		Ticket ticket = new Ticket();
		Usuario usuarioActual = Sistema.getUsuarioActual();
		
		usuarioActual.comprar(Sistema.getAtracciones().get(15), ticket);
		usuarioActual.comprar(Sistema.getAtracciones().get(17), ticket);
		
		assertFalse(Sistema.verificarSugerible(Sistema.getAtracciones().get(15), ticket));
	}
	
	@Test
	public void seOrdenanLasAtraccionesSegunGustoPrecioYTiempoTest() {
		
		ArrayList<Atraccion> arrayDesordenado = new ArrayList<Atraccion>();
		ArrayList<Atraccion> arrayOrdenado = new ArrayList<Atraccion>();
		
		/* DESORDENADO ***********
		 * Erebor 12 3 32 Paisaje
		 * Mordor 25 3 4 Aventura
		 * Duelo_A_Muerte_Con_Cuchillos 1000 3 2 Extremo
		 * Bosque_Negro 3 4 12 Aventura
		 * Lothlorien 35 1 30 Degustacion
		 */
		arrayDesordenado.add(new Atraccion("Erebor", 12, 3.0, 32, Tematica.PAISAJE));
		arrayDesordenado.add(new Atraccion("Mordor", 25, 3.0, 4, Tematica.AVENTURA));
		arrayDesordenado.add(new Atraccion("Duelo A Muerte Con Cuchillos", 1000, 3.0, 2, Tematica.EXTREMO));
		arrayDesordenado.add(new Atraccion("Bosque Negro", 3, 4.0, 12, Tematica.AVENTURA));
		arrayDesordenado.add(new Atraccion("Lothlorien", 35, 1.0, 30, Tematica.DEGUSTACION));
		
		/* ORDEN CORRECTO ***********
		 * Mordor 25 3 4 Aventura
		 * Bosque_Negro 3 4 12 Aventura
		 * Duelo_A_Muerte_Con_Cuchillos 1000 3 2 Extremo
		 * Lothlorien 35 1 30 Degustacion
		 *Erebor 12 3 32 Paisaje
		 */
		arrayOrdenado.add(new Atraccion("Mordor", 25, 3.0, 4, Tematica.AVENTURA));
		arrayOrdenado.add(new Atraccion("Bosque Negro", 3, 4.0, 12, Tematica.AVENTURA));
		arrayOrdenado.add(new Atraccion("Duelo A Muerte Con Cuchillos", 1000, 3.0, 2, Tematica.EXTREMO));
		arrayOrdenado.add(new Atraccion("Lothlorien", 35, 1.0, 30, Tematica.DEGUSTACION));
		arrayOrdenado.add(new Atraccion("Erebor", 12, 3.0, 32, Tematica.PAISAJE));
		
		assertNotEquals(arrayOrdenado, arrayDesordenado);
		
		Collections.sort(arrayDesordenado, new OrdenadorPorTematica());
		
		assertEquals(arrayOrdenado, arrayDesordenado);

	}
	
}
