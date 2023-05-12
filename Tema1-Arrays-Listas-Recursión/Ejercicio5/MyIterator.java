package Ejercicio5;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

	Node<T> cursor;
	
	public MyIterator(Node<T> first){
		this.cursor = first;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.cursor != null;
	}

	@Override
	public T next() {
		T info = this.cursor.getInfo();
		this.cursor = this.cursor.getNext();
		return info;
	}

}
