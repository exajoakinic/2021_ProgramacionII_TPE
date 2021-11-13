import java.util.ArrayList;

public abstract class ParticipanteReality {

	private String nombre;

	public ParticipanteReality(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int calcularEdad() {
		
		int miembrosTotales = getTotalMiembros();
		int edad = getEdad();
		
		return edad/miembrosTotales;
		
	}
	
	public abstract int getEdad();

	public abstract int getTotalMiembros();
	
	public abstract boolean conoceIdioma(String s);
	
	public abstract boolean prefiereGenero (String s);
	
	public abstract boolean tocaInstrumento(String s);
	
	public abstract int sabenTocarInstrumento(String s);
	
	public abstract ArrayList<String> obtenerGeneros();
	
	public abstract ArrayList<String> obtenerIdiomas();
	
	public abstract ArrayList<String> obtenerInstrumentos();
	
	public abstract ArrayList<ParticipanteReality> listarParticipantes(Criterio c);

	public abstract boolean tocaTema(TemaMusical tema);

	public abstract boolean tocaTema(TemaMusical tema, int cantidadParticipantesRequeridos);

	

	

	
}
