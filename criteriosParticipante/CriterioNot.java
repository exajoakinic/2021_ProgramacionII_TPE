package trabajoPracticoEspecial.criteriosParticipante;

import trabajoPracticoEspecial.ParticipanteReality;

public class CriterioNot implements CriterioParticipante {
	private CriterioParticipante c1;
	
	public CriterioNot(CriterioParticipante c1) {
		this.c1 = c1;
	}

	@Override
	public boolean cumple(ParticipanteReality participante) {
		return (!c1.cumple(participante));
	}

}
