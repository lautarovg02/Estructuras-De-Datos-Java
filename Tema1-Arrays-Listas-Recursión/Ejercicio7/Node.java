package Ejercicio7;
/*Escriba una funci�n que dadas dos listas construya otra con los elementos que est�n en la
primera pero no en la segunda.*/

public class Node<T> {
	private T info;
	private Node<T> next;

	public Node() {
		this.info = null;
		this.next = null;
	}
	
	public Node(T info, Node<T> next) {
		this.setInfo(info);
		this.setNext(next);
	}
	
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	@Override
	public String toString() {
		if(this.info != null && this.next != null) {
			return "\n{" + this.getInfo() + "} " + this.getNext();
		}else if(this.info != null) {
			return "\n{" + this.getInfo() + "}" ;
		}else {
			return " }";
		}
		
	}
}
