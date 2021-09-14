package turismo_en_la_tierra_media;

import java.util.Comparator;

public class OrdenadorPorTematica implements Comparator<Sugerible> {

	@Override
	public int compare(Sugerible s1, Sugerible s2) {
		Tematica tematicaUsuario = Sistema.getUsuarioActual().getPreferenciaUsuario();
		
		if(s1.getTematica().equals(tematicaUsuario) && !s2.getTematica().equals(tematicaUsuario))
			return -1;
		
		if(!s1.getTematica().equals(tematicaUsuario) && s2.getTematica().equals(tematicaUsuario))
			return 1;
		
		return s1.compareTo(s2);
	}

}
