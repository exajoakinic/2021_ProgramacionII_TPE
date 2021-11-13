
public class CriterioTemaFinal extends Criterio {
	
	private TemaMusical tema;
	private int cantidadParticipantesRequeridos;
	
	

	public CriterioTemaFinal(TemaMusical tema, int cantidadParticipantesRequeridos) {
		super();
		this.tema = tema;
		this.cantidadParticipantesRequeridos = cantidadParticipantesRequeridos;
	}



	@Override
	public boolean cumple(ParticipanteReality p) {
		
		return p.tocaTema(tema,cantidadParticipantesRequeridos);
	}

}
