package trabajoPracticoEspecial;
import java.util.ArrayList;

import trabajoPracticoEspecial.criteriosParticipante.CriterioParticipante;

public class Reality {
	private ArrayList<Coach> coaches;
	private ArrayList<Participante> participantes;
	private ArrayList<TemaMusical> temas;
	
	
	
	public Reality() {
		coaches = new ArrayList<>();
		participantes = new ArrayList<>();
		temas = new ArrayList<>();
	}

	//Ver Preguntar Franco, equals Coach, si ponemos nombre al Coach o alguna forma de diferenciarlos
	public void addCoach(Coach coach) {
		//Ver si preguntamos por el contains, definiendo el equals en Coach
		//atributo nombre para hacer el equals.
		coaches.add(coach);
	}
	
	public void addParticipante(Participante participante) {
		if (!participantes.contains(participante))
			participantes.add(participante);
	}

	public void addTemaMusical(TemaMusical tema) {
		if (!temas.contains(tema))
			temas.add(tema);
	}

	/* PREGUNTAR FRANCO SI DEBEMOS RECORRER TODOS LOS COACH O HACERLO PARA UNO SOLO
	 * SI SON TODOS, CÓMO SABER QUÉ COACH TIENE CADA PARTICIPANTE
	 * */
	public ArrayList<Participante> listarParticipantes(CriterioParticipante criterio) {
		//ESTO ES RARO, CHARLAR CON FRANCO
		//if (!coaches.contains(coach)) //no está implementado el c
		//		return new ArrayList<Participante>();
		
		//VER CON LAU, ESTO LO HICE YO, ojo q listarParticipantes de coach no debe devolverme null
		ArrayList<Participante> resultado = new ArrayList<>();
		for (Coach coach: coaches) {
			resultado.addAll(coach.listarParticipantes(criterio));
		}
		return resultado;
	}
}
