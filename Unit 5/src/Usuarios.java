public class Usuarios {
	private int mensajes;
	private String correo;
	private String nick;
	
	public Usuarios() {
	}
	
	public Usuarios(int mensajes, String correo, String nick) {
		this.setMensajes(mensajes);
		this.setCorreo(correo);
		this.setNick(nick);
	}
	
	public int getMensajes() {
		return mensajes;
	}
	public void setMensajes(int mensajes) {
		this.mensajes = mensajes;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public void incrementa(){		
		this.setMensajes(this.getMensajes() + 1);
	}
	
	public void decrementa() {
		this.setMensajes(this.getMensajes() - 1);
	}
	
	public void modificaCorreo(String correo) {
		this.setCorreo(correo);
	}

}
