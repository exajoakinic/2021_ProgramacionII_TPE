package trabajoPracticoEspecial.criteriosParticipante;

import trabajoPracticoEspecial.Participante;

public class CriterioAnd implements CriterioParticipante {
	private CriterioParticipante c1, c2;
	
	public CriterioAnd(CriterioParticipante c1, CriterioParticipante c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Participante participante) {
		return (c1.cumple(participante) && c2.cumple(participante));
	}

}
