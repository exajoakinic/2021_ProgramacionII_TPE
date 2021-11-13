package trabajoPracticoEspecial.comparadores;

import java.util.Comparator;

import trabajoPracticoEspecial.ParticipanteReality;

public class comparadorCompuesto implements Comparator<ParticipanteReality> {
	private Comparator<ParticipanteReality> c1, c2;

	public comparadorCompuesto(Comparator<ParticipanteReality> c1, Comparator<ParticipanteReality> c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(ParticipanteReality o1, ParticipanteReality o2) {
		int res = c1.compare(o1, o2);
		if (res == 0)
			return c2.compare(o1, o2);
		return res;
	}
	
	
}
