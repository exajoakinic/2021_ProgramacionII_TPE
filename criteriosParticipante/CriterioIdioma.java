package trabajoPracticoEspecial.criteriosParticipante;

import trabajoPracticoEspecial.Participante;

public class CriterioIdioma implements CriterioParticipante {
	private String idioma;
	
	public CriterioIdioma(String idioma) {
		super();
		this.idioma = idioma;
	}

	@Override
	public boolean cumple(Participante participante) {
		return participante.conoceIdioma(idioma);
	}

}
