package trabajoPracticoEspecial;

public class TemaMusicalFinal extends TemaMusical {
	private int cantidadMiembrosTocanInstrumento;
	
	
	public TemaMusicalFinal(String titulo, String idioma, String genero, int cantidadMiembrosTocanInstrumento) {
		super(titulo, idioma, genero);
		this.cantidadMiembrosTocanInstrumento = cantidadMiembrosTocanInstrumento;
	}

	
	public int getCantidadMiembrosTocanInstrumento() {
		return cantidadMiembrosTocanInstrumento;
	}
	public void setCantidadMiembrosTocanInstrumento(int cantidadMiembrosTocanInstrumento) {
		this.cantidadMiembrosTocanInstrumento = cantidadMiembrosTocanInstrumento;
	}


	@Override
	public boolean aceptaParticipante(ParticipanteReality p) {
		boolean res = super.aceptaParticipante(p);
		if (res)
		{
			for (String instrumento: this.getInstrumentos())
				if (p.cantidadMiembrosTocanInstrumento(instrumento) >= cantidadMiembrosTocanInstrumento)
					return true;
		}
		return false;
	}

}
