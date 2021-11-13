import java.util.ArrayList;

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

	public int getEdad() {
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
	public int getTotalMiembros() {
		return 1;
	}


	@Override
	public ArrayList<ParticipanteReality> listarParticipantes(Criterio c) {
		ArrayList<ParticipanteReality> resultado = new ArrayList<>();
		if(c.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}


	@Override
	public boolean tocaTema(TemaMusical tema) {
		if(this.conoceIdioma(tema.getIdioma())) {
			ArrayList<String> generos = tema.getGenerosMusicales();
			for(String genero : generos) {
				if(generosMusicales.contains(genero)) {
					return true;
				}
			}
		}
		
		return false;
	}


	@Override
	public boolean tocaTema(TemaMusical tema, int cantidadParticipantesRequeridos) {
		if(tocaTema(tema)) {
			ArrayList<String> instrumentos = tema.getInstrumentos();
			for(String instrumento : instrumentos) {
				if(sabenTocarInstrumento(instrumento) == cantidadParticipantesRequeridos) {
					return true;
				}
			}
					
		}
		return false;
	}


	@Override
	public int sabenTocarInstrumento(String s) {
		if(tocaInstrumento(s)) {
			return 1;
		}
		return 0;
	}


	


	

	
}
