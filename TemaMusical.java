package trabajoPracticoEspecial;
import java.util.ArrayList;

public class TemaMusical {
	private String titulo;
	private String idioma;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> instrumentos; //puede estar vacía
	
	
	
	public ArrayList<String> getInstrumentos() {
		return new ArrayList<String>(instrumentos);
	}

	//Constructor
	public TemaMusical(String titulo, String idioma, String genero) {
		super();
		this.titulo = titulo;
		this.idioma = idioma;
		generosMusicales = new ArrayList<>();
		generosMusicales.add(genero);
		instrumentos = new ArrayList<>();
	}
	
	//Getters
	public String getTitulo() {
		return titulo;
	}
	public String getIdioma() {
		return idioma;
	}
	
	//Adds...
	public void addGeneroMusical(String genero ) {
		if (!generosMusicales.contains(genero))
			generosMusicales.add(genero);
	}
	public void addInstrumento(String instrumento) {
		if (!instrumentos.contains(instrumento))
			instrumentos.add(instrumento);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		try {
			TemaMusical tema = (TemaMusical)obj;
			return (this.getTitulo().equals(tema.getTitulo()) && 
					this.getIdioma().equals(tema.getIdioma()));
		} catch(Exception e) {
			return false;
		}
	}
	
	public boolean aceptaParticipante(ParticipanteReality p) {
		if (p.conoceIdioma(this.getIdioma())) {
			for (String genero:generosMusicales)
				if (p.prefiereGenero(genero))
					return true;
		}

		return false;
	}
}
