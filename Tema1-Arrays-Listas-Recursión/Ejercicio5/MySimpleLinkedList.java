package Ejercicio5;

import java.util.Iterator;

public class MySimpleLinkedList<T> implements Iterable<T>{
	private Node<T> first;
	private int size;
	//private Node<T> cursor;
	
	
	public MySimpleLinkedList(){
		this.first = null;
		this.size = 0;
		//this.cursor = null;
	}
	
	/*public void iniciarCursor() {
		this.cursor = this.first;
	}
	
	public T obtenerInfoCursor() {
		return this.cursor.getInfo();
	}
	
	public void avanzarCursor() {
		this.cursor = this.cursor.getNext();
	}*/
	
	
	
	public void insertFront(T info) {
	/* se crea un nuevo nodo y se le asigna 
	 * como siguiente nodo la antigua cima de la pila.*/
		Node<T> tmp = new Node<T>(info,first);
		//tmp.setNext(this.top);
		this.first = tmp;
		this.size++;
	}
	
	
	
	//elimina el primero y lo retorna
	public T extractFront() {		
		//guardo el primero
		T tmp;
		if(this.first != null ) {
			tmp =  this.first.getInfo();
			//al que le seguia al primer nodo, lo convierto en el primero
			this.first = this.first.getNext();
			//descontamis uno del tamno ya que corremos un nodo 
			this.size--;
		}else {
			return null;
		}
		//Retornamos la info del nodo que broramos
		return tmp;
	}
	
	public Node<T> getFirst(){
		return this.first;
	}
	
	public T getInfo() {
		return this.first.getInfo();
	}

	public boolean isEmpty() {
		return (this.first == null);
	}
	
	public T get(int index) {
		//mietras contador sea igual a i = retorno la info
		if((-1 < index) && (index < this.getSize()) ) {
			int cont = 0;
			Node<T> aux = this.first;
			while(cont < index) {
				aux = aux.getNext();
				cont++;
			}
			return aux.getInfo();
		}else{
			return null;
		}
	}
	
	
	public int getSize() {
		/*
		//0(n)donde n es la cantidad de nodos de la lista
		//devuelve el tamaño de la lista
		int size = 0;
		////agarro el primero
		Node<T> cursor = this.first;
		//mientras no sea null significa que cursor esta parado en un nodo valido 
		while(cursor.getNext() != null) {
			//Avanzoo
			cursor = cursor.getNext();
			//Aumento el tamno
			size++;
		}*/
		return this.size;
	}
	
	@Override
	public String toString() {
		return "[ Nodos:  " +  this.first + "]" ;
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>(this.first);
	}
}