package logico;

public class Parcial {
	Nodo head;
	public void print(char a) {//Esta funcion es la encargada de imprimir la lista completa de los usuarios añadidos a la lista
		Nodo current = head;
		while(current != null) {
			System.out.println(current);
			current = current.next;
		}
	}

	public char priority(char p) {
		if(p == 'H') {
			return 'H';
		}else if(p == 'M'){
			return 'M';
		}else if(p == 'L'){
			return 'L';
		}else
			return 'M';
	}

	public static void main(String[] args) {
		ListaEnlazada lista = new ListaEnlazada();
		lista.add("u1","t1",'M');
		lista.add("u2","t2",'H');
		lista.add("u3","t3",'L');
		
		lista.print();
	}


}
