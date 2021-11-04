package trabajoPracticoEspecial;
import java.util.ArrayList;

public class Participante {
	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> idiomas;
	private ArrayList<String> instrumentos;
	
	//Constructor
	public Participante(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.generosMusicales = new ArrayList<>();
		this.idiomas = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	
	//Adds...
	public void addInstrumento(String instrumento ) {
		if (!instrumentos.contains(instrumento))
			instrumentos.add(instrumento);
	}
	public void addIdioma(String idioma) {
		if (!idiomas.contains(idioma))
			idiomas.add(idioma);
	}
	public void addGeneroMusical(String genero) {
		if (!generosMusicales.contains(genero))
			generosMusicales.add(genero);
	}

	//Listados
	public ArrayList<String> obtenerInstrumentos() {
		return new ArrayList<String>(instrumentos);
	}
	public ArrayList<String> obtenerIdiomas() {
		return new ArrayList<String>(idiomas);
	}
	public ArrayList<String> obtenerGeneros() {
		return new ArrayList<String>(generosMusicales);
	}
	
	//Criterios puntuales
	public boolean conoceIdioma(String idioma) {
		return idiomas.contains(idioma);
	}
	public boolean prefiereGenero(String genero) {
		return generosMusicales.contains(genero);
	}
	public boolean tocaInstrumento(String instrumento) {
		return instrumentos.contains(instrumento);
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Participante participante = (Participante)obj;
			return (this.getApellido().equals(participante.getApellido()) && 
					this.getNombre().equals(participante.getNombre()));
		} catch(Exception e) {
			return false;
		}
		
	}
	
	
}
