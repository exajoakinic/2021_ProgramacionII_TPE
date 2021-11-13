package trabajoPracticoEspecial.criteriosParticipante;

import trabajoPracticoEspecial.ParticipanteReality;

public class CriterioGenero implements CriterioParticipante {
	private String genero;
	
	public CriterioGenero(String genero) {
		super();
		this.genero = genero;
	}

	@Override
	public boolean cumple(ParticipanteReality participante) {
		return participante.prefiereGenero(genero);
	}

}
