package trabajoPracticoEspecial.criteriosParticipante;

import trabajoPracticoEspecial.Participante;

public class CriterioGenero implements CriterioParticipante {
	private String genero;
	
	public CriterioGenero(String genero) {
		super();
		this.genero = genero;
	}

	@Override
	public boolean cumple(Participante participante) {
		return participante.prefiereGenero(genero);
	}

}
