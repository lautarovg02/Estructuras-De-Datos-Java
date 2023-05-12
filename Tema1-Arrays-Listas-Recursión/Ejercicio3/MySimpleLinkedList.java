package Ejercicio3;

public class MySimpleLinkedList<T> {
	
	private  Node<T> first;
	private int size;
	private int index;

	public MySimpleLinkedList(){
		this.first = null;
		this.size = 0;
		this.index = -1;
	}
	
	
	
	public int getIndex() {
		return this.index;
	}
	
	public void insertFront(T info) {
	/* se crea un nuevo nodo y se le asigna 
	 * como siguiente nodo la antigua cima de la pila.*/
		Node<T> tmp = new Node<T>(info,first);
		//tmp.setNext(this.top);
		this.first = tmp;
		this.size++;
		this.index++;
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
			this.index--;
		}else {
			return null;
		}
		//Retornamos la info del nodo que broramos
		return tmp;
	}
	
	public Node<T> getFirst(){
		return this.first;
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
	
}
