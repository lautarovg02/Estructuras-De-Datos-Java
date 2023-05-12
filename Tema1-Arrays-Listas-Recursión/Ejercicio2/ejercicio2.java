package Ejercicio2;

import java.util.ArrayList;

/*Considerando la implementación de la Lista realizado en el ejercicio anterior,
comparar la complejidad computacional contra un array en las siguientes operaciones:
1.- Insertar al principio.
2.- Buscar un elemento en una posición.
3.- Determinar la cantidad de elementos.
*/

public class ejercicio2 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		MySimpleLinkedList<Integer> list = new MySimpleLinkedList<Integer>();
		
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		list.insertFront(1);
		list.insertFront(2);
		list.insertFront(3);
		list.insertFront(4);

		
		//1.- Insertar al principio.
		//Insertar al principio con ArrayList
		numbers.add(3, 1);//o(1)
		//Insertar al principio con LinkedList
		list.insertFront(1);//o(1)
		
		//2.- Buscar un elemento en una posición.
		//Buscar con ArrayList
		System.out.println(numbers.get(3));
		//Buscar con LinkedList
		System.out.println(list.get(3));
		
		//3.- Determinar la cantidad de elementos.
		//Con ArrayList
		System.out.println("Cantidad de elementos lista: " + numbers.size());
		//Con LinkedList
		System.out.println("Cantidad de elementos LinkedList: " + list.getSize());
		
		
		
		
	}
}
