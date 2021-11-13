package trabajoPracticoEspecial;

import java.util.ArrayList;
import trabajoPracticoEspecial.criteriosParticipante.CriterioParticipante;


public class ParticipanteCompuesto extends ParticipanteReality {
	
	private ArrayList<ParticipanteReality> miembros;

	public ParticipanteCompuesto(String nombre) {
		super(nombre);
		this.miembros = new ArrayList<>();
	}

	@Override
	public int getSumaEdadesIndividuales() { // ver posibilidad de contar subgrupo como miembro para el promedio
		int edad = 0;
		for(ParticipanteReality p : miembros) {
			edad+= p.getSumaEdadesIndividuales();
		}
		return edad;
	}

	@Override
	public int getTotalMiembrosIndividuales() {
		int total = 0;
		for(ParticipanteReality p : miembros) {
			total+= p.getTotalMiembrosIndividuales();
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
	public ArrayList<ParticipanteReality> listarParticipantes(CriterioParticipante c) {
		ArrayList<ParticipanteReality> resultado = new ArrayList<>();
		if(c.cumple(this)) {
			resultado.add(this);
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
	public int cantidadMiembrosTocanInstrumento(String s) {
		int total = 0;
		for(ParticipanteReality p : miembros) {
			total+= p.cantidadMiembrosTocanInstrumento(s);
		}
		return total;
	}
}
