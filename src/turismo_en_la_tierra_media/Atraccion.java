package turismo_en_la_tierra_media;

public class Atraccion {
	
	private String nombreAtraccion; 
	private Integer costoAtraccion, cupoUsuarios; 
	private Double tiempoAtraccion; 
	private Tematica tematicaAtraccion;

	// Constructor
	public Atraccion(String nombreAtraccion, Integer costoAtraccion, Double tiempoAtraccion, 
			         Integer cupoUsuarios, Tematica tematicaAtraccion) {
		setNombreAtraccion(nombreAtraccion);
		setCostoAtraccion(costoAtraccion);
		setTiempoAtraccion(tiempoAtraccion);
		setCupoUsuarios(cupoUsuarios);
		setTematicaAtraccion(tematicaAtraccion);
	}

	// Setters
	//--------------------------------------------------------------------------
	public void setNombreAtraccion(String nombreAtraccion) {
		this.nombreAtraccion = nombreAtraccion;
	}
	
	public void setCostoAtraccion(Integer costoAtraccion) {
		this.costoAtraccion = costoAtraccion;
	}
	
	public void setTiempoAtraccion(Double tiempoAtraccion) {
		this.tiempoAtraccion = tiempoAtraccion;
	}
	
	public void setTematicaAtraccion(Tematica tematicaAtraccion) {
		this.tematicaAtraccion = tematicaAtraccion;
	}
	
	public void setCupoUsuarios(Integer cupoUsuarios) {
		this.cupoUsuarios = cupoUsuarios;
	}
	//--------------------------------------------------------------------------
	
	// Getters
	//--------------------------------------------------------------------------
	public String getNombreAtraccion() {
		return nombreAtraccion;
	}

	public Integer getCostoAtraccion() {
		return costoAtraccion;
	}

	public Double getTiempoAtraccion() {
		return tiempoAtraccion;
	}

	public Integer getCupoUsuarios() {
		return cupoUsuarios;
	}
	
	public Tematica getTematicaAtraccion() {
		return tematicaAtraccion;
	}
	//--------------------------------------------------------------------------

	@Override
	public String toString() {
		return "Atraccion [Nombre = " + getNombreAtraccion() + " | Atracción = " + getCostoAtraccion()
				+ " | Tiempo = " + getTiempoAtraccion() + " | Cupo = " + cupoUsuarios + " | Temática = "
				+ getTematicaAtraccion().getNombre() + "]";
	}
	
}

// Aguante el mortal kombat
//_..----------.._                       
//.-=""        _       ""=-.                  
//.-"    _.--""j _\""""--._    "-.               
//.-"  .-i   \   / / \;       ""--.  "-.            
//.'  .-"  : ( "  : :                "-.  `.          
//.'  .'      `.`.   \ \                  `.  `.        
///  .'      .---" ""--`."-./'---.           `.  \       
///  /      .'                    '-.           \  \      
///  /      /                         `.          \  \     
///  /      /                  ,--._   (            \  \    
//,  /    '-')                  `---'    `.           \  .   
//.  :      .'                              "-._.-.     ;  ,  
//;  ;     /            :;         ,-"-.    ,--.   )    :  :  
//:  :     :             ::        :_    "-. '-'   `,     ;  ; 
//|  |     :              \\     .--."-.    `._ _   ;     |  | 
//;  ;     :              / "---"    "-."-.    l.`./      :  : 
//:  :      ;             :              `. "-._; \         ;  ;
//;  ;      ;             ;                `..___/\\        :  :
//;  ;      ;             :                        \\    _  :  :
//:  :     /              '.                        ;;.__)) ;  ;
//;  ; .-'                 "-...______...--._      ::`--' :  : 
//|  |  `--'\                                "-.    \`._, |  | 
//:  :       \                                  `.   "-"  ;  ; 
//;  ;       `.                                  \      :   ' 
//'  :        ;                                   ;     ;  '  
//'  \    _  : :`.                               :    /  /   
//\  \   \`-' ; ; ._                             ;  /  /    
//\  \   `--'  : ; "-.                          : /  /     
//\  \        ;/     \                         ;/  /      
//\  `.              ;                        '  /       
//`.  "-.   bug    /                          .'        
//`.   "-..__..-"                         .'          
//"-.                                .-"            
//"-._                        _.-"               
//"""---...______...---"""