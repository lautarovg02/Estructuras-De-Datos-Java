package Ejercicio8;

public class Node<T> {
	private T info;
	private Node<T> next;
	private Node<T> last;

	public Node() {
		this.info = null;
		this.next = null;
		this.last = null;
	}
	
	public Node(T info, Node<T> next, Node<T> last) {
		this.setInfo(info);
		this.setNext(next);
		this.setLast(last);
	}
	
	 public void setLast(Node<T> last) {
		this.last = last;
	}

	public Node<T> getNext() {
		return next;
	}

	public Node<T> getLast() {
		return last;
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
