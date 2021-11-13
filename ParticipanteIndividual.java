package trabajoPracticoEspecial;

import java.util.ArrayList;
import trabajoPracticoEspecial.criteriosParticipante.CriterioParticipante;


public class ParticipanteIndividual extends ParticipanteReality {

	private String apellido;
	private int edad;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> idiomas;
	private ArrayList<String> instrumentos;
	
	
	
	
	public ParticipanteIndividual(String nombre, String apellido, int edad) {
		super(nombre);
		this.apellido = apellido;
		this.edad = edad;
		generosMusicales = new ArrayList<>();
		idiomas = new ArrayList<>();
		instrumentos = new ArrayList<>();
	}


	public String getApellido() {
		return apellido;
	}

	public ArrayList<String> obtenerInstrumentos(){
		return new ArrayList<String>(instrumentos);
	}
	
	public void addInstrumento(String s) {
		if(!instrumentos.contains(s)) {
			instrumentos.add(s);
		}
		
	}
	public void addIdioma(String s) {
		if(!idiomas.contains(s)) {
			idiomas.add(s);
		}
		
	}
	public void addGenero(String s) {
		if(!generosMusicales.contains(s)) {
			generosMusicales.add(s);
		}
		
	}
	
	public boolean conoceIdioma(String s) {
		return idiomas.contains(s);
	}
	
	public boolean prefiereGenero(String s) {
		return generosMusicales.contains(s);
	}
	
	public boolean tocaInstrumento(String s) {
		return instrumentos.contains(s);
	}
	
	public ArrayList<String> obtenerIdiomas(){
		return new ArrayList<String>(idiomas);
	}
	
	public ArrayList<String> obtenerGeneros(){
		return new ArrayList<String>(generosMusicales);
	}

	public int getSumaEdadesIndividuales() {
		return edad;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			ParticipanteIndividual p = (ParticipanteIndividual) obj;
			return this.getApellido().equals(p.getApellido())&& this.getNombre().equals(p.getNombre());
		}catch(Exception e) {
			return false;
		}
		
	}


	@Override
	public int getTotalMiembrosIndividuales() {
		return 1;
	}


	@Override
	public ArrayList<ParticipanteReality> listarParticipantes(CriterioParticipante c) {
		ArrayList<ParticipanteReality> resultado = new ArrayList<>();
		if(c.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}

	@Override
	public int cantidadMiembrosTocanInstrumento(String s) {
		if(tocaInstrumento(s)) {
			return 1;
		}
		return 0;
	}


	


	

	
}
