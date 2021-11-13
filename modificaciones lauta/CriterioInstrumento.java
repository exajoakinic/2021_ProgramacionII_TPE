
public class CriterioInstrumento extends Criterio {
	
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
