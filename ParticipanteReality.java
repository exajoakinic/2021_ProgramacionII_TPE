package trabajoPracticoEspecial;

import java.util.ArrayList;
import trabajoPracticoEspecial.criteriosParticipante.CriterioParticipante;

public abstract class ParticipanteReality {

	private String nombre;

	public ParticipanteReality(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		
		int miembrosTotales = getTotalMiembrosIndividuales();
		int edad = getSumaEdadesIndividuales();
		
		return edad/miembrosTotales;
		
	}
	
	public abstract int getSumaEdadesIndividuales();

	public abstract int getTotalMiembrosIndividuales();
	
	public abstract boolean conoceIdioma(String s);
	
	public abstract boolean prefiereGenero (String s);
	
	public abstract boolean tocaInstrumento(String s);
	
	public abstract ArrayList<String> obtenerGeneros();
	
	public abstract ArrayList<String> obtenerIdiomas();
	
	public abstract ArrayList<String> obtenerInstrumentos();
	
	public abstract ArrayList<ParticipanteReality> listarParticipantes(CriterioParticipante c);

	public abstract int cantidadMiembrosTocanInstrumento(String instrumento);
	

	

	
}
