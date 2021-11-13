package trabajoPracticoEspecial.criteriosParticipante;
import trabajoPracticoEspecial.ParticipanteReality;
import trabajoPracticoEspecial.TemaMusical;

public class CriterioTemaMusical implements CriterioParticipante {
	
	private TemaMusical tema;
	
	public CriterioTemaMusical(TemaMusical tema) {
		super();
		this.tema = tema;
	}

	@Override
	public boolean cumple(ParticipanteReality p) {
		
		return tema.aceptaParticipante(p);
	}
}
