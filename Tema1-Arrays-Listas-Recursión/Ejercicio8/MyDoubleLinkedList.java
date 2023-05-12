package Ejercicio8;

import java.util.Iterator;

public class MyDoubleLinkedList<T> implements Iterable<T> {

	private Node<T> first;
	private Node<T> last;
	private int size;

	public MyDoubleLinkedList() {
		this.setFirst(null);
		this.setLast(null);
		this.setSize(0);
	}

	/*
	 * public void insertInOrder(T info) { boolean insertado = false;
	 * 
	 * 
	 * 
	 * if(this.first != null) { Node<T> aux = this.first; Node<T> temp;
	 * 
	 * if((int) aux.getInfo() > (int) info ) { Node<T> primero = new Node<T>(info,
	 * aux, primero); this.first = primero; aux = this.first; } // 3 //2 < 3 > 10 14
	 * while( aux.getNext() != null && (int) aux.getInfo() < (int) info &&
	 * !insertado) { temp = aux; aux = aux.getNext(); //2 3 4 //
	 * System.out.println(aux); if(aux.getNext() != null && (int) aux.getInfo() <=
	 * (int)info && (int) aux.getNext().getInfo() >(int)info) { Node<T> nuevo = new
	 * Node<T>(info,aux.getNext()); aux.setNext(nuevo); insertado = true; }else
	 * if(temp.getNext() != null &&(int) aux.getInfo() >(int)info ) { Node<T> nuevo
	 * = new Node<T>(info,aux); temp.setNext(nuevo); aux = temp; insertado = true;
	 * 
	 * } }
	 * 
	 * if(aux.getNext() == null ) { aux.setNext(new Node<T>(info,null)); }
	 * 
	 * }else { insertFront(info); }
	 * 
	 * }
	 */
	public void insertFront(T info) {
		Node<T> nuevo = new Node<T>(info, null, null);
		if (this.isEmpty()) {
			this.first = nuevo; //
			this.last = this.first;
		} else {
			nuevo.setNext(first);
			this.first.setLast(nuevo);
			this.last = this.first;
			this.first = nuevo;
		}
		this.size++;
	}

	public void insertLast(T info) {
		Node<T> tmp = new Node<T>(info, null, null);
		if (this.isEmpty()) {
			tmp.setNext(tmp);
			this.first = tmp;

		} else {
			this.last.setNext(tmp);
			this.last = tmp;
			this.size++;
		}
	}

	public void setFirst(Node<T> first) {
		this.first = first;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean buscar(T info, MyDoubleLinkedList<T> list) {
		MyIterator<T> i1 = (MyIterator<T>) list.iterator();
		boolean esIgual = false;

		while (!esIgual && i1.hasNext()) {
			if (i1.next().equals(info)) {
				return true;
			}
		}

		return esIgual;
	}

	public Node<T> getLast() {
		return this.last;
	}

	public void setLast(Node<T> last) {
		this.last = last;
	}

	// elimina el primero y lo retorna
	public T extractFront() {
		// guardo el primero
		T tmp;
		if (this.first != null) {
			tmp = this.first.getInfo();
			// al que le seguia al primer nodo, lo convierto en el primero
			this.first = this.first.getNext();
			// descontamis uno del tamno ya que corremos un nodo
			this.size--;
		} else {
			return null;
		}
		// Retornamos la info del nodo que broramos
		return tmp;
	}

	public T extractLast() {
		// guardo el primero
		T temp;
		if (this.last != null) {
			temp = this.last.getInfo();
			// al que le seguia al primer nodo, lo convierto en el primero
			this.last = this.last.getLast();
			// descontamis uno del tamno ya que corremos un nodo
			this.size--;
		} else {
			return null;
		}
		// Retornamos la info del nodo que broramos
		return temp;
	}

	public Node<T> getFirst() {
		return this.first;
	}

	public T getInfo() {
		return this.first.getInfo();
	}

	public boolean isEmpty() {
		return (this.first == null);
	}

	public T get(int index) {
		// mietras contador sea igual a i = retorno la info
		if ((-1 < index) && (index < this.getSize())) {
			int cont = 0;
			Node<T> aux = this.first;
			while (cont < index) {
				aux = aux.getNext();
				cont++;
			}
			return aux.getInfo();
		} else {
			return null;
		}
	}

	public int getSize() {
		return this.size;
	}

	@Override
	public String toString() {
		return "[ Nodos:  " + this.first + "]";
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>(this.first);
	}
}