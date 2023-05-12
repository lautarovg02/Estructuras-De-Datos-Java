package Ejercicio4;

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
	
	public void push(T info) {
		pila.insertFront(info);
	}
	
	public T pop() {
		return pila.extractFront();
	}
	
	public void reverse() {
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
		return pila.getInfo();
	}
}
