package Ejercicio6_B;

/*Escriba un procedimiento que dadas dos listas construya otra con los elementos comunes,
suponiendo que: 
b) Las listas están ordenadas y la lista resultante debe mantenerse ordenada.*/
public class Ejercicio6_B {
	public static void main(String[]args) {
		//Creando MySimpleLinkedLists
		boolean noAvanzar = false;
		MySimpleLinkedList<Integer> list1 = new MySimpleLinkedList<Integer>();
		MySimpleLinkedList<Integer> list2 = new MySimpleLinkedList<Integer>();
		
		// Insertando ordenado 
		list1.insertInOrder(1);
		list1.insertInOrder(4);
		list1.insertInOrder(8);
		list1.insertInOrder(3);
		list1.insertInOrder(31);
		list1.insertInOrder(14);
		list1.insertInOrder(9);
		
		list2.insertInOrder(11);
		list2.insertInOrder(4);
		list2.insertInOrder(8);
		list2.insertInOrder(3);
		list2.insertInOrder(21);
		list2.insertInOrder(18);
		list2.insertInOrder(9);
		list2.insertInOrder(3);
		
		
		//Mostramos las dos listas ya ordenadas
		System.out.println(list1);
		System.out.println(list2);
		 
		//Creamos los iteradores para cada lista
		MyIterator<Integer> it1 =  (MyIterator<Integer>) list1.iterator();
		MyIterator<Integer> it2 =  (MyIterator<Integer>)  list2.iterator();

		//Creamos la lista donde se van a guardar los datos en comun
		MySimpleLinkedList<Integer> list3 = new MySimpleLinkedList<Integer>();
		System.out.println("Hay numeros en comun?");
		// 1 4 5 6 8 9 LISTA 1
		// 1 2 3 8 10 12 LISTA 2
		
		while(it1.hasNext() && it2.hasNext()  ) {
			// Si el valor de iter2 es menor al de iter1, avanzo el iter2
			if((int) it2.getInfo() < (int) it1.getInfo() ) {
				it2.avanzar();
			}
			// Si el valor de iter1 es menor al de iter2, avanzo el iter2
			else if((int) it1.getInfo() < (int) it2.getInfo()) {
				it1.avanzar();
			}
			//// Si los valores son iguales, avanzo ambos
			else if((int) it1.getInfo() == (int) it2.getInfo()) {
				// Y agrego el valor a la solución
				list3.insertInOrder(it1.getInfo());	
				it1.avanzar();
				it2.avanzar();
			}
		}
		System.out.println(list3);	

	}
}
