package Ejercicio8;


/*Considerando la implementación de Lista del ejercicio 1, realice una Lista doblemente
vinculada.*/
public class Ejercicio8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDoubleLinkedList<Integer> list1 = new MyDoubleLinkedList<Integer>();
		list1.insertFront(1);
		list1.insertFront(2);
		list1.insertFront(3);
	
		System.out.println(list1);
		
		MyIterator<Integer> it1 = (MyIterator<Integer>) list1.iterator();
		while(it1.hasNext()) {
			System.out.println("El nodo: " + it1.getInfo() );
			it1.avanzar();
		}
		list1.insertLast(12);
		
		
		System.out.println("previo " + list1.getLast());
		System.out.println(list1);

	}
}
