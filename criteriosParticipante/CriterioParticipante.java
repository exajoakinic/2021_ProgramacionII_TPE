package trabajoPracticoEspecial.criteriosParticipante;

import trabajoPracticoEspecial.ParticipanteReality;

//PREGUNTAR FRANCO SI ES MEJOR CLASE ABSTRACTA O INTERFAZ
//DEJAR COMO INERFAZ
public interface CriterioParticipante {
	boolean cumple(ParticipanteReality participante);
}
