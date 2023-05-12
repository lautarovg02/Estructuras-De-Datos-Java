package Ejercicio3;


public class Pila<T>{
	MySimpleLinkedList<T> pila;
	
	public Pila(){
		this.pila = new MySimpleLinkedList<T>();
	}
	
	public int indexOf(T info){
		Node<T> aux = pila.getFirst();
		int index = pila.getIndex();
		while(aux.getInfo() != info && index > 0) {
			aux = aux.getNext();
			index--;
		}
		if(aux.getInfo() != info) {
			return -1;
		}else {
			return pila.getIndex();
		}
	}
	
	public void push(T info) {// 0(1)
		pila.insertFront(info);
	}
	
	public T pop() {// 0(1)
		return pila.extractFront();
	}
	
	public void reverse() {
		/*T elemento;
		T[] array = (T[]) new Object[pila.getSize()];
		for(int i = 0; (elemento = this.pop()) != null; i++) {
			array[i] = elemento;
		}
		
		for(int i = 0; i < array.length; i++) {
			this.push(array[i]);
		}*/
		
		MySimpleLinkedList<T> inverseStack = new MySimpleLinkedList<T>();
	        while (!pila.isEmpty()) {
	            T value = pila.extractFront();
	            inverseStack.insertFront(value);
	        }
	        pila = inverseStack;
	    
	}
	
	@Override
	public String toString() {
		return " " + pila; 
	}
	
	public T top() {
		return pila.get(0);
	}
}
