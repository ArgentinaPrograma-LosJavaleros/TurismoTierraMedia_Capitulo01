package turismo_en_la_tierra_media;

import java.util.ArrayList;

public class Sistema {
	
	private ArrayList<Usuario> usuarios;
	private ArrayList<Atraccion> atracciones;
	private ArrayList<Promocion> promociones;
	
	// Setters
	//--------------------------------------------------------------------------
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void setAtracciones(ArrayList<Atraccion> atracciones) {
		this.atracciones = atracciones;
	}
	
	public void setPromociones(ArrayList<Promocion> promociones) {
		this.promociones = promociones;
	}
	//--------------------------------------------------------------------------
	
	// Getters
	//--------------------------------------------------------------------------
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public ArrayList<Atraccion> getAtracciones() {
		return atracciones;
	}
	
	public ArrayList<Promocion> getPromociones() {
		return promociones;
	}
	//--------------------------------------------------------------------------
}
