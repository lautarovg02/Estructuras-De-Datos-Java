package Ejercicio1;

import java.util.LinkedList;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySimpleLinkedList<Integer> lista = new MySimpleLinkedList<Integer>();
	
		
		lista.insertFront(1134);
		lista.insertFront(22);
		lista.insertFront(324);
		lista.insertFront(437);
		
		System.out.println(lista.extractFront());
		System.out.println(lista.isEmpty());
		System.out.println(lista.getSize());
		System.out.println(lista.toString());
		System.out.println(lista.get(2));//Seria equivalemte a esto lista[i]
	}

}
