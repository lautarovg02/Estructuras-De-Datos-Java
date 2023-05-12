package Ejercicio6_B;

import java.util.Iterator;

public class MySimpleLinkedList<T> implements Iterable<T>{
	
	private Node<T> first;
	private int size;
	
	
	public MySimpleLinkedList(){
		this.first = null;
		this.size = 0;	
	}
	
	
	public void insertInOrder(T info) {
		boolean insertado = false;
		
		
		
		if(this.first != null) {
			Node<T> aux = this.first;
			Node<T> temp;
		
			if((int) aux.getInfo() > (int) info ) {
				Node<T> primero = new Node<T>(info, aux);
				this.first = primero;
				aux = this.first;
			}
			
			
			while( aux.getNext() != null && (int) aux.getInfo() < (int) info && !insertado) {
				temp = aux; // temp = 1
				aux = aux.getNext(); // aux = 4
				
				if(aux.getNext() != null && (int) aux.getInfo() <= (int)info  && (int) aux.getNext().getInfo() >(int)info) {
					Node<T> nuevo = new Node<T>(info,aux.getNext());
					aux.setNext(nuevo);
					insertado = true;
				}else if(temp.getNext() != null &&(int) aux.getInfo() >(int)info ) {
					Node<T> nuevo = new Node<T>(info,aux); 
					temp.setNext(nuevo); 
					aux = temp;
					insertado = true;
					
				}
			}
	
			//LLEGASTE A LO ULTIMO
			if(aux.getNext() == null  ) {
				aux.setNext(new Node<T>(info,null));
			}
			
		}else {
			insertFront(info);
		}
		
	}
	public void insertFront(T info) {
	/* se crea un nuevo nodo y se le asigna 
	 * como siguiente nodo la antigua cima de la pila.*/
		Node<T> tmp = new Node<T>(info,first);
		//tmp.setNext(this.top);
		this.first = tmp;
		this.size++;
	}
	
	public boolean buscar(T info, MySimpleLinkedList<T> list) {
		MyIterator<T> i1 = (MyIterator<T>) list.iterator();
		boolean esIgual = false;
		
		while(!esIgual && i1.hasNext()) {
			if(i1.next().equals(info)) {
				return true;
			}
		}
		
		return esIgual;
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