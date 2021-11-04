package trabajoPracticoEspecial.criteriosParticipante;

import trabajoPracticoEspecial.Participante;

public class CriterioEdadMayorA implements CriterioParticipante {
	private int edad;
	
	public CriterioEdadMayorA(int edad) {
		super();
		this.edad = edad;
	}

	@Override
	public boolean cumple(Participante participante) {
		return (participante.getEdad() > edad);
	}

}
