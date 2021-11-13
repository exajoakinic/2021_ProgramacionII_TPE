package trabajoPracticoEspecial.criteriosParticipante;

import trabajoPracticoEspecial.ParticipanteReality;

public class CriterioIdioma implements CriterioParticipante {
	private String idioma;
	
	public CriterioIdioma(String idioma) {
		super();
		this.idioma = idioma;
	}

	@Override
	public boolean cumple(ParticipanteReality participante) {
		return participante.conoceIdioma(idioma);
	}

}
