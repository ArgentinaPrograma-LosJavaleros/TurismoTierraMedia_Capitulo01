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
		assertEquals(true, Sistema.login(new Usuario("lucas")));
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
		assertTrue(Sistema.login(new Usuario("Lucas")));
	}

	@Test
	public void loginDeUsuarioYNOExisteTest() {
		assertFalse(Sistema.login(new Usuario("Noe Xiste")));
	}
	
	@Test
	public void seVerificaSiTieneCuposLaAtraccion() {

	}
	
	
}
