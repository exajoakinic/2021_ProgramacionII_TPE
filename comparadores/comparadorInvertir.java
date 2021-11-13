package trabajoPracticoEspecial.comparadores;

import java.util.Comparator;

import trabajoPracticoEspecial.ParticipanteReality;

public class comparadorInvertir  implements Comparator<ParticipanteReality> {
	private Comparator<ParticipanteReality> c;
	
	public comparadorInvertir(Comparator<ParticipanteReality> c) {
		super();
		this.c = c;
	}

	@Override
	public int compare(ParticipanteReality p1, ParticipanteReality p2) {
		return (c.compare(p1, p2) * (-1));
	}

}
