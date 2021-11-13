package trabajoPracticoEspecial;
import java.util.ArrayList;
import java.util.Comparator;

import trabajoPracticoEspecial.criteriosParticipante.CriterioParticipante;

public class Reality {
	private ArrayList<Coach> coaches;
	private ArrayList<ParticipanteReality> participantes;
	private ArrayList<TemaMusical> temas;
	private Comparator<ParticipanteReality> criterioBatalla;
	
	
	public Reality(Comparator<ParticipanteReality> criterioBatalla) {
		coaches = new ArrayList<>();
		participantes = new ArrayList<>();
		temas = new ArrayList<>();
		this.criterioBatalla = criterioBatalla;
	}

	//Ver Preguntar Franco, equals Coach, si ponemos nombre al Coach o alguna forma de diferenciarlos
	public void addCoach(Coach coach) {
		//Ver si preguntamos por el contains, definiendo el equals en Coach
		//atributo nombre para hacer el equals.
		coach.setCriterioBatalla(criterioBatalla);
		coaches.add(coach);
	}
	
	public void setCriterioBatalla(Comparator<ParticipanteReality> criterioBatalla) {
		this.criterioBatalla = criterioBatalla;
		
		for (Coach coach: coaches)
			coach.setCriterioBatalla(criterioBatalla);
	}

	public void addParticipante(ParticipanteReality participante) {
		if (!participantes.contains(participante))
			participantes.add(participante);
	}

	public void addTemaMusical(TemaMusical tema) {
		if (!temas.contains(tema))
			temas.add(tema);
	}
	
	public ParticipanteReality batalla(ParticipanteReality p1, ParticipanteReality p2) {
		int res = criterioBatalla.compare(p1, p2);
		if (res == 1)
			return p1;
		if (res == -1)
			return p2;
		return null;
	}
	
	/* PREGUNTAR FRANCO SI DEBEMOS RECORRER TODOS LOS COACH O HACERLO PARA UNO SOLO
	 * SI SON TODOS, CÓMO SABER QUÉ COACH TIENE CADA PARTICIPANTE
	 * */
	public ArrayList<ParticipanteReality> listarParticipantes(CriterioParticipante criterio) {
		//ESTO ES RARO, CHARLAR CON FRANCO
		//if (!coaches.contains(coach)) //no está implementado el c
		//		return new ArrayList<Participante>();
		
		//VER CON LAU, ESTO LO HICE YO, ojo q listarParticipantes de coach no debe devolverme null
		ArrayList<ParticipanteReality> resultado = new ArrayList<>();
		for (Coach coach: coaches) {
			resultado.addAll(coach.listarParticipantes(criterio));
		}
		return resultado;
	}
}
