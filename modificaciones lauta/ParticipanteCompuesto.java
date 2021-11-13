import java.util.ArrayList;

public class ParticipanteCompuesto extends ParticipanteReality {
	
	private ArrayList<ParticipanteReality> miembros;

	public ParticipanteCompuesto(String nombre) {
		super(nombre);
		this.miembros = new ArrayList<>();
	}

	@Override
	public int getEdad() { // ver posibilidad de contar subgrupo como miembro para el promedio
		int edad = 0;
		for(ParticipanteReality p : miembros) {
			edad+= p.getEdad();
		}
		return edad;
	}

	@Override
	public int getTotalMiembros() {
		int total = 0;
		for(ParticipanteReality p : miembros) {
			total+= p.getTotalMiembros();
		}
		return total;
	}

	@Override
	public ArrayList<String> obtenerGeneros() {
		ArrayList<String> generosCompartidos = miembros.get(0).obtenerGeneros();
		for(ParticipanteReality p : miembros) {
			generosCompartidos.retainAll(p.obtenerGeneros());
		}
		
		
		return generosCompartidos;
	}

	@Override
	public ArrayList<String> obtenerIdiomas() {
		ArrayList<String> idiomas = new ArrayList<>();
		for(ParticipanteReality p : miembros) {
			ArrayList<String> idiomasParticipante = p.obtenerIdiomas();
			for(String s : idiomasParticipante) {
				if(!idiomas.contains(s)) {
					idiomas.add(s);
				}
			}
		}
		return idiomas;
	}

	@Override
	public ArrayList<String> obtenerInstrumentos() {
		ArrayList<String> instrumentos = new ArrayList<>();
		for(ParticipanteReality p : miembros) {
			ArrayList<String> instrumentosParticipante = p.obtenerIdiomas();
			for(String s : instrumentosParticipante) {
				if(!instrumentos.contains(s)) {
					instrumentos.add(s);
				}
			}
		}
		return instrumentos;
	}

	@Override
	public ArrayList<ParticipanteReality> listarParticipantes(Criterio c) {
		ArrayList<ParticipanteReality> resultado = new ArrayList<>();
		if(c.cumple(this)) {
			//return this.copiar();
		}else {
			for(ParticipanteReality p : miembros) {
				resultado.addAll(p.listarParticipantes(c));
			}
		}
		
		return resultado;
	}

	@Override
	public boolean conoceIdioma(String s) {
		
		return this.obtenerIdiomas().contains(s);
	}

	@Override
	public boolean prefiereGenero(String s) {
		
		return this.obtenerGeneros().contains(s);
	}

	@Override
	public boolean tocaInstrumento(String s) {
		
		return this.obtenerInstrumentos().contains(s);
	}

	@Override
	public boolean tocaTema(TemaMusical tema) {
		if(this.conoceIdioma(tema.getIdioma())) {
			ArrayList<String> generos = tema.getGenerosMusicales();
			for(String genero : generos) {
				if(this.obtenerGeneros().contains(genero)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int sabenTocarInstrumento(String s) {
		int total = 0;
		for(ParticipanteReality p : miembros) {
			total+= p.sabenTocarInstrumento(s);
		}
		return total;
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

	
	
	

}
