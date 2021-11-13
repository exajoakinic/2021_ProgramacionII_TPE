package trabajoPracticoEspecial;

import trabajoPracticoEspecial.criteriosParticipante.CriterioParticipante;

public class CoachExigente extends Coach {
	private CriterioParticipante criterioAceptacion;

	public CoachExigente(CriterioParticipante criterioAceptacion) {
		super();
		this.criterioAceptacion = criterioAceptacion;
	}

	public void setCriterioAceptacion(CriterioParticipante criterioAceptacion) {
		this.criterioAceptacion = criterioAceptacion;
	}
	
	@Override
	public void agregarMiembro(ParticipanteReality p) {
		if (criterioAceptacion.cumple(p))
			super.agregarMiembro(p);
	}

}
