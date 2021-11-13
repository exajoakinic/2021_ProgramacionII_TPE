package trabajoPracticoEspecial.criteriosParticipante;

import trabajoPracticoEspecial.ParticipanteReality;

public class CriterioOr implements CriterioParticipante {
	private CriterioParticipante c1, c2;
	
	public CriterioOr(CriterioParticipante c1, CriterioParticipante c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(ParticipanteReality participante) {
		return (c1.cumple(participante) || c2.cumple(participante));
	}

}
