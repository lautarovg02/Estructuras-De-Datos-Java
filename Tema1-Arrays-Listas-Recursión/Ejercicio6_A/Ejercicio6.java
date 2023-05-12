package Ejercicio6_A;
/*Escriba un procedimiento que dadas dos listas construya otra con los elementos comunes,
suponiendo que: 
a) Las listas están desordenadas y la lista resultante debe quedar ordenada.
b) Las listas están ordenadas y la lista resultante debe mantenerse ordenada.*/
public class Ejercicio6 {
	public static void main(String[]args) {
		MySimpleLinkedList<Integer> list1 = new MySimpleLinkedList<Integer>();
		MySimpleLinkedList<Integer> list2 = new MySimpleLinkedList<Integer>();
		
		list1.insertFront(1);
		list1.insertFront(4);
		list1.insertFront(8);
		list1.insertFront(3);
		
		list2.insertFront(11);
		list2.insertFront(4);
		list2.insertFront(8);
		list2.insertFront(3);
		
		
		System.out.println("Hay numeros en comun?");
		MySimpleLinkedList<Integer> list3 = new MySimpleLinkedList<Integer>();
		
		for(int e: list1){
			if(list1.buscar(e,list2)){
				list3.insertInOrder(e);
			}
		}
		System.out.println(list3);
	/*
		
		MySimpleLinkedList<Integer> list4 = new MySimpleLinkedList<Integer>();
	/*
		list4.insertInOrder(2);
		//System.out.println(list3);
		list4.insertInOrder(1);
		//System.out.println(list3);
		list4.insertInOrder(8);
		//System.out.println(list3);
		list4.insertInOrder(3); 
		//System.out.println(list3);
		list4.insertInOrder(6); 
		//System.out.println(list3);
		list4.insertInOrder(67); 
		list4.insertInOrder(4);
		list4.insertInOrder(4);
		list4.insertInOrder(14);
		System.out.println(list4);

	
		list3.insertInOrder(3);
		System.out.println(list3);
		list3.insertInOrder(11);
		System.out.println(list3);
		list3.insertInOrder(11);
	
		System.out.println(list3);
		list3.insertInOrder(12);
		System.out.println(list3);
		list3.insertInOrder(12);
		System.out.println(list3);
		list3.insertInOrder(18);
		System.out.println(list3);
		*/
	}
}
