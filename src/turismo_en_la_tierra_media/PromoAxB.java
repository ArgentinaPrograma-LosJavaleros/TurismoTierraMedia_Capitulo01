package turismo_en_la_tierra_media;

import java.util.ArrayList;
 
public class PromoAxB extends Promocion {

	private Atraccion atraccionGratis;

	// Constructor
	public PromoAxB(String nombreAtraccion, Atraccion atraccionGratis, ArrayList<Atraccion> atracciones) {
		super(nombreAtraccion, TipoPromocion.AXB, atracciones);
		this.setAtraccionGratis(atraccionGratis);
		super.tiempo += this.atraccionGratis.getTiempo();
	}

	// Setters
	//--------------------------------------------------------------------------
	public void setAtraccionGratis(Atraccion atraccionGratis) {
		this.atraccionGratis = atraccionGratis;
	}
	
//	@Override
//	protected void setTiempo() {
//		super.setTiempo();
//		
//	}
	
	//--------------------------------------------------------------------------
	

	// Getters
	//--------------------------------------------------------------------------
	public Atraccion getAtraccionGratis() {
		return atraccionGratis;
	}
	//--------------------------------------------------------------------------

	@Override
	public String toString() {
		
		System.out.printf("| Nombre = %-30s"
                        + "| Atracciones = %-50s"
                        + "| Atracci�n gratis = %-29s"
                        + "| Precio Final = %-5d"
                        + "| Tipo = %-10s |", 
                        super.getNombre(),
                        getNombreAtracciones(),
                        getAtraccionGratis().getNombre(),
                        super.getCosto(),
                        getTipoPromocion());
		return "";
	}

}
