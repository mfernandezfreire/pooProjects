public class Administrador extends Usuarios {
	private int papelera;
	private int baneo;
	
	public Administrador() {
	}
	
	public Administrador(int mensajes, String correo, String nick, int papelera, int baneo) {
		super(mensajes, correo, nick);
		this.setPapelera(papelera);
		this.setBaneo(baneo);
	}

	public int getPapelera() {
		return papelera;
	}

	public void setPapelera(int papelera) {
		this.papelera = papelera;
	}

	public int getBaneo() {
		return baneo;
	}

	public void setBaneo(int baneo) {
		this.baneo = baneo;
	}
	
	public void papeleraInc() {
		this.setPapelera(this.getMensajes() + 1);
	}
	
	public void baneosInc() {
		this.setBaneo(this.getBaneo() + 1);
	}

}
