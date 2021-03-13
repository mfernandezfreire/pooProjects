public class Moderador extends Usuarios{
	private int papelera;
	
	public Moderador() {
	}
	
	public Moderador(int mensajes, String correo, String nick, int papelera) {
		super(mensajes,correo,nick);
		this.setPapelera(papelera);
	}

	public int getPapelera() {
		return papelera;
	}

	public void setPapelera(int papelera) {
		this.papelera = papelera;
	}
	
	public void papeleraInc() {
		this.setPapelera(this.getMensajes() + 1);
	}
}
