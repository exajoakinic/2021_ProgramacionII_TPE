package trabajoPracticoEspecial.criteriosParticipante;

import trabajoPracticoEspecial.ParticipanteReality;

public class CriterioInstrumento implements CriterioParticipante {
	
	private String instrumento;
	
	
	public CriterioInstrumento(String instrumento) {
		super();
		this.instrumento = instrumento;
	}



	@Override
	public boolean cumple(ParticipanteReality p) {
		
		return p.tocaInstrumento(instrumento);
	}

}
