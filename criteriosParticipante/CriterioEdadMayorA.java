package trabajoPracticoEspecial.criteriosParticipante;

import trabajoPracticoEspecial.ParticipanteReality;

public class CriterioEdadMayorA implements CriterioParticipante {
	private int edad;
	
	public CriterioEdadMayorA(int edad) {
		super();
		this.edad = edad;
	}

	@Override
	public boolean cumple(ParticipanteReality participante) {
		return (participante.getEdad() > edad);
	}

}
