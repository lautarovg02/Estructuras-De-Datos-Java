package Ejercicio1;
/*Ejercicio 1.
Implemente los métodos indicados del esqueleto de Lista desarrollado en Teoría
(insertFront, extractFront, isEmpty, size, toString). Agregar también el método: T get(index)*/
public class MySimpleLinkedList<T> {
	
	private Node<T> first;
	private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size++;
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
		}
		//Retornamos la info del nodo que broramos
		return tmp;
	}

	public boolean isEmpty() {
		return (this.first == null);
	}
	
	public T get(int index) {
		//mietras contador sea igual a i = retorno la info
		while(this.getSize() != index ) {
			this.first = this.first.getNext();
			this.size--;
		}
		return this.first.getInfo();
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
		return "Nodo " + first + " pos " + size + " ";
	}
	
}
