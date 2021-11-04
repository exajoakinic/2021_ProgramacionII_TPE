package trabajoPracticoEspecial;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import trabajoPracticoEspecial.criteriosParticipante.CriterioParticipante;

public class Coach {
	ArrayList<Participante> equipoPropio;
	
	public Coach() {
		equipoPropio = new ArrayList<>();
	}


	//DEVOLVER TODOS LOS INSTRUMENTOS DEL EQUIPO SIN REPETICIÓN
	public ArrayList<String> obtenerInstrumentos() {
		ArrayList<String> resultado = new ArrayList<>();
		for (Participante participante:equipoPropio) {
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
		for (Participante participante:equipoPropio) {
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
		for (Participante participante:equipoPropio) {
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
		for (Participante participante:equipoPropio) {
			sumaEdades += participante.getEdad();
		}
		
		return (double) (sumaEdades / equipoPropio.size()); 
	}

	public ArrayList<Participante> listarParticipantes(CriterioParticipante criterio) {
		ArrayList<Participante> resultado = new ArrayList<Participante>();
		for (Participante participante:equipoPropio)
			if (criterio.cumple(participante))
				resultado.add(participante);
		return resultado;
	}

}