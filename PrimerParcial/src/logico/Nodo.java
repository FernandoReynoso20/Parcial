package logico;

public class Nodo {
	String usuario;
	String time;
	char prio;
	Nodo next;
	

	public Nodo(String usuario, String time, char prio) {
		this.usuario = usuario;
		this.time = time;
		this.prio = prio;
		this.next = null;
	}

	
}
