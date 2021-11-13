package trabajoPracticoEspecial.comparadores;

import java.util.Comparator;

import trabajoPracticoEspecial.ParticipanteReality;

public class comparadorCantidadIdiomas  implements Comparator<ParticipanteReality> {

	@Override
	public int compare(ParticipanteReality p1, ParticipanteReality p2) {
		int aux = (p1.obtenerInstrumentos().size() - p2.obtenerInstrumentos().size());
		if (aux > 0)
			return 1;
		if (aux < 0)
			return -1;
		return 0;
	}

}
