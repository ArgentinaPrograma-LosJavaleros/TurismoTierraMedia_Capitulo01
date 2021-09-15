package turismo_en_la_tierra_media;

import static org.junit.Assert.*;


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
		assertTrue(Sistema.login(new Usuario("profe leo")));
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
		
		usuarioActual.comprar(Sistema.getAtracciones().get(1), ticket);
		assertEquals(usuarioActual.getCantidadMonedas(), (Integer)1975);
		assertEquals(usuarioActual.getTiempoDisponible(), (Double)7.0);
		assertEquals(atraccionParaComprar.getCupoUsuarios(), (Integer)3);
	}
	
	@Test
	public void NOQuedanCuposEnAtraccionTest() {
		Ticket ticket = new Ticket();
		Usuario usuarioActual = Sistema.getUsuarioActual();
		Atraccion atraccionParaComprar = Sistema.getAtracciones().get(1);
		
		usuarioActual.comprar(Sistema.getAtracciones().get(1), ticket);
		assertEquals(usuarioActual.getCantidadMonedas(), (Integer)1975);
		assertEquals(usuarioActual.getTiempoDisponible(), (Double)7.0);
		assertEquals(atraccionParaComprar.getCupoUsuarios(), (Integer)3);
	}
	
	@Test
	public void seOrdenanLasAtraccionesTest() {
		Ticket ticket = new Ticket();
		Usuario usuarioActual = Sistema.getUsuarioActual();
		Atraccion atraccionParaComprar = Sistema.getAtracciones().get(1);
		
		usuarioActual.comprar(Sistema.getAtracciones().get(1), ticket);
		assertEquals(usuarioActual.getCantidadMonedas(), (Integer)1975);
		assertEquals(usuarioActual.getTiempoDisponible(), (Double)7.0);
		assertEquals(atraccionParaComprar.getCupoUsuarios(), (Integer)3);
	}
	
}
