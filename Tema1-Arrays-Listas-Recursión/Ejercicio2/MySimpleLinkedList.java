package Ejercicio2;

import Ejercicio3.Node;

public class MySimpleLinkedList<T> {
	
	protected Node<T> first;
	protected int size;
	protected int index;
	
	public MySimpleLinkedList(){
		this.first = null;
		this.size = 0;
		this.index = -1;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size++;
		this.index++;
	}
	
	public Node<T> getFirst(){
		return this.first;
	}
	
	//elimina el primero y lo retorna
	public T extractFront() {		
		//guardo el primero
		T tmp = this.first.getInfo();
		if(this.first == null ) {
			//al que le seguia al primer nodo, lo convierto en el primero
			this.first = this.first.getNext();
			//descontamis uno del tamno ya que corremos un nodo 
			this.size--;
			this.index--;
		}
		//Retornamos la info del nodo que broramos
		return tmp;
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
	
}
