package logico;

public class ListaEnlazada {
	Nodo head;
	
	public void add(String usuario, String time, char prio) {
		if(head == null) {
			head = new Nodo(usuario, time, prio);
		}else {
			Nodo current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new Nodo(usuario, time, prio);
		}
	}
}
