package trabajoPracticoEspecial;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import trabajoPracticoEspecial.criteriosParticipante.CriterioParticipante;

public class Coach {
	ArrayList<ParticipanteReality> equipoPropio;
	private Comparator<ParticipanteReality> criterioBatalla;
	
	public Coach() {
		equipoPropio = new ArrayList<>();
	}

	public void agregarMiembro(ParticipanteReality p) {
		if (!equipoPropio.contains(p))
			equipoPropio.add(p);
	}

	public void setCriterioBatalla(Comparator<ParticipanteReality> criterioBatalla) {
		this.criterioBatalla = criterioBatalla;
	}
	
	//DEVOLVER TODOS LOS INSTRUMENTOS DEL EQUIPO SIN REPETICIÓN
	public ArrayList<String> obtenerInstrumentos() {
		ArrayList<String> resultado = new ArrayList<>();
		for (ParticipanteReality participante:equipoPropio) {
			ArrayList<String> instrumentosParticipante = participante.obtenerInstrumentos();
			for (String instrumento:instrumentosParticipante)
				if (!resultado.contains(instrumento))
					resultado.add(instrumento);
			//investigar lista sin repetidos hashset
			//HashSet<String> hset = new HashSet<>();
			//resultado = new ArrayList<String>(hset);
		}
		
		
		return resultado;
	}

	//DEVOLVER TODOS LOS IDIOMAS DEL EQUIPO SIN REPETICIÓN
	public ArrayList<String> obtenerIdiomas() {
		ArrayList<String> idiomas = new ArrayList<>();
		for (ParticipanteReality participante:equipoPropio) {
			ArrayList<String> idiomasParticipante = participante.obtenerIdiomas();
			for (String idioma:idiomasParticipante)
				if (!idiomas.contains(idioma))
					idiomas.add(idioma);
		}
		return idiomas;
	}

	//DEVOLVER TODOS LOS GENEROS DEL EQUIPO SIN REPETICIÓN Y ORDENADO AZ
	public ArrayList<String> obtenerGeneros() {
		ArrayList<String> generos = new ArrayList<>();
		for (ParticipanteReality participante:equipoPropio) {
			ArrayList<String> generosParticipante = participante.obtenerGeneros();
			for (String genero:generosParticipante) {
				if (!generos.contains(genero)) {
					generos.add(genero);
				}
			}
		}
		Collections.sort(generos);
		return generos;
	}


	//DEVOLVER PROMEDIO DE EDAD DEL EQUIPO
	public double obtenerPromedioEdadEquipo() {
		if (equipoPropio.isEmpty()) {
			return 0;  //VER, PREGUNTAR FRANCO: dio el OK, pero hay q tener cuidado afuera cómo lo tomamos. Lo mismo si ponemos null
		}
		
		double sumaEdades = 0;
		double cantMiembros = 0;
		for (ParticipanteReality participante:equipoPropio) {
			
			sumaEdades += participante.getSumaEdadesIndividuales();
			cantMiembros += participante.getTotalMiembrosIndividuales();
		}
		
		return (double) (sumaEdades / cantMiembros); 
	}

	public ArrayList<ParticipanteReality> listarParticipantes(CriterioParticipante criterio) {
		ArrayList<ParticipanteReality> resultado = new ArrayList<ParticipanteReality>();
		for (ParticipanteReality participante:equipoPropio)
				resultado.addAll(participante.listarParticipantes(criterio));
		return resultado;
	}
	
	public ArrayList<ParticipanteReality> listarMiembrosMasPreparados() {
		ArrayList<ParticipanteReality> res = new ArrayList<ParticipanteReality>(equipoPropio);
		
		Collections.sort(res, this.criterioBatalla);
		
		return res;
	}

}